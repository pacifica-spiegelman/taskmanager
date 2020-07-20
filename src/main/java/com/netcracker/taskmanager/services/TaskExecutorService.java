package com.netcracker.taskmanager.services;

import com.netcracker.taskmanager.controller.EmployeeControllerInterface;
import com.netcracker.taskmanager.exception.TaskManagerException;
import com.netcracker.taskmanager.model.Process;
import com.netcracker.taskmanager.model.Task;
import com.netcracker.taskmanager.model.TaskType;
import com.netcracker.taskmanager.util.ControllerProvider;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.Collection;

public class TaskExecutorService {
    private static TaskExecutorService taskExecutorService;
    private static final Logger LOGGER = Logger.getLogger(TaskExecutorService.class);
    private Collection<Thread> threads = new ArrayList<>();
    private static final int QUANTITY_THREAD = 10;

    private TaskExecutorService() throws TaskManagerException {
        TaskStartQueueService.getTaskStartQueueService();
    }

    public static synchronized TaskExecutorService getTaskExecutorService() throws TaskManagerException {
        if (taskExecutorService == null)
            taskExecutorService = new TaskExecutorService();
        return taskExecutorService;
    }


    public void StartTask() throws TaskManagerException {
        while (TaskStartQueueService.getTaskStartQueueService().getTask() != null) {
            Task task = TaskStartQueueService.getTaskStartQueueService().getTask();
            Thread newThread = new Thread(() -> {
                try {
                    if (task.getType() == TaskType.MANUAL)
                        task.setAssigneeId(ControllerProvider.getControllerProvider().getController(EmployeeControllerInterface.class).getAssigneeEmployeeId(task));
                    else if (task.getType() == TaskType.JAVA_ACTION) {
                        Action action = new Action();
                        action.run(null, task);
                    }
                } catch (TaskManagerException e) {
                    LOGGER.error("Problems with getting controller or TaskActionService", e);
                }
            });
            newThread.start();
            threads.add(newThread);
        }
    }

    private class Action extends TaskActionService {

        @Override
        public void run(Process process, Task task) throws TaskManagerException {

        }
    }
}

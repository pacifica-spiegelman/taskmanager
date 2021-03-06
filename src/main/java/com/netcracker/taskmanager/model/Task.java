package com.netcracker.taskmanager.model;

import javax.xml.bind.annotation.*;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

/**
 * Class describes task of process with such properties as <b>taskID</b>, <b>status</b>
 * <b>type</b>, <b>priority</b>, <b>name</b>, <b>description</b>, <b>processId</b>, <b>assigneeId</b>,
 * <b>expectationStartDate</b>, <b>expectationEndDate</b>, <b>startDate</b>, <b>endDate</b>
 *
 * @version 1.0*
 */
@XmlRootElement(name = "task")
@XmlAccessorType(XmlAccessType.FIELD)
public class Task {
    /**
     * Task's identifier
     */
    @XmlAttribute(name = "task_id")
    private long taskId;
    /**
     * Identifier of task template
     */
    @XmlElement(name = "task_template_id")
    private Long taskTemplateId;

    /**
     * Task's status
     */
    @XmlElement(name = "status")
    private TaskStatus status;

    /**
     * Task's type
     */
    @XmlElement(name = "type")
    private TaskType type;

    /**
     * Task's priority
     */
    @XmlElement(name = "priority")
    private TaskPriority priority;

    /**
     * Task's name
     */
    @XmlElement(name = "name")
    private String name;

    /**
     * Task's description
     */
    @XmlElement(name = "description")
    private String description;

    /**
     * Identifier of process
     */
    @XmlElement(name = "process_id")
    private long processId;

    /**
     * Identifier of assignee
     */
    @XmlElement(name = "assignee_id")
    private long assigneeId;

    /**
     * Expectation start date of task
     */
    @XmlElement(name = "expectation_start_date")
    private LocalDateTime expectationStartDate;

    /**
     * Expectation end date of task
     */
    @XmlElement(name = "expectation_end_date")
    private LocalDateTime expectationEndDate;

    /**
     * Start date of task
     */
    @XmlElement(name = "start_date")
    private LocalDateTime startDate;

    /**
     * End date of task
     */
    @XmlElement(name = "end_date")
    private LocalDateTime endDate;
    /**
     * Parameters of task
     */
    @XmlElement(name = "parameters")
    private Map<String, String> parameters = new HashMap<>();

    /**
     * Constructor creates new object
     */
    public Task() {
    }

    /**
     * Function receives value of field {@link Task#processId}
     *
     * @return processId
     */
    public long getProcessId() {
        return processId;
    }

    /**
     * Procedure defines value of field {@link Task#processId}
     *
     * @param processId
     */
    public void setProcessId(long processId) {
        this.processId = processId;
    }

    /**
     * Function receives value of field {@link Task#taskTemplateId}
     *
     * @return taskTemplateId
     */
    public Long getTaskTemplateId() {
        return taskTemplateId;
    }

    /**
     * Procedure defines value of field {@link Task#taskTemplateId}
     *
     * @param taskTemplateId
     */
    public void setTaskTemplateId(Long taskTemplateId) {
        this.taskTemplateId = taskTemplateId;
    }

    /**
     * Function receives value of field {@link Task#assigneeId}
     *
     * @return assigneeId
     */
    public long getAssigneeId() {
        return assigneeId;
    }

    /**
     * Procedure defines value of field {@link Task#assigneeId}
     *
     * @param assigneeId
     */
    public void setAssigneeId(long assigneeId) {
        this.assigneeId = assigneeId;
    }

    /**
     * Function receives value of field {@link Task#expectationStartDate}
     *
     * @return expectationStartDate
     */
    public LocalDateTime getExpectationStartDate() {
        return expectationStartDate;
    }

    /**
     * Procedure defines value of field {@link Task#expectationStartDate}
     *
     * @param expectationStartDate
     */
    public void setExpectationStartDate(LocalDateTime expectationStartDate) {
        this.expectationStartDate = expectationStartDate;
    }

    /**
     * Function receives value of field {@link Task#expectationEndDate}
     *
     * @return expectationEndDate
     */
    public LocalDateTime getExpectationEndDate() {
        return expectationEndDate;
    }

    /**
     * Procedure defines value of field {@link Task#expectationEndDate}
     *
     * @param expectationEndDate
     */
    public void setExpectationEndDate(LocalDateTime expectationEndDate) {
        this.expectationEndDate = expectationEndDate;
    }

    /**
     * Function receives value of field {@link Task#startDate}
     *
     * @return startDate
     */
    public LocalDateTime getStartDate() {
        return startDate;
    }

    /**
     * Procedure defines value of field {@link Task#startDate}
     *
     * @param startDate
     */
    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    /**
     * Function receives value of field {@link Task#endDate}
     *
     * @return endDate
     */
    public LocalDateTime getEndDate() {
        return endDate;
    }

    /**
     * Procedure defines value of field {@link Task#endDate}
     *
     * @param endDate
     */
    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }

    /**
     * Function receives value of field {@link Task#taskId}
     *
     * @return taskId
     */
    public long getTaskId() {
        return taskId;
    }

    /**
     * Procedure defines value of field {@link Task#taskId}
     *
     * @param taskId
     */
    public void setTaskId(long taskId) {
        this.taskId = taskId;
    }

    /**
     * Function receives value of field {@link Task#description}
     *
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Procedure defines value of field {@link Task#description}
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Function receives value of field {@link Task#name}
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Procedure defines value of field {@link Task#name}
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Function receives value of field {@link Task#status}
     *
     * @return TaskStatus
     */
    public TaskStatus getStatus() {
        return status;
    }

    /**
     * Procedure defines value of field {@link Task#status}
     *
     * @param status
     */
    public void setStatus(TaskStatus status) {
        this.status = status;
    }

    /**
     * Function receives value of field {@link Task#type}
     *
     * @return TaskType
     */
    public TaskType getType() {
        return type;
    }

    /**
     * Procedure defines value of field {@link Task#type}
     *
     * @param type
     */
    public void setType(TaskType type) {
        this.type = type;
    }

    /**
     * Function receives value of field {@link Task#priority}
     *
     * @return TaskPriority
     */
    public TaskPriority getPriority() {
        return priority;
    }

    /**
     * Procedure defines value of field {@link Task#priority}
     *
     * @param priority
     */
    public void setPriority(TaskPriority priority) {
        this.priority = priority;
    }

    /**
     * Function receives value of field {@link Task#parameters}
     *
     * @return parameters
     */
    public Map<String, String> getParameters() {
        return parameters;
    }

    /**
     * Procedure defines value of field {@link Task#parameters}
     *
     * @param parameters
     */
    public void setParameters(Map<String, String> parameters) {
        this.parameters = parameters;
    }


}
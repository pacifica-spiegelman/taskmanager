package com.netcracker.taskmanager.model;

import javax.xml.bind.annotation.*;

/**
 *Class describes relation between skills and employees with such properties as
 * <b>employeeId</b>, <b>skillId</b>, <b>skillLevel</b>.
 * @version 1.0
 */
@XmlRootElement(name = "employee_skill")
@XmlAccessorType(XmlAccessType.FIELD)
public class EmployeeSkill {
    /**
     * Employee's identifier
     */
    @XmlAttribute(name = "employee_id")
    private Long employeeId;
    /**
     * Identifier of skill
     */
    @XmlAttribute(name = "skill_id")
    private Long skillId;
    /**
     * Level of skill
     */
    @XmlElement(name = "skill_level")
    private int skillLevel;

    /**
     *Constructor creates new object
     */
    public EmployeeSkill() {
    }

    /**
     *Function receives value of field {@link EmployeeSkill#employeeId}
     *@return employeeId
     */
    public Long getEmployeeId() {
        return employeeId;
    }

    /**
     *Procedure defines value of field {@link EmployeeSkill#employeeId}
     *@param employeeId
     */
    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }

    /**
     *Function receives value of field {@link EmployeeSkill#skillId}
     *@return skillId
     */
    public Long getSkillId() {
        return skillId;
    }

    /**
     *Procedure defines value of field {@link EmployeeSkill#skillId}
     *@param skillId
     */
    public void setSkillId(long skillId) {
        this.skillId = skillId;
    }

    /**
     *Function receives value of field {@link EmployeeSkill#skillLevel}
     *@return skillLevel
     */
    public int getSkillLevel() {
        return skillLevel;
    }

    /**
     *Procedure defines value of field {@link EmployeeSkill#skillLevel}
     *@param skillLevel
     */
    public void setSkillLevel(int skillLevel) {
        this.skillLevel = skillLevel;
    }
}

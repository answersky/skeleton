package com.xiaowo;

import java.util.Date;

/**
 * @author answer
 *         2017/11/24
 *         招聘信息
 */
public class Recruit {
    private Integer id;
    private Integer departmentId;
    private String department;
    private Integer positionId;
    private String position;
    private Integer zoneId;
    private String zone;
    private String title;
    /**
     * 职责
     */
    private String duty;
    /**
     * 任职要求
     */
    private String jobRequirements;
    /**
     * 0表示无效，1草稿，2发布
     */
    private String status;
    /**
     * 0代表校招，1代表社招
     */
    private String type;
    private Date createTime;
    private Date updateTime;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public Integer getPositionId() {
        return positionId;
    }

    public void setPositionId(Integer positionId) {
        this.positionId = positionId;
    }

    public Integer getZoneId() {
        return zoneId;
    }

    public void setZoneId(Integer zoneId) {
        this.zoneId = zoneId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDuty() {
        return duty;
    }

    public void setDuty(String duty) {
        this.duty = duty;
    }

    public String getJobRequirements() {
        return jobRequirements;
    }

    public void setJobRequirements(String jobRequirements) {
        this.jobRequirements = jobRequirements;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "Recruit{" +
                "id=" + id +
                ", departmentId=" + departmentId +
                ", department='" + department + '\'' +
                ", positionId=" + positionId +
                ", position='" + position + '\'' +
                ", zoneId=" + zoneId +
                ", zone='" + zone + '\'' +
                ", title='" + title + '\'' +
                ", duty='" + duty + '\'' +
                ", jobRequirements='" + jobRequirements + '\'' +
                ", status='" + status + '\'' +
                ", type='" + type + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }
}

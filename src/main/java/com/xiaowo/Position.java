package com.xiaowo;

/**
 * @author answer
 *         2017/11/24
 */
public class Position {
    private Integer id;
    private String position;
    private String remark;
    private String status;

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Position{" +
                "id=" + id +
                ", position='" + position + '\'' +
                ", remark='" + remark + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}

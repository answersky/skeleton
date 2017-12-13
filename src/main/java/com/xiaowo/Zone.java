package com.xiaowo;

/**
 * @author answer
 *         2017/11/3
 */
public class Zone {
    private Integer id;
    private String zone;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    @Override
    public String toString() {
        return "Zone{" +
                "id=" + id +
                ", zone='" + zone + '\'' +
                '}';
    }
}

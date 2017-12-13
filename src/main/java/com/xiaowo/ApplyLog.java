package com.xiaowo;

import java.util.Date;

/**
 * @author answer
 *         2017/11/27
 *         申请日志
 */
public class ApplyLog {
    private Integer id;
    private String username;
    private String tel;
    private String channel;
    private String resource;
    private Integer count;
    private Date createTime;

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getResource() {
        return resource;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }

    @Override
    public String toString() {
        return "ApplyLog{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", tel='" + tel + '\'' +
                ", channel='" + channel + '\'' +
                ", resource='" + resource + '\'' +
                ", count=" + count +
                ", createTime=" + createTime +
                '}';
    }
}

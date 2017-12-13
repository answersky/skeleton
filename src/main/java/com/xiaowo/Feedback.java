package com.xiaowo;

import java.util.Date;

/**
 * @author answer
 *         2017/11/10
 */
public class Feedback {
    private Integer id;
    private String content;
    private String tel;
    private Date createTime;

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    @Override
    public String toString() {
        return "Feedback{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", tel='" + tel + '\'' +
                ", createTime=" + createTime +
                '}';
    }
}

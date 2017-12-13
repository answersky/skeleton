package com.xiaowo;

import java.util.Date;

/**
 * @author answer
 *         2017/11/1
 */
public class Problem {
    private Integer id;
    private Integer categoryId;
    private String category;
    private String problem;
    private String answer;
    private String status;
    /**
     * 是否单独推荐
     */
    private String recommend;
    private Date createTime;
    private Date updateTime;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getProblem() {
        return problem;
    }

    public void setProblem(String problem) {
        this.problem = problem;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRecommend() {
        return recommend;
    }

    public void setRecommend(String recommend) {
        this.recommend = recommend;
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
        return "Problem{" +
                "id=" + id +
                ", categoryId=" + categoryId +
                ", category='" + category + '\'' +
                ", problem='" + problem + '\'' +
                ", answer='" + answer + '\'' +
                ", status='" + status + '\'' +
                ", recommend='" + recommend + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }
}

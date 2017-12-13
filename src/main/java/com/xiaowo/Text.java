package com.xiaowo;

/**
 * @author answer
 *         2017/11/3
 */
public class Text {
    private Integer id;
    private String sourceUrl;
    /**
     * 文章摘要
     */
    private String remark;
    private String content;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSourceUrl() {
        return sourceUrl;
    }

    public void setSourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Text{" +
                "id=" + id +
                ", sourceUrl='" + sourceUrl + '\'' +
                ", remark='" + remark + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}

package com.xiaowo;

import java.util.Date;
import java.util.List;

/**
 * @author answer
 *         2017/11/3
 */
public class Content {
    private Integer id;
    /**
     * 栏目id
     */
    private Integer categoryId;
    private String editor;
    private String title;
    private String shortTitle;
    /**
     * 文章id
     */
    private Integer textId;
    /**
     * 标签
     */
    private String tags;
    /**
     * 所属站点
     */
    private Integer zoneId;
    /**
     * 图片（banner、文章banner）
     */
    private Integer picId;
    /**
     * 类型
     */
    private Integer typeId;
    /**
     * 是否推荐（1表示推荐，0表示不推荐）
     */
    private String recommend;
    /**
     * 贷款金额
     */
    private String decorateMoney;
    /**
     * 还款期限
     */
    private String decorateTime;
    /**
     * 月还款金额
     */
    private String monthRepayment;
    /**
     * 状态（0无效，1草稿，2已发布）
     */
    private String status;
    private Date createTime;
    private Date updateTime;
    /**
     * 活动时间
     */
    private String activeTime;
    /**
     * 合作商家
     */
    private String cooperativeBusiness;

    private String category;
    private List<Tag> tagList;
    private Picture picture;
    private Text text;
    private ContentType contentType;
    private String client;

    public String getActiveTime() {
        return activeTime;
    }

    public void setActiveTime(String activeTime) {
        this.activeTime = activeTime;
    }

    public String getCooperativeBusiness() {
        return cooperativeBusiness;
    }

    public void setCooperativeBusiness(String cooperativeBusiness) {
        this.cooperativeBusiness = cooperativeBusiness;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getShortTitle() {
        return shortTitle;
    }

    public void setShortTitle(String shortTitle) {
        this.shortTitle = shortTitle;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public List<Tag> getTagList() {
        return tagList;
    }

    public void setTagList(List<Tag> tagList) {
        this.tagList = tagList;
    }

    public Picture getPicture() {
        return picture;
    }

    public void setPicture(Picture picture) {
        this.picture = picture;
    }

    public Text getText() {
        return text;
    }

    public void setText(Text text) {
        this.text = text;
    }

    public ContentType getContentType() {
        return contentType;
    }

    public void setContentType(ContentType contentType) {
        this.contentType = contentType;
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

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    public Integer getTextId() {
        return textId;
    }

    public void setTextId(Integer textId) {
        this.textId = textId;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public Integer getZoneId() {
        return zoneId;
    }

    public void setZoneId(Integer zoneId) {
        this.zoneId = zoneId;
    }

    public Integer getPicId() {
        return picId;
    }

    public void setPicId(Integer picId) {
        this.picId = picId;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public String getRecommend() {
        return recommend;
    }

    public void setRecommend(String recommend) {
        this.recommend = recommend;
    }

    public String getDecorateMoney() {
        return decorateMoney;
    }

    public void setDecorateMoney(String decorateMoney) {
        this.decorateMoney = decorateMoney;
    }

    public String getDecorateTime() {
        return decorateTime;
    }

    public void setDecorateTime(String decorateTime) {
        this.decorateTime = decorateTime;
    }

    public String getMonthRepayment() {
        return monthRepayment;
    }

    public void setMonthRepayment(String monthRepayment) {
        this.monthRepayment = monthRepayment;
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
        return "Content{" +
                "id=" + id +
                ", categoryId=" + categoryId +
                ", editor='" + editor + '\'' +
                ", title='" + title + '\'' +
                ", shortTitle='" + shortTitle + '\'' +
                ", textId=" + textId +
                ", tags='" + tags + '\'' +
                ", zoneId=" + zoneId +
                ", picId=" + picId +
                ", typeId=" + typeId +
                ", recommend='" + recommend + '\'' +
                ", decorateMoney='" + decorateMoney + '\'' +
                ", decorateTime='" + decorateTime + '\'' +
                ", monthRepayment='" + monthRepayment + '\'' +
                ", status='" + status + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", activeTime='" + activeTime + '\'' +
                ", cooperativeBusiness='" + cooperativeBusiness + '\'' +
                ", category='" + category + '\'' +
                ", tagList=" + tagList +
                ", picture=" + picture +
                ", text=" + text +
                ", contentType=" + contentType +
                ", client='" + client + '\'' +
                '}';
    }
}

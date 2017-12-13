package com.xiaowo;

/**
 * @author answer
 *         2017/11/3
 */
public class Tag {
    private Integer id;
    private String tag;
    /**
     * 标签被引用的次数
     */
    private Integer referenceCount;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public Integer getReferenceCount() {
        return referenceCount;
    }

    public void setReferenceCount(Integer referenceCount) {
        this.referenceCount = referenceCount;
    }

    @Override
    public String toString() {
        return "Tag{" +
                "id=" + id +
                ", tag='" + tag + '\'' +
                ", referenceCount=" + referenceCount +
                '}';
    }
}

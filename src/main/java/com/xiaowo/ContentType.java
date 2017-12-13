package com.xiaowo;

/**
 * @author answer
 *         2017/11/3
 */
public class ContentType {
    private Integer id;
    private String type;
    private Integer width;
    private Integer height;
    private String hasImg;
    private String status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public String getHasImg() {
        return hasImg;
    }

    public void setHasImg(String hasImg) {
        this.hasImg = hasImg;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "ContentType{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", width=" + width +
                ", height=" + height +
                ", hasImg='" + hasImg + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}

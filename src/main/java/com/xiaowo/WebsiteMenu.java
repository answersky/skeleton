package com.xiaowo;

import java.util.List;

/**
 * @author answer
 *         2017/11/2
 */
public class WebsiteMenu {
    private Integer id;
    private String name;
    private Integer parentId;
    private List<WebsiteMenu> children;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public List<WebsiteMenu> getChildren() {
        return children;
    }

    public void setChildren(List<WebsiteMenu> children) {
        this.children = children;
    }

    @Override
    public String toString() {
        return "WebsiteMenu{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", parentId=" + parentId +
                ", children=" + children +
                '}';
    }
}

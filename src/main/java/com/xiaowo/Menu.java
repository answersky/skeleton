package com.xiaowo;

import java.io.Serializable;
import java.util.List;

/**
 * @author answer
 *         2017/10/27
 */
public class Menu implements Serializable {
    private Integer id;
    private Integer parentId;
    /**
     * 父级菜单名
     */
    private String pName;
    private String name;
    private String url;
    private String status;
    private List<Menu> subMenu;

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public List<Menu> getSubMenu() {
        return subMenu;
    }

    public void setSubMenu(List<Menu> subMenu) {
        this.subMenu = subMenu;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "id=" + id +
                ", parentId=" + parentId +
                ", pName='" + pName + '\'' +
                ", name='" + name + '\'' +
                ", url='" + url + '\'' +
                ", status='" + status + '\'' +
                ", subMenu=" + subMenu +
                '}';
    }
}

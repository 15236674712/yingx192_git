package com.baizhi.yingx192_git.entity;

public class Categeory {

    private String id;
    private String cateName;

    @Override
    public String toString() {
        return "Categeory{" +
                "id='" + id + '\'' +
                ", cateName='" + cateName + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCateName() {
        return cateName;
    }

    public void setCateName(String cateName) {
        this.cateName = cateName;
    }

    public Categeory() {
    }

    public Categeory(String id, String cateName) {
        this.id = id;
        this.cateName = cateName;
    }
}

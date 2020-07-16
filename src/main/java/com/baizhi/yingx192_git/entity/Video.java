package com.baizhi.yingx192_git.entity;


public class Video {

    private String id;
    private String title;
    private String path;

    @Override
    public String toString() {
        return "Video{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", path='" + path + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Video() {
    }

    public Video(String id, String title, String path) {
        this.id = id;
        this.title = title;
        this.path = path;
    }
}

package com.baizhi.yingx192_git.dao;

import com.baizhi.yingx192_git.entity.Video;

import java.util.List;

public interface VideoDao {

    List<Video> queryById(String id);


    List<Video> queryAll(String id);
}

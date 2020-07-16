package com.baizhi.yingx192_git.dao;

import com.baizhi.yingx192_git.entity.Categeory;

import java.util.List;

public interface CategoryDao {

    List<Categeory> queryByCategroy(String cateName);

    List<Categeory> queryAll(String cateName);

}

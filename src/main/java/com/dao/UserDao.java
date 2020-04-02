package com.dao;

/**
 * @date 2020/3/23 0:34
 * @autho SWP
 * @Version 1.0
 */

import com.domain.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserDao {
  public User userLogin(@Param("username") String userName, @Param("userPwd") String password);
  public User findUser(String id);
  public  void updatePwd(@Param("id") String id, @Param("password") String password);
  public List<User> showUser();
  public  void changeUser(@Param("id") String id, @Param("status") Integer status);
  public  void addUser(User user);
}

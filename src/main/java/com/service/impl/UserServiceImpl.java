package com.service.impl;

import com.dao.UserDao;
import com.domain.User;
import com.result.Result;
import com.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @date 2020/3/23 0:42
 * @autho SWP
 * @Version 1.0
 */
@Service
public class UserServiceImpl implements UserService {
@Autowired
  private UserDao dao;

  @Override
  public Result login(@Param("username") String userName, @Param("userPwd") String userPwd) {
    User user=dao.userLogin(userName,userPwd);
    Result nr=null;
    if(user==null){
      nr=new Result("1", "用户不存在", null);
    }else if(!userPwd.equals(user.getPassword())){
      nr=new Result("1", "用户密码错误", null);
    }else{
      Integer type=user.getType();
      String userId=user.getId();
      String usename = user.getName();
      Map<String,Object> data=new HashMap<>();
      data.put("type", type);
      data.put("userId", userId);
      data.put("userName",usename);
      nr=new Result("0", "登录成功", data);


  }
    return nr;
}

  @Override
  public Result updatePwd(String user_id, String mpass, String newpass) {
  User user=dao.findUser(user_id);
    Result nr= null;
    if(mpass.equals("")){
      nr=new Result("1", "请输入原始密码", null);
    }else if(newpass.equals("")){
      nr=new Result("1", "请输入新密码", null);
    }else if(mpass.equals("") && newpass.equals("")){
      nr=new Result("1", "请输入密码", null);
    }else if(!mpass.equals("java")){
      nr=new Result("1", "原始密码不正确", null);
    }else{
      System.out.println(user);
      dao.updatePwd(user_id,newpass);
      nr=new Result("0", "密码修改成功", null);
    }
    return nr;
  }

  @Override
  public Result showUser() {
    List<User> list = dao.showUser();
    return new Result("0", "信息如下", list);
  }

  @Override
  public Result changeUser(String id) {
    User user = dao.findUser(id);
    if(user.getStatus()==0){


dao.changeUser(id,1);
    }else {
      dao.changeUser(id,0);
    }
    return  new Result( "0","操作成功",null);
  }

  @Override
  public Result addUser(String name, String password, Integer type) {
    User user=new User(name,password,type,0);
    dao.addUser(user);
    return new Result("0","添加成功",null);
  }
}

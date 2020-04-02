package com.service;

import com.result.Result;

/**
 * @date 2020/3/23 0:36
 * @autho SWP
 * @Version 1.0
 */
public interface UserService {
  public Result login(String userName, String userPwd);
  public Result updatePwd(String user_id, String mpass, String newpass);
  public  Result showUser();
  public  Result changeUser(String id);
  public  Result addUser(String name, String password, Integer type);
}

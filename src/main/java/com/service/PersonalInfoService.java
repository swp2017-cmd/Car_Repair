package com.service;

import com.result.Result;

/**
 * @date 2020/3/24 19:44
 * @autho SWP
 * @Version 1.0
 */
public interface PersonalInfoService {
  public Result showPersonalInfo(String user_id);
  public Result updatePerson(String user_id, String real_name, String sex, String birthday, String email, String address, String tel_num, String remark);
}

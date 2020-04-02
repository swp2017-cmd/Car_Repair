package com.service.impl;

import com.dao.PersonalInfoDao;
import com.domain.PersonalInfo;
import com.result.Result;
import com.service.PersonalInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @date 2020/3/24 19:45
 * @autho SWP
 * @Version 1.0
 */
@Service
public class PersonalInfroServImpl implements PersonalInfoService {
  @Autowired
  PersonalInfoDao personDao;
  @Override
  public Result showPersonalInfo(String user_id) {
    PersonalInfo pi = personDao.showPersonalInfo(user_id);
//    将得到的信息封装在Result中
    return   new Result("0","信息如下",pi);


  }

  @Override
  public Result updatePerson(String user_id, String real_name, String sex, String birthday, String email, String address, String tel_num, String remark) {
    PersonalInfo pi=new PersonalInfo();
    pi.setUser_id(user_id);
    pi.setReal_name(real_name);
    pi.setSex(sex);
    pi.setBirthday(birthday);
    pi.setEmail(email);
    pi.setTel_num(tel_num);
    pi.setReal_name(real_name);
    pi.setAddress(address);
    pi.setRemark(remark);
    personDao.updatePerson(pi);
    return new Result("0", "更新成功", null);
  }
}

package com.dao;

import com.domain.PersonalInfo;

/**
 * @date 2020/3/24 19:31
 * @autho SWP
 * @Version 1.0
 */
public interface PersonalInfoDao {

  public PersonalInfo showPersonalInfo(String user_id);
  public  void updatePerson(PersonalInfo personalInfo);


}

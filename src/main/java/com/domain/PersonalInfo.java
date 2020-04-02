package com.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * @date 2020/3/24 19:29
 * @autho SWP
 * @Version 1.0
 */
@Data
public class PersonalInfo implements Serializable {
  private String user_id;
  private String real_name;
  private String sex;
  private String birthday;
  private String email;
  private String address;
  private String tel_num;
  private String remark;
}

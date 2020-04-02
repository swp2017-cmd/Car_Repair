package com.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * @date 2020/3/23 0:31
 * @autho SWP
 * @Version 1.0
 */
@Data
public class User implements Serializable {
  private String id;
  private String name;
  private String password;
  private Integer type;
  private Integer status;

  public User() {
  }

  public User(String name, String password, Integer type, Integer status) {
    this.name = name;
    this.password = password;
    this.type = type;
    this.status = status;
  }
}

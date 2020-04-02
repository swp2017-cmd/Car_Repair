package com.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * @date 2020/3/27 14:36
 * @autho SWP
 * @Version 1.0
 */
@Data
public class OrderInfo implements Serializable {
  private String id;
  private String user_id;
  private String user_name;
  private String plate;
  private String trouble_code;
  private String trouble_name;
  private String contact;
  private String contact_way;
  private String remark;
  private Long long_time;
  private String creart_time;
  private Integer status;

  public OrderInfo() {
  }

  public OrderInfo(String user_id, String user_name, String plate, String trouble_code, String trouble_name, String contact, String contact_way, String remark, Long long_time, String creart_time, Integer status) {
    this.user_id = user_id;
    this.user_name = user_name;
    this.plate = plate;
    this.trouble_code = trouble_code;
    this.trouble_name = trouble_name;
    this.contact = contact;
    this.contact_way = contact_way;
    this.remark = remark;
    this.long_time = long_time;
    this.creart_time = creart_time;
    this.status = status;
  }
}

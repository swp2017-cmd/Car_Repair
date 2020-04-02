package com.domain;

import lombok.Data;

/**
 * @date 2020/3/26 15:19
 * @autho SWP
 * @Version 1.0
 */
@Data
public class CarInfo {
  private String id;
  private String plate;
  private String user_id;
  private String user_name;
  private String brand;
  private String model;
  private String color;
  private String price;
  private String date;
  private String remark;

  public CarInfo() {
  }

  public CarInfo(String plate, String user_id, String user_name, String brand, String model, String color, String price, String date, String remark) {
    this.plate = plate;
    this.user_id = user_id;
    this.user_name = user_name;
    this.brand = brand;
    this.model = model;
    this.color = color;
    this.price = price;
    this.date = date;
    this.remark = remark;
  }
}

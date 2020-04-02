package com.service;

import com.domain.CarInfo;
import com.result.Result;

/**
 * @date 2020/3/26 16:34
 * @autho SWP
 * @Version 1.0
 */
public interface CarInfoService {
  /**
   * 查询用户名下所有的车
   * @param user_id
   * @return
   */
  public Result selectCar(String user_id);

  /**
   * 根据车标号删除车辆
   * @param id
   * @return
   */
  public Result deleteCar(String id);

  /**
   * 查询要修改的车
   * @param id
   * @return
   */
  public Result queryById(String id);

  /**
   * 修改车辆维修信息
   * @param carInfo
   * @return
   */
  public Result updateCar(CarInfo carInfo);

  /**
   * 添加车辆信息
   * @param
   * @return
   */
  public Result addCar(String user_id, String plate, String brand, String model, String color, String price,
                       String date, String remark);

//  后台管理

  /**
   * 查询所有车辆
   * @return
   */
  public Result showAllCar();

  /**
   * 按条件查询车辆
   * @param type
   * @param keywords
   * @return
   */
  public Result serachCarInfo(String type, String keywords);


}

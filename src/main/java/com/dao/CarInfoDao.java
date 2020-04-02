package com.dao;

import com.domain.CarInfo;

import java.util.List;
import java.util.Map;

/**
 * @date 2020/3/26 15:27
 * @autho SWP
 * @Version 1.0
 */
public interface CarInfoDao {
  public List<CarInfo> selectCar(String user_id);
  public void deleteCar(String id);
public CarInfo queryById(String id);
public void updateCar(CarInfo carInfo);
public  void addCar(CarInfo carInfo);
  public List<CarInfo> showAllCar();
  public List<CarInfo> searchCarInfo(Map<String, Object> params);
}

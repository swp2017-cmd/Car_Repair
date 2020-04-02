package com.service.impl;

import com.dao.CarInfoDao;
import com.dao.UserDao;
import com.domain.CarInfo;
import com.domain.User;
import com.result.Result;
import com.service.CarInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @date 2020/3/26 16:36
 * @autho SWP
 * @Version 1.0
 */
@Service
public class CarInfoServImpl implements CarInfoService {
@Autowired
  CarInfoDao carInfoDao ;
  @Autowired
  private UserDao dao;
  @Override
  public Result selectCar(String user_id) {
  List<CarInfo> list = carInfoDao.selectCar(user_id);
   return  new Result("0","车辆信息如下",list);

  }

  @Override
  public Result deleteCar(String id) {
    carInfoDao.deleteCar(id);
    return  new Result("0","删除成功",null);
  }

  @Override
  public Result queryById(String id) {
    CarInfo carInfo = carInfoDao.queryById(id);
    return  new Result("0","车辆信息如下",carInfo);
  }

  @Override
  public Result updateCar(CarInfo carInfo) {
    carInfoDao.updateCar(carInfo);
    return  new Result("0","修改成功",null);
  }

  @Override
  public Result addCar(String user_id, String plate, String brand, String model, String color, String price,
                       String date, String remark) {

User user = dao.findUser(user_id);
    CarInfo ci=new CarInfo(plate,user_id,user.getName(),brand,model,color,price,date,remark);

    carInfoDao.addCar(ci);
    return  new Result("0","添加成功",null);
  }

  @Override
  public Result showAllCar() {
    List <CarInfo> list = carInfoDao.showAllCar();

    return  new Result( "0","信息如下",list);

  }

  @Override
  public Result serachCarInfo(String type, String keywords) {

    Map<String ,Object> map = new HashMap<>();
    if(type.equals("")){
      new Result("1","请选择分类",null);
    }else  if(keywords.equals("")){
      new Result("1","请输入关键字",null);
    }else if(type.equals("1")){
      map.put("plate","%"+keywords+"%");
    }else  if(type.equals("2")){
      map.put("brand","%"+keywords+"%");
    }else if(type.equals("3")){
      map.put("user_name","%"+keywords+"%");

    }
    List<CarInfo> list = carInfoDao.searchCarInfo(map);


    return new Result( "0","信息加载成功",list);
  }
}

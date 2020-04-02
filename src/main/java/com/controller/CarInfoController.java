package com.controller;

import com.domain.CarInfo;
import com.result.Result;
import com.service.CarInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @date 2020/3/26 16:42
 * @autho SWP
 * @Version 1.0
 */
@Controller
public class CarInfoController {
  @Autowired
  CarInfoService carInfoService ;

  @RequestMapping("/showCar.do")
  @ResponseBody
  public Result selectCar(String user_id){
  Result rs = carInfoService.selectCar(user_id);
  return  rs;
}

  @RequestMapping("/deleteCar.do")
  @ResponseBody
public Result deleteCar(String id){
    Result rs = carInfoService.deleteCar(id);
    return  new Result( "0","删除成功",null);

  }
  @RequestMapping("/showoneCar.do")
  @ResponseBody
public Result queryById(String id){
    Result rs = carInfoService.queryById(id);
    return  rs;


  }
  @RequestMapping("/updateCar.do")
  @ResponseBody
  public Result updateCar(CarInfo carInfo){
    Result rs = carInfoService.updateCar(carInfo);
    return rs;
  }
  @RequestMapping("/addCar.do")
  @ResponseBody
public Result addCar(String user_id,
                     String plate,
                     String brand,
                     String model,
                     String color,
                     String price,
                     String date,
                     String remark){
    Result rs = carInfoService.addCar(user_id, plate, brand, model, color, price, date, remark);
    return rs;
  }

  @RequestMapping("/showAllCar.do")
  @ResponseBody
public Result showAllCar(){
    Result rs = carInfoService.showAllCar();
    return  rs;



  }
  @RequestMapping("/searchCar.do")
  @ResponseBody
  public Result searchCar(String type , String keywords){

    Result rs = carInfoService.serachCarInfo(type, keywords);
    return  rs;
  }
}

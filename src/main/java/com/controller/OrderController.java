package com.controller;

import com.result.Result;
import com.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @date 2020/3/27 14:49
 * @autho SWP
 * @Version 1.0
 */
@Controller
public class OrderController {
@Autowired
OrderService service ;
@RequestMapping("/orderCar.do")
  @ResponseBody
  public Result selectOrder(String user_id){
  Result rs = service.selectOrder(user_id);
  return rs;
}
@RequestMapping("/showAllOrder.do")
  @ResponseBody
  public Result queryAllOrder(){
  Result rs = service.queryAllOrder();
  return  rs;
}

@RequestMapping("/deal.do")
  @ResponseBody
  public Result queryByDeal(){
  Result rs = service.queryByDeal();
  return  rs;

}
  @RequestMapping("/undeal.do")
  @ResponseBody
  public Result queryByUnDeal(){
    Result rs = service.queryByUnDeal();
    return  rs;

  }
  @RequestMapping("/sort.do")
  @ResponseBody
  public Result findBySort(){
    Result rs = service.findBySort();
    return  rs;

  }
  @RequestMapping("/searchorder.do")
  @ResponseBody
  public Result serachOrder(String type, String keywords){
  Result rs = service.serachOrder(type,keywords);
  return  rs;

  }

  @RequestMapping("delete.do")
  @ResponseBody
  public Result deleteOrder(String id){
  Result rs = service.delOrder(id);
  return rs;
  }
  @RequestMapping("changeOrder.do")
  @ResponseBody
  public Result changerOrder(String id){
  Result rs = service.changeOrder(id);
  return  rs;
  }


  @RequestMapping("/addOrder.do")
  @ResponseBody
  public Result addOrder(String user_id, String user_name, String plate, String trouble_code, String trouble_name, String contact, String contact_way, String remark){


  Result rs = service.addOrder(user_id,user_name,plate,trouble_code,trouble_name,contact,contact_way,remark);
  return  rs;
  }
}

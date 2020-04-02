package com.service.impl;

import com.dao.OrderInfoDao;
import com.domain.OrderInfo;
import com.result.Result;
import com.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @date 2020/3/27 14:46
 * @autho SWP
 * @Version 1.0
 */
@Service
public class OrderServImpl implements OrderService {
  @Autowired
  OrderInfoDao dao;

  @Override
  public Result selectOrder(String user_id) {
    List<OrderInfo> list = dao.selectAllOrder(user_id);
    return  new Result("0","加载成功",list);

  }

  @Override
  public Result queryAllOrder() {
    List<OrderInfo> list = dao.queryAllOrder();

    return new Result( "0","信息加载成功",list);
  }

  @Override
  public Result queryByDeal() {
    List<OrderInfo> list = dao.queryByStatus(1);
    return new Result("0","查询成功",list);
  }

  @Override
  public Result queryByUnDeal() {
    List<OrderInfo> list = dao.queryByStatus(0);
    return new Result("0","查询成功",list);
  }

  @Override
  public Result findBySort() {

    List<OrderInfo> list = dao.findBySort();
    return new Result("0","查询成功",list);
  }

  @Override
  public Result serachOrder(String type, String keywords) {
    Map<String,Object> params = new HashMap<>();
    if(!type.equals("") && keywords.equals("")){
      return new Result("1", "请选择选项", null);
    }else if(type.equals("") && !keywords.equals("")){
      return new Result("1", "关键字不能为空", null);
    }else if(type.equals("1")){
      params.put("plate", "%"+keywords+"%");
    }else if(type.equals("2")){
      params.put("trouble_name", "%"+keywords+"%");
    }else if(type.equals("3")){
      params.put("user_name", "%"+keywords+"%");
    }else if(type.equals("4")){
      params.put("contact", "%"+keywords+"%");
    }
    List<OrderInfo> list=dao.serachOrder(params);
    return new Result("0", "查询成功", list);

  }

  @Override
  public Result delOrder(String id) {
     dao.delOrder(id);
       return new Result( "0","删除成功",null);
  }

  @Override
  public Result changeOrder(String id) {
    dao.changeOrder(id,1);
    return new Result( "0","修改成功",null);
  }

  @Override
  public Result addOrder(String user_id, String user_name, String plate, String trouble_code, String trouble_name, String contact, String contact_way, String remark) {
OrderInfo info = new OrderInfo(user_id,user_name,plate,trouble_code,trouble_name,contact,contact_way,remark,System.currentTimeMillis(),getTime(),0);
dao.addOrder(info);

    return new Result( "0","添加成功",null);
  }


  private static String getTime(){
    SimpleDateFormat formatter=new SimpleDateFormat("yyyy年-MM月-dd日  HH:mm:ss");
    Date curDate=new Date(System.currentTimeMillis());
    String str=formatter.format(curDate);
    return str;
  }
}


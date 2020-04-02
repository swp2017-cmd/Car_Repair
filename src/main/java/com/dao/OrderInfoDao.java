package com.dao;

import com.domain.OrderInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @date 2020/3/27 14:38
 * @autho SWP
 * @Version 1.0
 */
public interface OrderInfoDao {

  public List<OrderInfo> selectAllOrder(String user_id);
  public  List<OrderInfo> queryAllOrder();
  public  List<OrderInfo> queryByStatus(Integer status);
  public List<OrderInfo> findBySort();
  public List<OrderInfo> serachOrder(Map<String, Object> map);
  public  void delOrder(String id);
  public OrderInfo findOrder(String id);
  public  void changeOrder(@Param("id") String id, @Param("status") Integer status);
  public  void addOrder(OrderInfo orderInfo);





}

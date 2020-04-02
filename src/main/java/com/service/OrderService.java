package com.service;

import com.result.Result;

/**
 * @date 2020/3/27 14:42
 * @autho SWP
 * @Version 1.0
 */
public interface OrderService  {
  /**
   * 根据用户id查询订单
   * @param user_id
   * @return
   */
  public Result selectOrder(String user_id);

  /**
   * 查询所有订单信息
   * @return
   */
  public Result queryAllOrder();

  /**
   * 查询已处理订单信息
   * @return
   */
  public Result queryByDeal();

  /**
   * 查询未处理订单
   * @return
   */
  public Result queryByUnDeal();

  /**
   * 按时间排序
   * @return
   */
  public Result findBySort();

  /**
   * 按条件查询
   * @param type
   * @param keywords
   * @return
   */
  public Result serachOrder(String type, String keywords);

  /**
   * 根据编号删除订单
   * @param id
   * @return
   */
  public Result delOrder(String id);

  /**
   * 改变订单状态
   * @param id
   * @return
   */
  public Result changeOrder(String id);

  public Result addOrder(String user_id, String user_name, String plate, String trouble_code, String trouble_name, String contact,
                         String contact_way, String remark);
}

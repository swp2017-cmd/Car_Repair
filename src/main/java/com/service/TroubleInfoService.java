package com.service;

import com.result.Result;

/**
 * @date 2020/3/31 17:04
 * @autho SWP
 * @Version 1.0
 */
public interface TroubleInfoService {
  /**
   * 查看所有故障信息
   * @return
   */
  public Result queryAll();

  /**
   * 改变当前维修状态
   * @param id
   * @return
   */
  public Result changeTro(String id);

  /**
   * 添加故障信息
   * @param trouble_code
   * @param trouble_name
   * @param trouble_remark
   * @return
   */
  public Result addTrouble(String trouble_code, String trouble_name, String trouble_remark);



}

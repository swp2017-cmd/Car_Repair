package com.dao;

import com.domain.TroubleInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @date 2020/3/31 16:58
 * @autho SWP
 * @Version 1.0
 */
public interface TroubleInfoDao {
  public List<TroubleInfoDao> queryAllTro();
  public  void changeTro(@Param("status") Integer status, @Param("id") String id);
  public TroubleInfo findId(String id);
  public  void addTrouble(TroubleInfo tro);

}

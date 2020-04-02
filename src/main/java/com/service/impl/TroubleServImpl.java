package com.service.impl;

import com.dao.TroubleInfoDao;
import com.domain.TroubleInfo;
import com.result.Result;
import com.service.TroubleInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @date 2020/3/31 17:06
 * @autho SWP
 * @Version 1.0
 */
@Service
public class TroubleServImpl implements TroubleInfoService {

  @Autowired
  TroubleInfoDao tro ;
  @Override
  public Result queryAll() {
List<TroubleInfoDao> list  = tro.queryAllTro();
    return new Result( "0","信息如下",list);
  }

  @Override
  public Result changeTro(String id) {
TroubleInfo troinfo = tro.findId(id);
if(troinfo.getStatus()==0){
  tro.changeTro(1,id);
}else {
  tro.changeTro(0,id);
}


    return new Result( "0","操作成功",null);
  }

  @Override
  public Result addTrouble(String trouble_code, String trouble_name, String trouble_remark) {

    Result nr=null;
    if(trouble_code.equals("")){
      nr=new Result("1", "故障编号不能为空", null);
    }else if(trouble_name.equals("")){
      nr=new Result("1", "故障名不能为空", null);
    }else{
      TroubleInfo troubleInfo = new TroubleInfo(trouble_code,trouble_name,trouble_remark);
      tro.addTrouble(troubleInfo);
      nr=new Result("0", "添加成功", null);
    }
    return nr;
  }
}

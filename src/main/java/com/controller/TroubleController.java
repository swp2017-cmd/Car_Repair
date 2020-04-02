package com.controller;

import com.result.Result;
import com.service.TroubleInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @date 2020/3/31 17:18
 * @autho SWP
 * @Version 1.0
 */
@Controller
public class TroubleController {
  @Autowired
  TroubleInfoService tro ;
  @RequestMapping("/showTrouble.do")
  @ResponseBody
  public Result queryAll(){
    Result rs = tro.queryAll();
    return  rs;


  }
  @RequestMapping("/changeTrouble.do")
  @ResponseBody
  public Result changeTro (String id){
    Result rs = tro.changeTro(id);
    return  rs;


  }
  @RequestMapping("/addTrouble.do")
  @ResponseBody
  public Result addTrouble(String trouble_code, String trouble_name, String trouble_remark){

    Result rs = tro.addTrouble(trouble_code,trouble_name,trouble_remark);
    return  rs;
  }

}

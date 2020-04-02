package com.controller;

import com.result.Result;
import com.service.PersonalInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @date 2020/3/24 19:54
 * @autho SWP
 * @Version 1.0
 */
@Controller
public class PersonInfoController {
  @Autowired
  PersonalInfoService personService;

  @RequestMapping("/show.do")
  @ResponseBody
  public Result showPersonAll(String user_id){
    Result rs = personService.showPersonalInfo(user_id);
    return rs;
  }

  @RequestMapping("/update.do")
  @ResponseBody
  public  Result updatePerson(String user_id,String real_name, String sex, String birthday, String email, String address,String tel_num, String remark){

    Result rs = personService.updatePerson(user_id, real_name, sex, birthday, email, address, tel_num, remark);
  return rs;
  }
}

package com.controller;

import com.result.Result;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * @date 2020/3/23 7:46
 * @autho SWP
 * @Version 1.0
 */
@Controller
//@RequestMapping("/user")
public class UserController {
@Autowired
  private UserService us;

  @RequestMapping("/login.do")
   @ResponseBody
  public Result execute(HttpSession session,String name, String password) {

    Result rs = us.login(name, password);
    if (Integer.parseInt(rs.getStatus()) == 0 ){
      session.setAttribute("data",rs.getData());
      System.out.println(666);
      return rs;
    }else {
      return rs;
    }
//    System.out.println(name);
//    System.out.println(rs.toString());

  }
  @RequestMapping("/updatePass.do")
  @ResponseBody
  public  Result updatePassword(String user_id, String mpass, String newpass){
    Result rs = us.updatePwd( user_id, mpass, newpass);
    System.out.println(rs);
return rs;

  }
  @RequestMapping("/showUser.do")
  @ResponseBody
  public Result showUser(){
    Result rs = us.showUser();
    return  rs;


  }


  @RequestMapping("/changeUser.do")
  @ResponseBody
  public  Result changeUser(String id){

    Result rs = us.changeUser(id);
    return  rs;
  }

  @RequestMapping("/addUser.do")
  @ResponseBody
  public Result addUser(String name, String password, Integer type){
    Result rs=us.addUser(name, password, type);
    return rs;
  }
}

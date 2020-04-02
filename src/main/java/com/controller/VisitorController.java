package com.controller;

import com.result.Result;
import com.service.VisitorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @date 2020/4/1 20:25
 * @autho SWP
 * @Version 1.0
 */
@Controller
public class VisitorController {
@Autowired
  VisitorService service ;
@RequestMapping("/showVisitor.do")
@ResponseBody

public Result showAll(){
Result rs = service.showAll();
return  rs;
}

}

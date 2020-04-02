package com.service.impl;

import com.dao.VisitorDao;
import com.domain.Visitor;
import com.result.Result;
import com.service.VisitorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @date 2020/4/1 20:22
 * @autho SWP
 * @Version 1.0
 */
@Service
public class VisitorServImpl implements VisitorService {
  @Autowired
  VisitorDao dao ;
  @Override
  public Result showAll() {

    List<Visitor> list = dao.shouAll();
    return new Result("0","信息加载成功",list);
  }
}

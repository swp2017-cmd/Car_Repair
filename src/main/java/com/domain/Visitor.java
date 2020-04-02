package com.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * @date 2020/4/1 17:46
 * @autho SWP
 * @Version 1.0
 */
@Data
public class Visitor implements Serializable {
  private String id;
  private String v_name;
  private String v_time;
  private Long long_time;
}

package com.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class TroubleInfo implements Serializable {
	private String id;
	private String trouble_code;
	private String trouble_name;
	private String trouble_remark;
	private Integer status;

  public TroubleInfo() {
  }

  public TroubleInfo(String trouble_code, String trouble_name, String trouble_remark) {
    this.trouble_code = trouble_code;
    this.trouble_name = trouble_name;
    this.trouble_remark = trouble_remark;
  }
}

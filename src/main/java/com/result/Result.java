package com.result;

import lombok.Data;

@Data
public class Result {
	private String status;
	private String msg;
	private Object data;

  public Result() {
  }

  public Result(String status, String msg, Object data) {
    this.status = status;
    this.msg = msg;
    this.data = data;
  }
}

package com.bookstore.bookstore.common;



public class APIResponse {
	
	private Integer statuscode;
	private Object data;
	private String message;
	private String msgCode;
	
	public APIResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public APIResponse(Integer statuscode, Object data, String message, String msgCode) {
		super();
		this.statuscode = statuscode;
		this.data = data;
		this.message = message;
		this.msgCode = msgCode;
	}
	public Integer getStatuscode() {
		return statuscode;
	}
	public void setStatuscode(Integer statuscode) {
		this.statuscode = statuscode;
	}
	
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getMsgCode() {
		return msgCode;
	}
	public void setMsgCode(String msgCode) {
		this.msgCode = msgCode;
	}
	
	

}

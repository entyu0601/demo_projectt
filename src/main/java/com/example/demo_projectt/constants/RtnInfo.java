package com.example.demo_projectt.constants;

public enum RtnInfo {

	SUCCESSFUL("200", "���\"), 
	PARAMETER_REQUIRED("400", "���n�ѼƯʥ��A�ЦA����"), 					
	FAILED("500", "�o�Ϳ��~�A�ЦA����"), 				
	DATA_REQUIRED("417", "�ж�g������");					

	private String code;

	private String message;

	private RtnInfo(String code, String message) {
		this.code = code;
		this.message = message;
	}

	public String getCode() {
		return code;
	}

	public String getMessage() {
		return message;
	}
}

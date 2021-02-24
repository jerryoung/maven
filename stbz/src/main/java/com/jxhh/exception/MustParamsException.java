package com.jxhh.exception;

/**
 * 缺少必要参数异常
 * 当指定参数为空时抛出此异常类
 * @author Administrator
 *
 */
public class MustParamsException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public MustParamsException(String msg) {
		
		super(msg);
	}
	
	
	
}

package com.jxhh.exception;


/**
 * Api请求异常
 * 当Api请求失败时抛出次异常类
 */
public class ApiRequestException extends Exception{

        private static final long serialVersionUID = 1L;

        public ApiRequestException(String msg){
            super(msg);
        }

}

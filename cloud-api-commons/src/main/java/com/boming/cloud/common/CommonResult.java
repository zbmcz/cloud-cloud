package com.boming.cloud.common;

//@Data
//@AllArgsConstructor
//@NoArgsConstructor
public class CommonResult<T> {

    private Integer resultCode;

    private String message;

    private T data;

    public CommonResult(Integer resultCode, String message, T data){
        this.resultCode = resultCode;
        this.message = message;
        this.data = data;
    }

}
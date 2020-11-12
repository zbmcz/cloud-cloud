package com.boming.cloud.model;

//@Data
//@AllArgsConstructor
//@NoArgsConstructor
public class CommonResult<T> {

    private Integer resultCode;

    private String message;

    private T data;

    public CommonResult(){ }

    public CommonResult(Integer resultCode, String message, T data){
        this.resultCode = resultCode;
        this.message = message;
        this.data = data;
    }

    public Integer getResultCode() {
        return resultCode;
    }

    public void setResultCode(Integer resultCode) {
        this.resultCode = resultCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
package com.hss01248.ps.entity;

/**
 * Created by Administrator on 2017/7/13.
 */
public class BaseNetBean<T> {
    private int code;
    private String msg;
    private T data;


    public BaseNetBean(){
        code=0;
        msg="成功";
    }

    public int getCode() {
        return code;
    }

    public BaseNetBean setCode(int code) {
        this.code = code;
        return this;
    }

    public String getMsg() {
        return msg;
    }

    public BaseNetBean setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public T getData() {
        return data;
    }

    public BaseNetBean setData(T data) {
        this.data = data;
        return this;
    }
}

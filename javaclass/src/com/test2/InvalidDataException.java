package com.test2;

public class InvalidDataException extends RuntimeException {
    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    private String msg;

    public InvalidDataException() {

    }

    public InvalidDataException(String msg) {
        this.msg = msg;
    }
}
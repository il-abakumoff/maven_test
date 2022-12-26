package com.company;

public class FilterException extends Exception {

    private final String exceptionMessage;

    public FilterException(String message){
        this.exceptionMessage = message;
    }

    public String getExceptionMessage(){
        return exceptionMessage;
    }
}

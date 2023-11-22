package com.devexpresssuperlista.infra.exception;

public class UserNotFoundException extends Throwable{

    public UserNotFoundException(String msg) {
        super(msg);
    }
}

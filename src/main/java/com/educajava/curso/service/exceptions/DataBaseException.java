package com.educajava.curso.service.exceptions;

import javax.swing.*;

public class DataBaseException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public  DataBaseException(String msg) {
        super(msg);
    }
}

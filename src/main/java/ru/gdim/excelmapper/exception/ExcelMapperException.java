package ru.gdim.excelmapper.exception;

public abstract class ExcelMapperException extends Exception {

    public ExcelMapperException(String message) {

        super(message);
    }

    public ExcelMapperException(String message, Throwable cause) {

        super(message, cause);
    }
}

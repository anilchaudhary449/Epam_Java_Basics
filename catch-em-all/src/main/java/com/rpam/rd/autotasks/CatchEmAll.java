package com.rpam.rd.autotasks;

import java.io.FileNotFoundException;
import java.io.IOException;

public class CatchEmAll {
    protected static Exception exception = new FileNotFoundException();
    private static final String RESOURCE_MISSING_MESSAGE = "Resource is missing";
    private static final String RESOURCE_ERROR_MESSAGE = "Resource error";

    CatchEmAll() {
    }

    //You may set another exception in this field;

    public static void riskyMethod() throws Exception {
        throw exception;
    }

    public static void main(String[] args) throws Exception {
        try {
            riskyMethod();
        } catch (FileNotFoundException e) {
            throw new IllegalArgumentException(RESOURCE_MISSING_MESSAGE,e);
        }catch (IOException e){
            throw new IllegalArgumentException(RESOURCE_ERROR_MESSAGE,e);
        }
        catch (ArithmeticException | NumberFormatException e){
            System.err.print(e.getMessage());
        }
    }
}
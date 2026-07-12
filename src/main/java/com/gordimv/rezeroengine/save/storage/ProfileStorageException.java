package com.gordimv.rezeroengine.save.storage;

public class ProfileStorageException extends RuntimeException{

    public ProfileStorageException(String message){
        super(message);
    }

    public ProfileStorageException(String message, Throwable cause){
        super(message,cause);
    }
}

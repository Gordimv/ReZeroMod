package com.gordimv.rezeroengine.save.serialization;

public final class SerializationResult {

    private final boolean success;
    private final String message;

    private SerializationResult(boolean success, String message) {
        this.success = success;
        this.message = message;
    }

    public static SerializationResult success() {
        return new SerializationResult(true, "");
    }

    public static SerializationResult failure(String message) {
        return new SerializationResult(false, message);
    }

    public boolean isSuccess() {
        return success;
    }

    public String getMessage() {
        return message;
    }
}
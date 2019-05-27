package org.yenanlai.world.archetype.core;

public enum ResultCode implements BusinessErrorInterface {
    SUCCESS(0, "ok"), //
    FAIL(1, "fail"), //
    SYSTEM_ERROR(-1, "system.error"),//
    ;

    private int result;
    private String message;

    ResultCode(int result, String message) {
        this.result = result;
        this.message = message;
    }

    @Override
    public int getResult() {
        return result;
    }

    @Override
    public String getMessage() {
        return message;
    }
}

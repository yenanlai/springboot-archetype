package org.yenanlai.world.archetype.core;

public class BusinessException extends RuntimeException {

    private BusinessErrorInterface businessErrorInterface;

    public BusinessException() {
        super();
    }

    public BusinessException(String message) {
        super(message);
    }

    public BusinessException(BusinessErrorInterface businessErrorInterface) {
        super(businessErrorInterface.getMessage());
        this.businessErrorInterface = businessErrorInterface;
    }

    public BusinessException(String message, BusinessErrorInterface businessErrorInterface) {
        super(message);
        this.businessErrorInterface = businessErrorInterface;
    }

    public void setBusinessErrorInterface(BusinessErrorInterface businessErrorInterface) {
        this.businessErrorInterface = businessErrorInterface;
    }

    public BusinessErrorInterface getBusinessErrorInterface() {
        return businessErrorInterface;
    }
}

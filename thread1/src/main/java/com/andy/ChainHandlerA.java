package com.andy;

public class ChainHandlerA extends ChainHandler {
    @Override
    protected void handlerProcess() {
        System.out.println("handler by chainA");
    }
}

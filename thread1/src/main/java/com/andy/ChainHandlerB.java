package com.andy;

public class ChainHandlerB extends ChainHandler {
    @Override
    protected void handlerProcess() {
        System.out.println("handler by chainB");
    }
}

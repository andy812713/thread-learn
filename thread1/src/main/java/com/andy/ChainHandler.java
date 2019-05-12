package com.andy;

public abstract class ChainHandler {

    public final void execute(TheadChain chain) {
        handlerProcess();
        if(chain!=null){
            chain.proceed();
        }
    }

    protected abstract void handlerProcess();
}

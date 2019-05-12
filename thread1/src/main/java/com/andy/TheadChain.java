package com.andy;

import java.util.List;

public class TheadChain extends Thread{

    private List<ChainHandler> handlers;

    private int chainIndex = -1;

    public  TheadChain(List<ChainHandler> handlers){
        this.handlers = handlers;
    }

    @Override
    public void run() {
        this.proceed();
    }

    /**递归遍历整个handlers*/
    public void proceed(){
        if(chainIndex == (handlers.size() - 1)){
            System.out.println("后面没有handler了，整个结束了");
            return;
        }
        handlers.get(++chainIndex).execute(this);
    }
}

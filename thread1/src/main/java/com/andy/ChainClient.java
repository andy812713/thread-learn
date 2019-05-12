package com.andy;

import java.util.Arrays;
import java.util.List;

public class ChainClient {

    private static List<ChainHandler> handlerList = Arrays.asList(new ChainHandlerA(), new ChainHandlerB());

    public static void main(String[] args) {
        TheadChain chain = new TheadChain(handlerList);
        chain.start();
    }
}

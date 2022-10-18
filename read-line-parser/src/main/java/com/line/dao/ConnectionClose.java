package com.line.dao;

public class ConnectionClose {
    public static void close(AutoCloseable...autoCloseables) {
        for (AutoCloseable ac : autoCloseables) {
            if(ac != null){
                try{
                    ac.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

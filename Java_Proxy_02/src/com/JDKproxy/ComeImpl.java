package com.JDKproxy;

public class ComeImpl implements Come {
    /**
     *
     * @param name
     * @param ID
     */
    @Override
    public boolean comeIn(String name, String ID) {
        System.out.println("来宾访问成功...");
        return true;
    }

    /**
     *
     * @param name
     */
    @Override
    public void comeOut(String name) {
        System.out.println("来宾访问失败...");
    }
}

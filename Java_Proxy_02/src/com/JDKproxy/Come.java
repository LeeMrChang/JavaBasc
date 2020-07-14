package com.JDKproxy;

public interface Come {

    /**
     * 来宾访问
     * @param name
     * @param ID
     */
    public boolean comeIn(String name,String ID);

    /**
     * 来宾离开
     * @param name
     */
    public void comeOut(String name);


}

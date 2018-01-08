package com.netcracker;

public class ServiceFactory {
    public static Instrument violin = new Violin(4);
    public static Instrument guitar= new Guitar(6);
    public static ServiceFactory serviceFactory=new ServiceFactory();

    public ServiceFactory() {
    }

    public Instrument getViolin() {
        return violin;
    }

    public Instrument getGuitar() {
        return guitar;
    }

    public static ServiceFactory getServiceFactory(){
        return serviceFactory;
    }
}

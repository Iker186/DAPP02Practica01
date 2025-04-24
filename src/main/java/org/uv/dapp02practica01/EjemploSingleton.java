package org.uv.dapp02practica01;

public class EjemploSingleton {

    private static EjemploSingleton singleton = null;

    public static EjemploSingleton getInstance() {
        if (singleton == null) 
            singleton = new EjemploSingleton();       
        return singleton;
    }

    private EjemploSingleton() {

    }

}

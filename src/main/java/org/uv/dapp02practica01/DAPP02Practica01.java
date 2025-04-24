package org.uv.dapp02practica01;

public class DAPP02Practica01 {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        IMensaje im;
        //im = new Saludo2();
        im = new IMensaje() {
            @Override
            public void imprimir() {
                System.out.println("Otro msg");

            }

        };
        ControllerMensaje.execute(im);

//        IMensaje im;
//        im = new Saludo2();
//        im.imprimir();
//
//        im = new Despedida02();
//        im.imprimir();
//
//        //instancia anonima
//        im = new IMensaje() {
//            @Override
//            public void imprimir() {
//                System.out.println("Otro mensaje");
//            }
//
//        };
//        im.imprimir();
//        Mensaje m;
//        m = new Saludo();
//        m.imprimir();
//        
//        m = new Despedida();
//        m.imprimir();
    }
}

package com.example;

public class MainVariable {

    public static void main(String[] args) {

        int     numeroA = 1;
        System.out.println(numeroA);

        int     numeroB = 1999999999;
        int     numeroC = 999999999;
        Integer total1=numeroB*numeroC;
        System.out.println(total1);

        double  numeroD = 1.0;
        int     numeroE = 1;
        double  total2=numeroD+numeroE;
        System.out.println(total2);

        AEsMasGrandeQueB(10,1);

        String saludo="hola Mundo";
        System.out.println(saludo);



        }

        public static void AEsMasGrandeQueB(int primerNumeroAComparar,int SegundoNumeroAComparar) {

            boolean elNumeroMasGrande=primerNumeroAComparar>SegundoNumeroAComparar;

            if(elNumeroMasGrande) {

                System.out.println("El numero: "+primerNumeroAComparar+" es el más grande.");

            } else {

                System.out.println("El numero: "+SegundoNumeroAComparar+" es el más grande.");

            }

    }


}


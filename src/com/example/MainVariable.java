package com.example;

import java.util.*;


public class MainVariable {

    public static void main(String[] args) {

        //TIPOS DE DATOS

        //Tipo entero
        int     numeroA = 1;
        System.out.println(numeroA);

        //Tipo long
        long numA=10;
        System.out.println(numA);

        //Tipo short
        short numB=11;
        System.out.println(numB);

        //Tipo float
        float numJ=1.055555555f;
        System.out.println(numJ);

        //tipo decimal
        double  numeroD = 1.0d;
        double  total2=numeroD+numA;
        System.out.println(total2);

        AEsMasGrandeQueB(10,1);

        //Tipo array
        String[] nombresDelCurso=new String[]{"jose","daniel","ramon","valeria","ernestina"};
        System.out.println(Arrays.toString(nombresDelCurso));

        // Tipo char
        char primeraLetraABC='a';
        System.out.println(primeraLetraABC);

        //Tipo string
        String saludo="hola Mundo";
        System.out.println(saludo);

        //tipo ArrayList
        List<Integer> edadesDeAlumnos=new ArrayList<>();
        edadesDeAlumnos.add(1);
        edadesDeAlumnos.add(5);
        edadesDeAlumnos.add(15550);
        System.out.println(edadesDeAlumnos);;

        //tipo hashMap
        Map<Integer,String> diccionarioDePersonas = new HashMap<>();
        diccionarioDePersonas.put(40787124,"Jose Perez");
        diccionarioDePersonas.put(50388544,"Ernesto Paez");
        diccionarioDePersonas.put(12442456,"Ramon valdez");
        System.out.println(diccionarioDePersonas);
        }


        public static void AEsMasGrandeQueB(int primerNumeroAComparar,int SegundoNumeroAComparar) {

            //Tipo booleano
            boolean elNumeroMasGrande=primerNumeroAComparar>SegundoNumeroAComparar;

            if(elNumeroMasGrande) {

                System.out.println("El numero: "+primerNumeroAComparar+" es el más grande.");

            } else {

                System.out.println("El numero: "+SegundoNumeroAComparar+" es el más grande.");

            }

    }


}


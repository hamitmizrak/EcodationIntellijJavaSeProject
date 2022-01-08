package com.ecodation.ders002.method;

public class _01_Method {
    //Ctrl+Shift+A

    //1-) voidli parametresiz
    public static void voidliParametresiz(){
        System.out.println("Voidli parametresiz");
    }

    //2-) voidli parametreli
    public static void voidliParametreli(String data){
        System.out.println("Voidsiz parametreli "+data);
    }

    //3-) voidsiz parametresiz
    public static String  voidsizParametresiz() {
        return " Muhammet , Uğur ";
    }
    //4-) voidsiz parametresiz
    public static String  voidsizParametreli(String data) {
        return data;
    }

    //@Overloading
    //access modifier
    //parametre argüman nedir

    public static void main(String[] args) {
        voidliParametresiz();
        voidliParametreli("Hamit Mızrak");

        System.out.println(voidsizParametresiz());
        System.out.println(voidsizParametreli("Java"));

    }
}

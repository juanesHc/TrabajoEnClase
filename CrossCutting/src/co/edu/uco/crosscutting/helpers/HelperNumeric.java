package co.edu.uco.crosscutting.helpers;

import java.util.Scanner;

public class HelperNumeric {
	
    public static void compararNumeros(double numero1, double numero2) {
    	System.out.println("Número 1:"+numero1);
    	System.out.println("Número 2:"+numero2);
    	if (numero1!=numero2) {
    	System.out.println("Los números son diferentes");
        System.out.println((numero1 < numero2) ? "El número 1 es menor que el número 2" 
                                               : "El número 1 es mayor o igual que el número 2");
    	}else {
    		System.out.println("Los números son Iguales");
    	}
    }

    public static void estaEnIntervalo(double numero, double limiteInferior,double limiteSuperior) {

        System.out.println((numero >= limiteInferior && numero <= limiteSuperior)?"El número "+numero+" está dentro del intervalo [" + limiteInferior + ", " + limiteSuperior + "]":
        	"El número "+numero+" no está dentro del intervalo [" + limiteInferior + ", " + limiteSuperior + "].");
    }
    

    public static void esPositivoNegativoCero(double numero) {
    	if(numero==0) {
    		System.out.println("El número "+numero+" es neutro:");
    	}else {
        	System.out.println("El número "+numero+" no es neutro:");
            System.out.println((numero < 0) ? "El número es negativo." : "El número es positivo"); 		
    	}
    }
	
	
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.println("Ingrese el primer número: ");
        double numero1 = scanner.nextDouble();
        
        System.out.println("Ingrese el segundo número: ");
        double numero2 = scanner.nextDouble();
        
        System.out.println("Ingrese el limite inferior:");
        double limiteInferior=scanner.nextDouble();

        System.out.println("Ingrese el limite superior:");
        double limiteSuperior=scanner.nextDouble();
        
        compararNumeros(numero1, numero2);
        estaEnIntervalo(numero1,limiteInferior,limiteSuperior); 
        estaEnIntervalo(numero2,limiteInferior,limiteSuperior); 
        esPositivoNegativoCero(numero1);
        esPositivoNegativoCero(numero2);

        scanner.close();
    }



}


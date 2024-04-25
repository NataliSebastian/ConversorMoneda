package com.moneda;


import java.io.IOException;
import java.util.Scanner;

import org.json.JSONException;

public class MonedaApplication {

	public static void main(String[] args) throws IOException, InterruptedException, JSONException {
		
		System.out.println("Conversor de monedas\n");
		Conversor conversor = new Conversor();
		Scanner lectura = new Scanner(System.in);

	       int opcion;

	        Scanner seleciona;
	        do {
	            System.out.println("Selecciona el tipo de moneda que deseas convertir");
	            System.out.println("1. Dolar -> Peso mexicano");
	            System.out.println("2. Peso mexicano -> Dolar");
	            System.out.println("3. Dolar -> Real brasileño");
	            System.out.println("4. Real brasileño -> Dolar");
	            System.out.println("5. Dolar -> Peso colombiano");
	            System.out.println("6. Peso colombiano -> Dolar");
	            System.out.println("0. Salir \n");

	            seleciona = new Scanner(System.in);
	            opcion = seleciona.nextInt();

	            switch (opcion) {
	                case 1:
	                    System.out.println("Has elegido la opción 1");
	                    conversor.datos("USD", "MXN");
	                    break;
	                case 2:
	                    System.out.println("Has elegido la opción 2");
	                    conversor.datos("MXN", "USD");
	                    break;
	                case 3:
	                    System.out.println("Has elegido la opción 3");
	                    conversor.datos("USD", "BRL");
	                    break;
	                case 4:
	                    System.out.println("Has elegido la opción 4");
	                    conversor.datos("BRL", "USD");
	                    break;
	                case 5:
	                    System.out.println("Has elegido la opción 5");
	                    conversor.datos("USD", "COP");
	                    break;
	                case 6:
	                    System.out.println("Has elegido la opción 6");
	                    conversor.datos("COP", "USD");
	                    break;
	                case 0:
	                    System.out.println("Saliendo del programa...");
	                    break;
	                default:
	                    System.out.println("Opción inválida, intenta nuevamente");
	                    break;
	            }
	        } while (opcion != 0);

	        seleciona.close();

	    }
		
    }



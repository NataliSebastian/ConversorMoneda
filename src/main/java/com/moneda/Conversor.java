package com.moneda;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

import org.json.JSONObject;
import org.json.JSONException;

public class Conversor {
	
	public void operacion (String origen, String destino, double cantidad) throws IOException, InterruptedException, JSONException{
		
		double resultado;
		
		Scanner lectura = new Scanner(System.in);

	    String direccion = "https://v6.exchangerate-api.com/v6/392be03285e9113480191e1e/latest/"+origen;

	    HttpClient client = HttpClient.newHttpClient();
	    HttpRequest request = HttpRequest.newBuilder()
	            .uri(URI.create(direccion))
	            .build();

	    HttpResponse<String> response = client
	            .send(request, HttpResponse.BodyHandlers.ofString());

	    String json = response.body();
	    
	    JSONObject jsonResponse = new JSONObject(response.body());
	    
	    JSONObject conversionRates = jsonResponse.getJSONObject("conversion_rates");
	    
	    Double valor = conversionRates.getDouble(destino);
	    
	    
	    resultado = valor * cantidad;
	    
	    System.out.println("El resultado de convertir " + origen + " a " + destino + " es: " + resultado + "\n");
	    
		
	}
	
	public void datos (String origen, String destino) throws IOException, InterruptedException, JSONException{
		
		Scanner lectura = new Scanner(System.in);
	    System.out.println("¿Qué cantidad deseas convertir ");
	    double cantidad = lectura.nextDouble();
	    
	    operacion(origen, destino, cantidad);
	    
		
	}
	

}

package com.maps;
import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

public class ApacheHttpClientGetT {

	public  String urlMap="https://maps.googleapis.com/maps/api/place/nearbysearch/json?location=-33.8670522,151.1957362&radius=500&type=restaurant&keyword=restaurant&key=AIzaSyAYk75AiXu0MUilUkroJh2MD-eo6L5pXLU";
	public static void main(String[] args) {
	  try {/*

		DefaultHttpClient httpClient = new DefaultHttpClient();
		HttpGet getRequest = new HttpGet(
			"https://maps.googleapis.com/maps/api/place/nearbysearch/json?location=-33.8670522,151.1957362&radius=500&type=restaurant&keyword=restaurant&key=AIzaSyAYk75AiXu0MUilUkroJh2MD-eo6L5pXLU");
		getRequest.addHeader("accept", "application/json");

		HttpResponse response = httpClient.execute(getRequest);

		if (response.getStatusLine().getStatusCode() != 200) {
			throw new RuntimeException("Failed : HTTP error code : "
			   + response.getStatusLine().getStatusCode());
		}

		BufferedReader br = new BufferedReader(
                         new InputStreamReader((response.getEntity().getContent())));

		String output;
		System.out.println("Output from Server .... \n");
		while ((output = br.readLine()) != null) {
			System.out.println(output);
		}

		httpClient.getConnectionManager().shutdown();

	  */
		  HttpClient client = new DefaultHttpClient();
		  //HttpGet request = new HttpGet("https://maps.googleapis.com/maps/api/place/nearbysearch/json?location=-33.8670522,151.1957362&radius=500&type=restaurant&keyword=restaurant&key=AIzaSyAYk75AiXu0MUilUkroJh2MD-eo6L5pXLU");
		  HttpGet request = new HttpGet("http://maps.googleapis.com/maps/api/geocode/json?address=capgemini%20hyderabad&sensor=true");
		  HttpResponse response = client.execute(request);

		  // Get the response
		  BufferedReader rd = new BufferedReader
		          (new InputStreamReader(
		          response.getEntity().getContent()));

		  String line = "";
		  while ((line = rd.readLine()) != null) {
		          System.out.println(line);
		  }  
	  
	  } catch (Exception e) {

		e.printStackTrace();

	  } 

	}

}
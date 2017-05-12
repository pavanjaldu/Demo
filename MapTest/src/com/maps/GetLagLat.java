package com.maps;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URLEncoder;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.json.JSONArray;
import org.json.JSONObject;

public class GetLagLat {

	/**
	 * @param args
	 */
	String getLatUrl="http://maps.googleapis.com/maps/api/geocode/json?sensor=true&address=";
	String location="kims kondapur hyderabad";
	public static void main(String[] args) {
		GetLagLat getLagLat = new GetLagLat();
		
		getLagLat.getLatByLoc();

	}

	private void getLatByLoc() {
		try {
			String s="";
			location=URLEncoder.encode(location, "UTF-8");
			getLatUrl=getLatUrl+location;
			HttpClient client = new DefaultHttpClient();
			HttpGet request = new HttpGet(getLatUrl);
			HttpResponse response = client.execute(request);
			// Get the response
			BufferedReader rd = new BufferedReader(new InputStreamReader(
					response.getEntity().getContent()));

			String line = "";
			while ((line = rd.readLine()) != null) {
				//System.out.println(line);
				s=s+line;
			}
			//System.out.println(s);
			JSONObject jsonObj = new JSONObject(s.trim());
			System.out.println(jsonObj);
			if(jsonObj.has("results")){
				JSONArray jsonObj3=(JSONArray) jsonObj.get("results");
				JSONObject jsonObj2=jsonObj3.getJSONObject(0);
					jsonObj2=(JSONObject)jsonObj2.get("geometry");
					if(jsonObj2.has("location")){
						jsonObj2=(JSONObject)jsonObj2.get("location");
						Double lat=(Double) jsonObj2.get("lat");
						Double lng=(Double) jsonObj2.get("lng");
						System.out.println("lati ##"+lat);
						System.out.println("Lang ##"+lng);
					}
				
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

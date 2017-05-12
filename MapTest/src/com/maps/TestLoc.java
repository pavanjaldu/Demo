package com.maps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class for Servlet: TestLoc
 * 
 */
public class TestLoc extends javax.servlet.http.HttpServlet implements
		javax.servlet.Servlet {
	static final long serialVersionUID = 1L;

	/*
	 * (non-Java-doc)
	 * 
	 * @see javax.servlet.http.HttpServlet#HttpServlet()
	 */
	public TestLoc() {
		super();
	}

	/*
	 * (non-Java-doc)
	 * 
	 * @see javax.servlet.http.HttpServlet#doGet(HttpServletRequest request,
	 *      HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		try {/*
			URL url = new URL(
					"http://maps.googleapis.com/maps/api/geocode/json?address="
							+ URIUtil
									.encodeQuery("Sayaji Hotel, Near balewadi stadium, pune")
							+ "&sensor=true");
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			conn.setRequestProperty("Accept", "application/json");

			if (conn.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : "
						+ conn.getResponseCode());
			}
			BufferedReader br = new BufferedReader(new InputStreamReader((conn
					.getInputStream())));

			String output = "", full = "";
			while ((output = br.readLine()) != null) {
				System.out.println(output);
				full += output;
			}

			PincodeVerify gson = new Gson().fromJson(full, PincodeVerify.class);
			response = new IsPincodeSupportedResponse(
					new PincodeVerifyConcrete(gson.getResults().get(0)
							.getFormatted_address(), gson.getResults().get(0)
							.getGeometry().getLocation().getLat(), gson
							.getResults().get(0).getGeometry().getLocation()
							.getLng()));
			try {
				String address = response.getAddress();
				Double latitude = response.getLatitude(), longitude = response
						.getLongitude();
				if (address == null || address.length() <= 0) {
					//log.error("Address is null");
				}
			} catch (NullPointerException e) {
				e.printStackTrace();
				// log.error("Address, latitude on longitude is null");
			}
			conn.disconnect();
		*/} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/*
	 * (non-Java-doc)
	 * 
	 * @see javax.servlet.http.HttpServlet#doPost(HttpServletRequest request,
	 *      HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
	}

}
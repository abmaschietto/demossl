package com.example.demoewerton.services;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

public class TesteFeign {

	public static void main(String[] args) throws Exception {
		SSLSocketFactory sslsocketfactory = (SSLSocketFactory) SSLSocketFactory.getDefault();
		URL url = new URL("https://qualidade.gps-pamcary.com.br/telerisco/webservices/v2/status-pesquisa/");
		HttpsURLConnection conn = (HttpsURLConnection) url.openConnection();
		conn.setSSLSocketFactory(sslsocketfactory);
		InputStream inputstream = conn.getInputStream();
		InputStreamReader inputstreamreader = new InputStreamReader(inputstream);
		BufferedReader bufferedreader = new BufferedReader(inputstreamreader);

		String string = null;
		while ((string = bufferedreader.readLine()) != null) {
			System.out.println("Received " + string);
		}
	}
}

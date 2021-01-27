package com.example.demoewerton.configs;

import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;

import org.apache.http.ssl.SSLContextBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.ResourceUtils;

import feign.Client;
import feign.Feign;
import feign.Retryer;

@Configuration
public class CustomFeignConfiguration {


	@Bean
	public Feign.Builder feignBuilder() {
	    return Feign.builder()
	        .retryer(Retryer.NEVER_RETRY)
	        .client(new Client.Default(getSSLSocketFactory(), null));
	}
	
	private SSLSocketFactory getSSLSocketFactory() {
		String keyStorePassword = "v01pE";
	    char[] allPassword = keyStorePassword.toCharArray();
	    SSLContext sslContext = null;
	    try {
	        sslContext = SSLContextBuilder
	            .create()
	            .setKeyStoreType("PKCS12")
	            .loadKeyMaterial(ResourceUtils.getFile("C://Users/artur.maschietto/Desktop/pamcary/dogtag_volpe_61139432000172.p12"), allPassword, allPassword)
	            .build();
	    } catch (Exception e) { 
	    	System.out.println(e.getMessage());
	    }
	    return sslContext.getSocketFactory();
	}

	
	@Bean
	public void Config() {
		
//		System.setProperty("java.protocol.handler.pkgs", "com.sun.net.ssl.internal.www.protocol");
//		System.setProperty("javax.net.ssl.trustStoreType", "PEM");
		
		
		
//		 System.setProperty("javax.net.ssl.trustStore", 
//				 "C:/Users/artur.maschietto/Desktop/todo/ssl/DELLAVOLPE/pamcary.pfx");
//		 
//		 System.setProperty("javax.net.ssl.trustStorePassword", "v01pE");
//		System.setProperty("javax.net.ssl.trustStore", 
//				"C://Users/artur.maschietto/Desktop/pamcary/dogtag_volpe_61139432000172.p12");
		
		
//		System.setProperty("javax.net.ssl.trustStorePassword", "changeit");
		
//		"C://Program Files/java/jdk1.8.0_201/jre/lib/security/cacerts"
//		C://Program Files/java/jdk1.8.0_201/bin/
		
//      System.setProperty("javax.net.ssl.keyStore", "C://Users/artur.maschietto/Desktop/pamcary/dogtag_volpe_61139432000172.p12");
//      System.setProperty("javax.net.ssl.keyStorePassword", "v01pE");
      System.setProperty("javax.net.ssl.trustStrore", "C://Program Files/java/jdk1.8.0_201/jre/lib/security/cacerts");
      System.setProperty("javax.net.ssl.trustStorePassword", "changeit");
	
	}
}
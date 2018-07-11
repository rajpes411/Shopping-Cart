package com.rest;

import java.io.IOException;
import com.sun.jersey.api.container.httpserver.HttpServerFactory;
import com.sun.net.httpserver.HttpServer;

public class ConvertStart {
	// URL: http://localhost:9099/convert/inchcm/in2cm/30
	static final String BASE_URI = "http://localhost:9099/convert";
	
	public static void main(String[] args) {
		HttpServer server = null;
		try {
			server = HttpServerFactory.create(BASE_URI);
			server.start();
			System.out.println("Press enter to stop server");
			System.in.read();// waits for user to press enter
			server.stop(0);
			System.out.println("Server stopped by user");
		}
		catch(IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
// java com.rest.ConvertStart 
package my.cxf.server;

import javax.xml.ws.Endpoint;

import my.cxf.impl.HelloWorldImpl;

public class webServiceApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 System.out.println("web service start");
         HelloWorldImpl implementor = new HelloWorldImpl();
         String address = "http://localhost:8080/IhelloWorld";
         try {
        	 Endpoint.publish(address, implementor);
		} catch (Exception e) {
			e.printStackTrace();
		}
         System.out.println("web service started");
	}

}
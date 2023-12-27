package org.example;

import jakarta.xml.ws.Endpoint;
import org.example.web.EbankService;

public class Main {
    public static void main(String[] args) {
        Endpoint.publish("http://0.0.0.0:4545/",new EbankService());
         System.out.println("webservic started !!!");

    }
}
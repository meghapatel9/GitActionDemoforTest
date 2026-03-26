package calc.demotest;

import com.sun.net.httpserver.HttpServer;
import java.io.*;
import java.net.InetSocketAddress;

public class MyApiApplication {

    public static void main(String[] args) throws Exception {

        HttpServer server = HttpServer.create(new InetSocketAddress(8080), 0);

        server.createContext("/", exchange -> {
            String response;

            InputStream is = MyApiApplication.class
                    .getClassLoader()
                    .getResourceAsStream("index.html");

            if (is == null) {
                response = "ERROR: index.html not found";
            } else {
                response = new String(is.readAllBytes());
            }

            exchange.sendResponseHeaders(200, response.getBytes().length);
            OutputStream os = exchange.getResponseBody();
            os.write(response.getBytes());
            os.close();
        });

        server.start();
        System.out.println("Server running on http://localhost:8080");
    }
}
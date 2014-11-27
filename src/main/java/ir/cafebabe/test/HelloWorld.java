package ir.cafebabe.test;

import static spark.Spark.*;

public class HelloWorld {
    public static void main(String[] args) {
        
        setPort(80);
        externalStaticFileLocation("/home/mortezaadi/Web/");
        
        get("/", (req, res) -> {
            res.redirect("/index.html");
            return null;
        });
        
        get("/json", "application/json", (request, response) -> {
                return "{\"message\": \"This is a JSON\"}";
        });
        
        exception(Exception.class, (e, request, response) -> {
            response.status(404);
            response.body("Resource not found");
        });
    }
}
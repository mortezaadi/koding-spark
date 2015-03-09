package ir.cafebabe.koding.rest;

import ir.cafebabe.koding.services.spi.AmirService;
import ir.cafebabe.koding.services.spi.StatusService;
import spark.ResponseTransformer;

import javax.inject.Inject;

import static spark.Spark.*;

public class RestApplication {

    private final StatusService statusService;
    private final ResponseTransformer transformer;
    private final AmirService amirService;

    @Inject
    public RestApplication(AmirService service,StatusService statusService, ResponseTransformer transformer) {
        this.statusService = statusService;
        this.transformer = transformer;
        this.amirService = service;
    }

    public void start() {
        start(null);
    }

    public void start(Integer port) {
        initServer(port);
        initRequestFilter();
        initBindings();
        initExceptionHandling();
    }

    private void initRequestFilter() {
        //TODO: Auth filter
    }

    private void initServer(Integer port) {
        if (port != null)
            setPort(port);

        staticFileLocation("/public");
    }

    private void initBindings() {
        get("/", (req, res) -> {
            res.redirect("/index.html");
            return "";
        });

        get("/json", "application/json", (request, response) -> {
            return "{\"message\": \"This is a JSON\"}";
        });
        get("/status", "application/json", (request, response) -> {
            return statusService.getSystemInformation();
        }, transformer);

        get("/api/menus/", "application/json", (request, response) -> {
        	return this.amirService.getMenues();
        });
        
        get("/api/products/:id", "application/json", (request, response) -> {
        	String params = request.params("id");
        	return this.amirService.getProducts(Integer.valueOf(params));
        });
        
        get("/api/productdetails/:id", "application/json", (request, response) -> {
        	String params = request.params("id");
        	return this.amirService.getDetail(Integer.valueOf(params));
        });
    }

    private void initExceptionHandling() {
        exception(Exception.class, (e, request, response) -> {
            response.status(404);
            response.body("Resource not found");
        });
    }

}

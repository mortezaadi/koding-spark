package ir.cafebabe.koding.rest;

import ir.cafebabe.koding.services.spi.StatusService;
import spark.ResponseTransformer;

import javax.inject.Inject;

import static spark.Spark.*;

public class RestApplication {

    private final StatusService statusService;
    private final ResponseTransformer transformer;

    @Inject
    public RestApplication(StatusService statusService, ResponseTransformer transformer) {
        this.statusService = statusService;
        this.transformer = transformer;
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

    }

    private void initExceptionHandling() {
        exception(Exception.class, (e, request, response) -> {
            response.status(404);
            response.body("Resource not found");
        });
    }

}

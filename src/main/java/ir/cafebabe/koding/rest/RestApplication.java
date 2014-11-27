package ir.cafebabe.koding.rest;

import static spark.Spark.*;

import javax.inject.Inject;

import spark.ResponseTransformer;
import ir.cafebabe.koding.services.spi.StatusService;

public class RestApplication {

	private StatusService statusService;
	private ResponseTransformer transformer;
	
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
	
	private void initRequestFilter(){
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
		}, transformer );

	}
	
	private void initExceptionHandling(){
		exception(Exception.class, (e, request, response) -> {
			response.status(404);
			response.body("Resource not found");
		});
	}

}

package ir.cafebabe.koding.ioc;

import spark.ResponseTransformer;
import ir.cafebabe.koding.json.JsonTransformer;
import ir.cafebabe.koding.rest.RestApplication;
import ir.cafebabe.koding.services.StatusServiceImpl;
import ir.cafebabe.koding.services.spi.StatusService;

import com.google.inject.AbstractModule;
import com.google.inject.Singleton;

public class IocInitializer extends AbstractModule {
	 
    @Override
    protected void configure() {
        bind(RestApplication.class).in(Singleton.class);
        bind(ResponseTransformer.class).to(JsonTransformer.class).in(Singleton.class);
        bindSrvices();
    }

	protected void bindSrvices() {
		 bind(StatusService.class).to(StatusServiceImpl.class).in(Singleton.class);		
	}
 
}
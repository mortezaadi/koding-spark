package ir.cafebabe.koding.ioc;

import spark.ResponseTransformer;
import ir.cafebabe.koding.ioc.modules.ApplicationModule;
import ir.cafebabe.koding.ioc.modules.ServiceModule;
import ir.cafebabe.koding.json.JsonTransformer;
import ir.cafebabe.koding.rest.RestApplication;
import ir.cafebabe.koding.services.StatusServiceImpl;
import ir.cafebabe.koding.services.spi.StatusService;

import com.google.inject.AbstractModule;
import com.google.inject.Singleton;

public class IocInitializer extends AbstractModule {
	 
    @Override
    protected void configure() {
       install(new ApplicationModule());
       install(new ServiceModule());
       
    }
  
 
}
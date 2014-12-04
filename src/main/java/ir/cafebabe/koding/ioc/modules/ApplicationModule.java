package ir.cafebabe.koding.ioc.modules;

import com.google.inject.AbstractModule;
import com.google.inject.Singleton;
import ir.cafebabe.koding.json.JsonTransformer;
import ir.cafebabe.koding.rest.RestApplication;
import spark.ResponseTransformer;

public class ApplicationModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(RestApplication.class).in(Singleton.class);
        bind(ResponseTransformer.class).to(JsonTransformer.class).in(Singleton.class);
    }

}

package ir.cafebabe.koding.ioc;


import com.google.inject.AbstractModule;
import ir.cafebabe.koding.ioc.modules.ApplicationModule;
import ir.cafebabe.koding.ioc.modules.ServiceModule;

public class IocInitializer extends AbstractModule {

    @Override
    protected void configure() {
        install(new ApplicationModule());
        install(new ServiceModule());

    }


}
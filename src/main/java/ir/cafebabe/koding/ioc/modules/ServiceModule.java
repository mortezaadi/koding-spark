package ir.cafebabe.koding.ioc.modules;

import com.google.inject.AbstractModule;
import com.google.inject.Singleton;

import ir.cafebabe.koding.services.KhatibServiceImpl;
import ir.cafebabe.koding.services.StatusServiceImpl;
import ir.cafebabe.koding.services.spi.AmirService;
import ir.cafebabe.koding.services.spi.StatusService;

public class ServiceModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(StatusService.class).to(StatusServiceImpl.class).in(Singleton.class);
        bind(AmirService.class).to(KhatibServiceImpl.class).in(Singleton.class);
    }

}

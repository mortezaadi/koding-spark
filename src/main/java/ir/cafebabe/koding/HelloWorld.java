package ir.cafebabe.koding;

import com.google.inject.Guice;
import com.google.inject.Injector;
import ir.cafebabe.koding.ioc.IocInitializer;
import ir.cafebabe.koding.rest.RestApplication;


public class HelloWorld {

    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new IocInitializer());
        injector.getInstance(RestApplication.class).start();
    }
}
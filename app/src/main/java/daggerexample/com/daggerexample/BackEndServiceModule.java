package daggerexample.com.daggerexample;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by muhammadali
 * on 12/06/2016.
 */

@Module
public class BackEndServiceModule {


    @Provides
    @Singleton
    BackendService provideBackendService(@Named("serverUrl") String serverUrl) {
       System.out.println("Test");
        return new BackendService(serverUrl);
    }

    @Provides
    @Named("serverUrl")
    String provideServerUrl() {
        System.out.println("Test 1");
        return "http://www.vogella.com";
    }

    @Provides
    @Named("anotherUrl")
    String provideAnotherUrl() {
        System.out.println("Test 2");

        return "http://www.google.com";
    }
}

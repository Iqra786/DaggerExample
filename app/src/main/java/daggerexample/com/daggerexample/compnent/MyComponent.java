package daggerexample.com.daggerexample.compnent;

import javax.inject.Singleton;

import dagger.Component;
import daggerexample.com.daggerexample.BackEndServiceModule;
import daggerexample.com.daggerexample.BackendService;
import daggerexample.com.daggerexample.Postman;
import daggerexample.com.daggerexample.PostmanMoudle;
import daggerexample.com.daggerexample.User;
import daggerexample.com.daggerexample.UserModule;

/**
 * Created by muhammad ali
 * on 12/06/2016.
 */


@Singleton
@Component(modules = { UserModule.class, BackEndServiceModule.class , PostmanMoudle.class})
public interface MyComponent {
    BackendService createBackendService();
    User createNewUser();
    Postman ttt();
    void inject(BackendService backendService);
}

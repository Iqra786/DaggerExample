package daggerexample.com.daggerexample;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by muhammad ali
 * on 13/06/2016.
 */

@Module
public class PostmanMoudle {

    @Provides
    @Singleton
    Postman providePostman() {
        System.out.println("test I am postman");
        return new Postman(true);
    }


}

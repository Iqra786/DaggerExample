package daggerexample.com.daggerexample;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by muhammadali
 * on 12/06/2016.
 */

@Module
public class UserModule {

    @Provides
    @Singleton
    User providesUser() {
        System.out.println("test I am user");
        return new User("Lars", "Vogel");
    }


}

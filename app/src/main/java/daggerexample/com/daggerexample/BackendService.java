package daggerexample.com.daggerexample;

import javax.inject.Inject;

/**
 * Created by muhammadali
 * on 12/06/2016.
 */
public class BackendService {

    @Inject
    User user;


    public BackendService(String url) {
//        this.user = user;
    }

    public boolean callServer() {
        if (user !=null) {
            return true;
        }
        return false;
    }
}

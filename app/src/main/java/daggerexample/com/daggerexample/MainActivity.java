package daggerexample.com.daggerexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import daggerexample.com.daggerexample.compnent.DaggerMyComponent;
import daggerexample.com.daggerexample.compnent.MyComponent;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        BackendService createBackendService = DaggerMyComponent.create().createBackendService();



        MyComponent myComponent = DaggerMyComponent.builder().build();
        /*BackendService createBackendService = myComponent.createBackendService();
       myComponent.inject(createBackendService);

        boolean callServer = createBackendService.callServer();
        if (callServer) {
            System.out.println("Server call was successful. ");
        } else {
            System.out.println("Server call failed. ");
        }*/


//        System.out.println("test" +  user.toString());

//        DaggerMyComponent.create().ttt();


    }



}

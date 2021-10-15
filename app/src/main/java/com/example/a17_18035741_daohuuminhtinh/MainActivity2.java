package com.example.a17_18035741_daohuuminhtinh;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.transition.Fade;
import android.view.View;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activiti_main2);

        // here we are initializing
        // fade animation.
//        Fade fade = new Fade();
//        View decor = getWindow().getDecorView();
//
//        // here also we are excluding status bar,
//        // action bar and navigation bar from animation.
//        fade.excludeTarget(decor.findViewById(R.id.action_bar_container), true);
//        fade.excludeTarget(android.R.id.statusBarBackground, true);
//        fade.excludeTarget(android.R.id.navigationBarBackground, true);
//
//        // below methods are used for adding    // enter and exit transition.
////        getWindow().setEnterTransition(fade);
////        getWindow().setExitTransition(fade);
//
    }
}
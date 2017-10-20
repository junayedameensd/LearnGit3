package com.junayedameensd.learngit3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("Commit 1");
        setTitle("Commit 2");
        setTitle("Branch 1 Commit 1");

    }

    private void nameMethod() {
        name = "commit 1";
    }
}

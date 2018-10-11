package com.example.android.egypttourgide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
/**
 * Created by MohamedAshiba on 28/9/2018.
 */

public class MosquesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.category_main);
        getSupportFragmentManager().beginTransaction().replace(R.id.container, new MosquesFragment()).commit();
    }
}

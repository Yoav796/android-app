package com.katza.yoavfialkov;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnYoav;


        @Override
        protected void onCreate (Bundle savedInstanceState){
            super.onCreate(savedInstanceState);
            EdgeToEdge.enable(this);
            setContentView(R.layout.activity_main);

            btnYoav = findViewById(R.id.yoav);
            btnYoav.setOnClickListener(this);

        }

    @Override
    public void onClick(View view) {
        int viewId = view.getId();

        if (viewId == R.id.yoav){
            Toast.makeText(this, "was clicked" , Toast.LENGTH_LONG);
        }
    }
}


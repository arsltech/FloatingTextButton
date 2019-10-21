package com.developer.arsltech.floatingtextbutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import ru.dimorinny.floatingtextbutton.FloatingTextButton;

public class MainActivity extends AppCompatActivity {

    FloatingTextButton floatingTextButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        floatingTextButton = findViewById(R.id.action_button);

        floatingTextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Button Clicked !", Toast.LENGTH_SHORT).show();
            }
        });
    }
}

package com.dkarakay.androidcodelab;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //UI'daki elementlere erişim sağladık
        Button sendButton = (Button) findViewById(R.id.button_send);
        final EditText editName = (EditText) findViewById(R.id.edit_name);


        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = editName.getText().toString().trim();

                if (TextUtils.isEmpty(name)) {
                    Toast.makeText(getApplicationContext(),"Please enter your name",
                            Toast.LENGTH_SHORT).show();
                } else {
                    Intent i = new Intent(getApplicationContext(),ResultActivity.class);

                }
            }
        });



    }
}

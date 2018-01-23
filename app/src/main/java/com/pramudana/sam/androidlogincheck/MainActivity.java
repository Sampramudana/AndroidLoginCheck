package com.pramudana.sam.androidlogincheck;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText etUser, etPass;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etUser = (EditText) findViewById(R.id.etUser);
        etPass = (EditText) findViewById(R.id.etPass);
        btnLogin = (Button) findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String sUser = etUser.getText().toString();
                String sPass = etPass.getText().toString();

                if (sUser.isEmpty()){
                    etUser.setError("Username Tidak Boleh Kosong");
                    etUser.requestFocus();
                }else if (sPass.isEmpty()){
                    etPass.setError("Password Tidak Boleh Kosong");
                    etPass.requestFocus();
                } else {
                    if (sUser.equalsIgnoreCase("dhito") && sPass.equalsIgnoreCase("kitapastibisa")){
                        startActivity(new Intent(MainActivity.this, LoginActivity.class));
                        finish();
                    }else {
                        Toast.makeText(getApplicationContext(), "Username and Password is wrong", Toast.LENGTH_LONG).show();
                    }
                }
            }
        });
    }
}

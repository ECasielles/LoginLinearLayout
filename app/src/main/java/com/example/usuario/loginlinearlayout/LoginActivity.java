package com.example.usuario.loginlinearlayout;

import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;


/**
 * Actividad que maneja el alta de usuarios y
 * el ingreso a la aplicación.
 *
 * @author Enrique Casielles Lapeira
 * @version 1.0
 * @see android.app.Activity
 * @see AppCompatActivity
 */

public class LoginActivity extends AppCompatActivity {

    private TextView txvSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        txvSignUp = (TextView) findViewById(R.id.txvSignUp);
        txvSignUp.setPaintFlags(txvSignUp.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
    }

}

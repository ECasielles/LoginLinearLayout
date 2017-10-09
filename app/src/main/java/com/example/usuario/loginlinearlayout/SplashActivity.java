package com.example.usuario.loginlinearlayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/**
 * Actividad pantalla de llegada de la aplicación.
 *
 * @author Enrique Casielles Lapeira
 * @version 1.0
 * @see android.app.Activity
 * @see AppCompatActivity
 */
public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
    }
}

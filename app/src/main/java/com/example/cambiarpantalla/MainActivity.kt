package com.example.cambiarpantalla

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        //Reconocer el boton para cambiar pantalla
        val btnCambiarPantalla: Button = findViewById(R.id.btnCambiarPantalla)
        //Asignarle un evento al boton
        btnCambiarPantalla.setOnClickListener {
            fnCambiarPantalla()
        }
    }

    private fun fnCambiarPantalla() {
        //Cambiar pantalla
        val intent = Intent(this,pantalla2::class.java)
        startActivity(intent)
    }
}












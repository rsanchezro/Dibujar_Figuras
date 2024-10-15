package com.example.dibujar_figuras

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var areaDibujo =findViewById<AreaDibujo>(R.id.view2)

        var boton_circulo:Button=findViewById(R.id.button_circulo)
        var boton_rect:Button=findViewById(R.id.button_cuadrado)

        boton_circulo.setOnClickListener {
            areaDibujo.dibujarCirculo()
        }
        boton_rect.setOnClickListener {

            areaDibujo.dibujarRectangulo(1F,1F,1F,1F)
        }




    }
}
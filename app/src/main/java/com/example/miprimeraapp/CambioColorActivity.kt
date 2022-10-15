package com.example.miprimeraapp

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.example.miprimeraapp.databinding.ActivityCambioColorBinding

class CambioColorActivity : PintorMenuActivity() {

     lateinit var cambioColorBinding : ActivityCambioColorBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        cambioColorBinding = ActivityCambioColorBinding.inflate(layoutInflater)
        setContentView(cambioColorBinding.root)
        allocateActivityTitle("Cambio de Color")

        val btnVerde : Button = findViewById(R.id.btnVerde)
        val btnRojo : Button = findViewById(R.id.btnRojo)
        val btnAzul : Button = findViewById(R.id.btnAzul)

        val txt : EditText = findViewById(R.id.txtModificarColor)



        btnAzul?.setOnClickListener {
            txt.setTextColor(Color.BLUE)
        }
        btnRojo?.setOnClickListener {
            txt.setTextColor(Color.RED)
        }
        btnVerde?.setOnClickListener {
            txt.setTextColor(Color.GREEN)
        }

    }
}
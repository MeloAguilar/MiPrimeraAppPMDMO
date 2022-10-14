package com.example.miprimeraapp

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.TypedValue
import android.view.View
import android.widget.Button
import android.widget.EditText
import com.example.miprimeraapp.databinding.ActivityAgrandarTextoBinding
import com.example.miprimeraapp.databinding.ActivitySumaBinding
import java.time.format.FormatStyle
import java.time.format.TextStyle

class AgrandarTextoActivity : PintorMenuActivity() {


    lateinit var activityAgrandarTextoBinding : ActivityAgrandarTextoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

         activityAgrandarTextoBinding = ActivityAgrandarTextoBinding.inflate(layoutInflater)
        setContentView(activityAgrandarTextoBinding.root)
        allocateActivityTitle("Modificar Tamaño Texto")
        val btnNegrita = findViewById<Button>(R.id.btnNegrita)
        val btnRojo = findViewById<Button>(R.id.btnColorRojo)
        btnNegrita?.setOnClickListener{
            textoANegrita()
        }
        btnRojo?.setOnClickListener{
            textoRojo()
        }
        val menos = findViewById<Button>(R.id.btnLetraMinuscula)
        val mas = findViewById<Button>(R.id.btnLetraGigante)
        val introducido = findViewById<EditText>(R.id.txtModificar)
        var tamano = 20

        menos.setOnClickListener {
            if (tamano > 5){
                tamano -= 1
                introducido.setTextSize(TypedValue.COMPLEX_UNIT_SP, tamano.toFloat());
            }

        }

        mas.setOnClickListener {
            if (tamano < 40){
                tamano += 1
                introducido.setTextSize(TypedValue.COMPLEX_UNIT_SP, tamano.toFloat());
            }

        }
    }

    fun aumentarLetra() {
        val texto : EditText = findViewById(R.id.txtModificar)
        if(texto.textSize > "2".toFloat() && texto.textSize < "100".toFloat()){
            texto.textSize = texto.textSize.plus("0.2".toFloat())

        }
    }

    fun disminuirLetra() {
        val texto : EditText = findViewById(R.id.txtModificar)

        if(texto.textSize > "2".toFloat() && texto.textSize < "100".toFloat()){
            texto.textSize = texto.textSize.minus("0.2".toFloat())
        }
    }

    fun textoANegrita() {
        val texto : EditText = findViewById(R.id.txtModificar)

    }

    fun textoRojo() {
        val texto : EditText = findViewById(R.id.txtModificar)

        texto.setTextColor(Color.RED)
    }



    fun pipo(){

    }
}
package com.example.miprimeraapp

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
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
    }

    fun aumentarLetra(view: View) {
        val texto : EditText = findViewById(R.id.txtModificar)
        if(texto.textSize > "2".toFloat() && texto.textSize < "50".toFloat()){
            texto.textSize = texto.textSize.plus("0.2".toFloat())

        }
    }

    fun disminuirLetra(view: View) {
        val texto : EditText = findViewById(R.id.txtModificar)

        if(texto.textSize > "2".toFloat() && texto.textSize < "50".toFloat()){
            texto.textSize = texto.textSize.minus("0.2".toFloat())
        }
    }

    fun textoANegrita(view: View) {
        val texto : EditText = findViewById(R.id.txtModificar)

    }

    fun textoRojo(view : View) {
        val texto : EditText = findViewById(R.id.txtModificar)

        texto.setTextColor(Color.RED)
    }
}
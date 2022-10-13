package com.example.miprimeraapp

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import com.example.miprimeraapp.databinding.ActivitySumaBinding

class SumaActivity : PintorMenuActivity() {


    lateinit var activitySumaBinding : ActivitySumaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activitySumaBinding = ActivitySumaBinding.inflate(layoutInflater)
        setContentView(activitySumaBinding.root)
        allocateActivityTitle("Suma")
    }

    fun sumar(view: View) {
        val num1 : EditText = findViewById(R.id.num_suma_1)
        val num2 : EditText = findViewById(R.id.num_suma_2)
        val resultado = (num1.text.toString().toDouble()) + (num2.text.toString().toDouble())
        val textView : TextView = findViewById<TextView>(R.id.txtResultado)
        textView.text = "Resultado: $resultado"

    }
}
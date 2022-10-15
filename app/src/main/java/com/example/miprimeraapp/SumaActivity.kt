package com.example.miprimeraapp

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.miprimeraapp.databinding.ActivitySumaBinding

class SumaActivity : PintorMenuActivity() {


    lateinit var activitySumaBinding : ActivitySumaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activitySumaBinding = ActivitySumaBinding.inflate(layoutInflater)
        setContentView(activitySumaBinding.root)
        overridePendingTransition(0,0)
        allocateActivityTitle("Suma")
        val btn : Button = findViewById(R.id.btnSuma)
        val resultado : TextView = findViewById(R.id.txtResultado)
        btn?.setOnClickListener {
            sumar()
        }
    }


    /**
     * Funcion que se encarga de recoger los dos EditText que se en cuentran en el layout
     * parsea el string a Double y realiza la suma, después lo muestra en el TextView "resultado"
     */
    fun sumar() {
        val num1 = findViewById<EditText>(R.id.num_suma_1)
        val num2 : EditText = findViewById(R.id.num_suma_2)
        val resultado : Double = (num1.text.toString().toDouble()) + (num2.text.toString().toDouble())
        val textView = findViewById<TextView>(R.id.txtResultado)
        textView.text = "Resultado: $resultado"
    }

}
package com.example.miprimeraapp

import android.graphics.Color
import android.graphics.Typeface
import android.os.Bundle
import android.util.TypedValue
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import com.example.miprimeraapp.databinding.ActivityCheckBoxesBinding
import com.google.android.material.tabs.TabLayout.Mode

class CheckBoxesActivity : PintorMenuActivity() {


    lateinit var activityAgrandarTextoBinding: ActivityCheckBoxesBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        activityAgrandarTextoBinding = ActivityCheckBoxesBinding.inflate(layoutInflater)
        setContentView(activityAgrandarTextoBinding.root)
        allocateActivityTitle("Diversos")
        val texto: EditText = findViewById(R.id.txtModificar)
        val btnAgrandar: RadioButton = findViewById(R.id.btnLetraGigante)
        val btnDisminuir: RadioButton = findViewById(R.id.btnLetraMinuscula)
        val btnBold: RadioButton = findViewById(R.id.btnNegrita)
        val btnRojo: RadioButton = findViewById(R.id.btnColorRojo)
        val btnReiniciar : Button = findViewById(R.id.btnReiniciar)

        btnAgrandar?.setOnClickListener {
            if (!btnAgrandar.isSelected) {
                texto.setTextSize(TypedValue.COMPLEX_UNIT_SP, 100F)
            }
        }
            btnDisminuir?.setOnClickListener {
                if (!btnDisminuir.isSelected) {
                    texto.setTextSize(TypedValue.COMPLEX_UNIT_SP, 5F)
                }
            }
        btnRojo?.setOnClickListener {
            if (!btnRojo.isSelected) {
                texto.setTextColor(Color.RED)
            }
        }


        btnBold?.setOnClickListener {
            if(!btnBold.isSelected){
                texto.setTypeface(null, Typeface.BOLD)
            }
        }

        //Boton que se encarga de reiniciar el texto ya que no entiendo como deseleccionar un radio
        btnReiniciar?.setOnClickListener {
            btnBold.isChecked = false
            btnRojo.isChecked = false
            btnDisminuir.isChecked = false
            btnAgrandar.isChecked = false
            texto.setTextSize(TypedValue.COMPLEX_UNIT_SP, 20F)
            texto.setTextColor(Color.BLACK)
            texto.setTypeface(null, Typeface.NORMAL)
        }



    }
}
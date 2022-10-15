package com.example.miprimeraapp

import android.os.Bundle
import android.text.TextUtils
import android.view.Gravity
import android.view.View
import android.view.View.*
import android.widget.Button
import android.widget.EditText
import com.example.miprimeraapp.databinding.ActivityAlinearTextBinding
import com.example.miprimeraapp.databinding.ActivitySumaBinding
import java.awt.font.TextAttribute
import java.time.format.TextStyle
import kotlin.math.max

class AlinearText : PintorMenuActivity() {

    lateinit var activityAlinearTextoBinding : ActivityAlinearTextBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        activityAlinearTextoBinding = ActivityAlinearTextBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(activityAlinearTextoBinding.root)
        overridePendingTransition(0,0)
        allocateActivityTitle("Alinear Texto")

        val btnIzd : Button = findViewById(R.id.btnAlinearIzquierda)
        val btnDcha : Button = findViewById(R.id.btnAlinearDerecha)
        val txInput : EditText = findViewById(R.id.txtInputAlign)




        btnIzd?.setOnClickListener {
            txInput.textAlignment = TEXT_ALIGNMENT_TEXT_START
        }
        btnDcha?.setOnClickListener {
            txInput.textAlignment = TEXT_ALIGNMENT_TEXT_END
        }



    }
}
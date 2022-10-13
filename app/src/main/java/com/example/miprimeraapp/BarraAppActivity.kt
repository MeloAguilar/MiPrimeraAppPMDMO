package com.example.miprimeraapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.miprimeraapp.databinding.ActivityBarraAppBinding

class BarraAppActivity : PintorMenuActivity() {


    lateinit var bindingBarraApp : ActivityBarraAppBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingBarraApp = ActivityBarraAppBinding.inflate(getLayoutInflater())
        setContentView(bindingBarraApp.getRoot())
        overridePendingTransition(0,0)
        allocateActivityTitle("Inicio")
    }
}
package com.example.miprimeraapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.miprimeraapp.databinding.ActivityBarraAppBinding
import com.example.miprimeraapp.databinding.ActivityMainBinding

class MainActivity : PintorMenuActivity() {

    lateinit var bindingBarraApp : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingBarraApp = ActivityMainBinding.inflate(getLayoutInflater())
        setContentView(bindingBarraApp.getRoot())

        allocateActivityTitle("Main")
    }
}
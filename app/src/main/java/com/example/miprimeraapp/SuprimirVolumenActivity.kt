package com.example.miprimeraapp

import android.content.Context
import android.media.AudioManager
import android.os.Bundle
import android.widget.ImageButton
import com.example.miprimeraapp.databinding.ActivitySuprimirVolumenBinding


class SuprimirVolumenActivity : PintorMenuActivity() {
    private lateinit var audio: AudioManager
    lateinit var asvb : ActivitySuprimirVolumenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //Las primeras lineas sirven para superponer el layout completo,
        //con el vanView, la barra de la app y la página que queremos
        asvb = ActivitySuprimirVolumenBinding.inflate(layoutInflater)
        setContentView(asvb.root)
        overridePendingTransition(0,0)
        allocateActivityTitle("Suprimier Volumen")

        val btn : ImageButton = findViewById(R.id.imagenVolumen)
        audio = getSystemService(Context.AUDIO_SERVICE) as AudioManager
        var salir = false
        btn?.setOnClickListener{

            if(salir){
                audio.adjustVolume(0, 1)
                salir = false
                btn.setImageResource(R.drawable.volume_up)
            }else{
                audio.adjustVolume(0,0)
                salir = true
                btn.setImageResource(R.drawable.mute)
            }

        }
    }
}
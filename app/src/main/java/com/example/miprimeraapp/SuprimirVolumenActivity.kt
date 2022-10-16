package com.example.miprimeraapp

import android.content.Context
import android.media.AudioManager
import android.os.Bundle
import android.widget.ImageButton
import com.example.miprimeraapp.databinding.ActivitySuprimirVolumenBinding


class SuprimirVolumenActivity : PintorMenuActivity() {


    //Variable que contendrá los datos de audio
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

        //Recogemos los permisos para acceder al audio del dispositivo
        audio = getSystemService(Context.AUDIO_SERVICE) as AudioManager

        //Variable que controla que imagen se encuentra en el ImageButton
        var muted = false


        //Al pulsar la imagen, esta se modificará y también muteará o desmuteará el volumen del dispositivo
        btn?.setOnClickListener{

            if(muted){
                //Ajustamos el volumen a estado activo
                audio.adjustVolume(0, 1)
                muted = false
                //Cambiamos la imagen del ImageButton
                btn.setImageResource(R.drawable.volume_up)
            }else{
                //Ajustamos el volumen a estado inactivo
                audio.adjustVolume(0,0)
                muted = true
                //Cambiamos la imagen del ImageButton
                btn.setImageResource(R.drawable.mute)
            }

        }
    }
}
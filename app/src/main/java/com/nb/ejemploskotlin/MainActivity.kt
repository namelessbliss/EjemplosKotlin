package com.nb.ejemploskotlin

import android.graphics.drawable.AnimationDrawable
import android.os.Bundle
import android.os.Handler
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import java.util.*


class MainActivity : AppCompatActivity() {

    lateinit var dado: ImageView
    lateinit var animation: AnimationDrawable
    lateinit var toast: Toast

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnDado: Button = findViewById(R.id.btnLanzarDado)

        dado = findViewById(R.id.ivDado)
        dado.setBackgroundResource(R.drawable.dado_vacio)

        toast = Toast.makeText(this, "", Toast.LENGTH_SHORT);

        btnDado.setOnClickListener {
            generarDadoAleatorio()
        }
    }

    private fun generarDadoAleatorio() {
        toast.cancel()
        val randomInt = Random().nextInt(6) + 1

        toast = Toast.makeText(this, "Obtuviste: " + randomInt, Toast.LENGTH_SHORT)

        iniciarAnimacion()


        animation.onAnimationFinished {
            val imageToLoad = when (randomInt) {
                1 -> R.drawable.dado_1
                2 -> R.drawable.dado_2
                3 -> R.drawable.dado_3
                4 -> R.drawable.dado_4
                5 -> R.drawable.dado_5
                6 -> R.drawable.dado_6
                else -> R.drawable.dado_vacio
            }

            dado.setBackgroundResource(imageToLoad)
            toast.show()
        }

    }

    fun iniciarAnimacion() {

        dado.setBackgroundResource(R.drawable.animation_dado)

        //Obtiene animacion y castea
        animation = dado.getBackground() as AnimationDrawable;
        animation.start()
    }

    fun AnimationDrawable.onAnimationFinished(block: () -> Unit) {
        var duration: Long = 0
        for (i in 0..numberOfFrames) {
            duration += getDuration(i)
        }
        Handler().postDelayed({
            block()
        }, duration + 200)
    }
}

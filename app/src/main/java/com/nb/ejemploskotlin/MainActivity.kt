package com.nb.ejemploskotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    //Variables cuyo valor no puede ser modificado
    val PI: Float = 3.14f

    //Variable que permite modificar valor
    var contador: Int = 0;

    var saludo = "Hello world"

    //variable nula
    var saludo2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}

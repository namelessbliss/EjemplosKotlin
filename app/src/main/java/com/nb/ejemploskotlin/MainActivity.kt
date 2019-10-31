package com.nb.ejemploskotlin

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var contador = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //obtener viewcomponent con el mismo nombre de su id
        btnContador.setOnClickListener { view ->
            contador++
            Toast.makeText(this, "Clic en contador: $contador", Toast.LENGTH_SHORT).show()
        }
    }
}

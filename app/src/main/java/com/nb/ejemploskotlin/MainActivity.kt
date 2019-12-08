package com.nb.ejemploskotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.nb.ejemploskotlin.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
}

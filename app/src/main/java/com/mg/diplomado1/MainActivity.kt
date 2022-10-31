package com.mg.diplomado1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("hola", "se creo onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.d("hola", "se creo onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("hola", "se creo onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("hola", "se creo onPause")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("hola", "se creo onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("hola", "se creo onDestroy")
    }
}
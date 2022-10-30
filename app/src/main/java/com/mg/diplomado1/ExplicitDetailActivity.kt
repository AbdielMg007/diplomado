package com.mg.diplomado1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import android.widget.Toast
import androidx.core.os.bundleOf

class ExplicitDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_explicit_detail)

        val tvName = findViewById<TextView>(R.id.tvName)
        val tvLastname = findViewById<TextView>(R.id.tvLastname)
        val tvAge = findViewById<TextView>(R.id.tvAge)

        intent.extras?.let { bundle ->

            if (bundle.containsKey("KEY_NAME")){
                val name = bundle.getString("KEY_NAME")
                tvName.text = name
            }
            if (bundle.containsKey("KEY_LASTNAME")){
                val lastname = bundle.getString("KEY_LASTNAME")
                tvLastname.text = lastname
            }
            if (bundle.containsKey("KEY_AGE")){
                val age = bundle.getInt("KEY_AGE")
                tvAge.text = age.toString()
            }

            if (bundle.containsKey("KEY_USER")){
                val user: Usuarios = bundle.getSerializable("KEY_USER") as Usuarios
                tvName.text = user.name
                tvLastname.text = user.lastName
                tvAge.text = user.age.toString()
            }

        } ?: showEmptyInfo()
    }

    private fun showEmptyInfo() {
        Toast.makeText(this, "Extras vacios", Toast.LENGTH_SHORT).show()
    }
}
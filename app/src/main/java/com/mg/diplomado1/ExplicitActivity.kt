package com.mg.diplomado1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class ExplicitActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_explicit)

        val btSent = findViewById<Button>(R.id.bt_sent)
        val etName = findViewById<EditText>(R.id.etName).text
        val etLastName = findViewById<EditText>(R.id.etLastName).text
        val etAge = findViewById<EditText>(R.id.etAge).text

        btSent.setOnClickListener {
            if (etName.isEmpty() && etLastName.isEmpty() && etAge.isEmpty()){
                Toast.makeText(this, "Campos vacio", Toast.LENGTH_SHORT).show()
            }else{
                val intent = Intent(this, ExplicitDetailActivity::class.java).apply{
                    val user = Usuarios("", "", 0)
                    user.name = etName.toString()
                    user.lastName = etLastName.toString()
                    user.age = etAge.toString().toInt()
                    putExtra("KEY_USER", user)
                }
                startActivity(intent)
            }
        }
    }
}
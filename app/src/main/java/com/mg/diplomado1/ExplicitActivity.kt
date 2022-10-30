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
        val etName = findViewById<EditText>(R.id.etName)

        btSent.setOnClickListener {

            val textName = etName.text.toString()

            if (textName.isEmpty()){
                Toast.makeText(this, "Nombre vacio", Toast.LENGTH_SHORT).show()
            }else{
                val intent = Intent(this, ExplicitDetailActivity::class.java).apply{
                    putExtra("KEY_NAME", "Abdiel")
                    putExtra("KEY_LASTNAME", "MG" )
                    putExtra("KEY_AGE", 22)

                    val user = Usuarios("Juan", "Hernzandez", 20)
                    user.name = textName
                    putExtra("KEY_USER", user)
                }
                startActivity(intent)
            }


        }
    }
}
package com.example.tasca3

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nombre = findViewById<EditText>(R.id.etNombre)
        val email = findViewById<EditText>(R.id.etEmail)
        val bio = findViewById<EditText>(R.id.etBio)
        val imagen = findViewById<EditText>(R.id.etImagen)
        val boton = findViewById<Button>(R.id.btnGuardar)

        boton.setOnClickListener {

            val intent = Intent(this, ProfileActivity::class.java)

            intent.putExtra("nombre", nombre.text.toString())
            intent.putExtra("email", email.text.toString())
            intent.putExtra("bio", bio.text.toString())
            intent.putExtra("imagen", imagen.text.toString())

            startActivity(intent)
        }
    }
}

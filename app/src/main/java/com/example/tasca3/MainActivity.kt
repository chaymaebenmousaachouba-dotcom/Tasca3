package com.example.tasca3

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

const val NOMBRE = "nombre"
const val EMAIL = "email"
const val BIO = "bio"
const val IMAGEN = "imagen"

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

            intent.putExtra(NOMBRE, nombre.text.toString())
            intent.putExtra(EMAIL, email.text.toString())
            intent.putExtra(BIO, bio.text.toString())
            intent.putExtra(IMAGEN, imagen.text.toString())

            startActivity(intent)
        }
    }
}

package com.example.tasca3

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide

class ProfileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val nombre = findViewById<TextView>(R.id.tvNombre)
        val email = findViewById<TextView>(R.id.tvEmail)
        val bio = findViewById<TextView>(R.id.tvBio)
        val imagen = findViewById<ImageView>(R.id.imgPerfil)
        val boton = findViewById<Button>(R.id.btnVolver)

        nombre.text = intent.getStringExtra("nombre")
        email.text = intent.getStringExtra("email")
        bio.text = intent.getStringExtra("bio")

        val url = intent.getStringExtra("imagen")

       // Glide.with(this).load(url).into(imagen)

        // profe:
        Glide.with(imagen).load("https://www.pixartprinting.it/blog/wp-content/uploads/2021/06/1_Mona_Lisa_300ppi.jpg").into(imagen)

        boton.setOnClickListener {
            finish()
        }
    }
}

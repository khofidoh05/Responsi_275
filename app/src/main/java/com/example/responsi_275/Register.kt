package com.example.responsi_275

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_register.*

class Register : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        button_daftar.setOnClickListener {
            val email = findViewById<EditText>(R.id.isiemail)
            val password = findViewById<EditText>(R.id.isipassword)
            if (email.text.isEmpty() || password.text.isEmpty()) {
                Toast.makeText(this, "Email/Password Harus Diisi", Toast.LENGTH_SHORT).show()
            }
            if (email.text.isNotEmpty() && password.text.isNotEmpty()) {
                val intent = Intent(this, Priview::class.java)
                startActivity(intent)
            }
        }

        button_daftar.setOnClickListener {
            val nama = nama.text.toString()
            val email = isiemail.text.toString()
            val password = isipassword.text.toString()
            val alamat = alamat.text.toString()
            val hp = hp.text.toString()

            val intent = Intent(this@Register, Priview::class.java)
            intent.putExtra("Nama", nama)
            intent.putExtra("Email", email)
            intent.putExtra("Password", password)
            intent.putExtra("Alamat", alamat)
            intent.putExtra("No.Hp", hp)
            startActivity(intent)

        }
    }
}
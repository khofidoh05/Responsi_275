package com.example.responsi_275

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_priview.*

class Priview : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_priview)

        var intent = intent
        val nama = intent.getStringExtra("Nama")
        val email = intent.getStringExtra("Email")
        var password = intent.getStringExtra("Password")
        val alamat = intent.getStringExtra("Alamat")
        val hp = intent.getStringExtra("No.Hp")

        val hasil = findViewById<TextView>(R.id.text_hasil)
        hasil.text = "NIM : " + nama + "\nNama: " + email + "\nNilai: " + password + "\nAlamat : " + alamat + "\nNo.Hp :" + hp

        login2.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
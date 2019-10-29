package com.example.responsi_275

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_login.setOnClickListener {
            val email = email.text.toString()
            val password = password.text.toString()
            if (email.isEmpty() || password.isEmpty()) {
                Toast.makeText(this, "Please Insert Email and Password", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            if (email == "khofidoh@gmail.com" || password == "275") {
                val intent = Intent(this, DashBoard::class.java)
                startActivity(intent)
            }
        }

        daftar.setOnClickListener{
            val intent = Intent (this, Register::class.java)
            startActivity(intent)
        }
    }
}

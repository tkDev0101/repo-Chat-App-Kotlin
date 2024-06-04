package com.example.app_chat_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val btnTest : Button = findViewById(R.id.btn_Test)


        // BTN Listener -> Go 2 Sign Up Page
        btnTest.setOnClickListener{
            val intent = Intent(this, Login::class.java)
            startActivity(intent)
        }


    }
}
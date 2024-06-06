package com.example.app_chat_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.widget.SwitchCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val btnTest : Button = findViewById(R.id.btn_Test)


        val switch = findViewById<SwitchCompat>(R.id.switch1)

        switch. setOnCheckedChangeListener { buttonView, isChecked ->

            if()

        }



        // BTN Listener -> Go 2 Sign Up Page
        btnTest.setOnClickListener{
            val intent = Intent(this, Login::class.java)
            startActivity(intent)
        }


    }
}
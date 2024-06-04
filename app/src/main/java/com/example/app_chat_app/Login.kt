package com.example.app_chat_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        //Declare && Assign Variables
        //val name : Type = findViewById(R.id)

        val edtEmail : EditText = findViewById(R.id.ed_email)
        val edtPassword : EditText = findViewById(R.id.ed_password)
        val btnLogin : Button = findViewById(R.id.btn_login)
        val btnSignUpLP : Button = findViewById(R.id.btn_signUp)


        // BTN Listener -> Login onto App ->
        btnLogin.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        // BTN Listener -> Go 2 Sign Up Page
        btnSignUpLP.setOnClickListener{
            val intent = Intent(this, SignUp::class.java)
            startActivity(intent)
        }




    }
}
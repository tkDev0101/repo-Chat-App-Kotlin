package com.example.app_chat_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class SignUp : AppCompatActivity() {

    //Declare Variables
    private lateinit var edtUsername: EditText
    private lateinit var edtEmail: EditText
    private lateinit var edtPassword: EditText
    private lateinit var edtConfirmPassword: EditText
    private lateinit var btnSignUp: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        edtUsername = findViewById(R.id.ed_username)
        edtEmail = findViewById(R.id.ed_email)
        edtPassword = findViewById(R.id.ed_email)
        edtConfirmPassword = findViewById(R.id.ed_email)
        btnSignUp = findViewById(R.id.btn_signUp)



        // BTN Listener -> Go 2 Login Page once Signed Up
        btnSignUp.setOnClickListener{
            val intent = Intent(this, Login::class.java)
            startActivity(intent)
        }

    }
}
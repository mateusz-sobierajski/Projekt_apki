package com.example.projekt_apki

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton

class LoginScreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        setContentView(R.layout.activity_login)
        val loginButton = this.findViewById<AppCompatButton>(R.id.LoginButton)

        loginButton.setOnClickListener { logIn() }
        //registrationButton.setOnClickListener(View.OnClickListener { openRegistrationPage() })
    }

    private fun openRegistrationPage() {
    }

    private fun logIn() {
        val intent = Intent(this, ShoppingCart::class.java)
        startActivity(intent)
    }

}

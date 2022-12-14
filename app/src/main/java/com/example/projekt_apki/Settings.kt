package com.example.projekt_apki

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton

class Settings : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)
        val logoutButton = this.findViewById<AppCompatButton>(R.id.LogoutButton)
        logoutButton.setOnClickListener({ logout() })
    }

    private fun logout() {
        val intent = Intent(this, LoginScreen::class.java)
        startActivity(intent)
    }
}
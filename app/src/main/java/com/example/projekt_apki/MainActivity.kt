package com.example.projekt_apki

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        setContentView(R.layout.activity_main)

        val logoutButton = this.findViewById<AppCompatButton>(R.id.SettingButton)
        logoutButton.setOnClickListener {
            goToSettings()
        }
    }

    private fun goToSettings() {
        val intent = Intent(this, Settings::class.java)
        startActivity(intent)
    }
}
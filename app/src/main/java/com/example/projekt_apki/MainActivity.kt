package com.example.projekt_apki

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        setContentView(R.layout.activity_main)
        //val textViewFavourite = findViewById<TextView>(textViewFav)
        //textViewFavourite.text = DataSourceFavourite().loadCoffees().size.toString()

        val loginStart = this.findViewById<AppCompatButton>(R.id.buttonStartMain)
        loginStart.setOnClickListener {
            goToLoginScreen()
        }

        val settingsButton = this.findViewById<AppCompatButton>(R.id.SettingButton)
        settingsButton.setOnClickListener {
            goToSettings()
        }
    }

    private fun goToSettings() {
        val intent = Intent(this, Settings::class.java)
        startActivity(intent)
    }

    private fun goToLoginScreen(){
        val intent = Intent(this, LoginScreen::class.java)
        startActivity(intent)
    }
}
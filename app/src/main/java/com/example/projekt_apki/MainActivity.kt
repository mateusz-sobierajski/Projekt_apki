package com.example.projekt_apki

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatTextView
import com.example.projekt_apki.R.id.textViewFav

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        setContentView(R.layout.activity_favourite)
        val textViewFavourite = findViewById<TextView>(textViewFav)
        textViewFavourite.text = DataSourceFavourite().loadCoffees().size.toString()
        //val logoutButton = this.findViewById<AppCompatButton>(R.id.SettingButton)
        //logoutButton.setOnClickListener {
        //    goToSettings()
        //}
    }

    private fun goToSettings() {
        val intent = Intent(this, Settings::class.java)
        startActivity(intent)
    }
}
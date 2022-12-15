package com.example.projekt_apki

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView

class FavouriteStuff : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_favourite)
        val textViewFavourite = findViewById<RecyclerView>(R.id.RecyclerViewFav)
        //textViewFavourite.addItemDecoration()
        //textViewFavourite. = DataSourceFavourite().loadCoffees().size.toString()
    }
}
package com.example.projekt_apki

class DataSourceFavourite {
    fun loadCoffees(): List<Coffee> {
        return listOf<Coffee>(
            Coffee(R.string.coffee1),
            Coffee(R.string.coffee2),
            Coffee(R.string.coffee3),

        )
    }
}
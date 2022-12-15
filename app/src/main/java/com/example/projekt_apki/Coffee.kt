package com.example.projekt_apki

class Coffee(coffeePrice: Int) {

    private var price: Int = coffeePrice


    @Override
    override fun toString(): String {
        return "a"
    }

    fun getPrice(): Int {
        return this.price
    }

    companion object {
        const val coffee_ID = 0
    }
}
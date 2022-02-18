package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class VendingMachine : AppCompatActivity() {
    var insertedMoney: Double = 0.0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vending_machine)

        //inserts all the prices for easy change if needed
        prices()

        //listen for all the buttons to insert money
        val add50: Button = findViewById(R.id.button_50)
        add50.setOnClickListener() { addMoney(.50) }

        val add25: Button = findViewById(R.id.button_25)
        add25.setOnClickListener(){ addMoney(.25) }

        val add1: Button = findViewById(R.id.button1_0)
        add1.setOnClickListener(){ addMoney(1.0) }
    }

    private fun addMoney(money: Double){
        insertedMoney += money
        val totalMoney: TextView = findViewById(R.id.moneyInserted)
        totalMoney.text = insertedMoney.toString()
    }

    private fun prices() {
    //buy Blue Doritos
        val bDoritoName = "Cool Ranch Doritos"
        val blueDoritosPrice = 2.25
        val blueDoritos: TextView = findViewById(R.id.BDorito)
        blueDoritos.text = blueDoritosPrice.toString()

        val buyBlueDoritos: Button = findViewById(R.id.buyBlue)
        buyBlueDoritos.setOnClickListener(){ buyFood(blueDoritosPrice, bDoritoName)}

    //buy red Doritos
        val rDoritoName = "Nacho Cheese Doritos"
        val redDoritosPrice = 2.25
        val redDoritos: TextView = findViewById(R.id.RDorito)
        redDoritos.text = redDoritosPrice.toString()

        val buyRedDoritos: Button = findViewById(R.id.buyRed)
        buyRedDoritos.setOnClickListener(){ buyFood(redDoritosPrice, rDoritoName)}

    // buy Lays Chips
        val laysPrice = 2.25
        val lays: TextView = findViewById(R.id.Lays)
        lays.text = laysPrice.toString()

        val skittlesPrice = 1.25
        val skittles: TextView = findViewById(R.id.Skittles)
        skittles.text = skittlesPrice.toString()

        val reesesPrice = 1.25
        val reeses: TextView = findViewById(R.id.Reeses)
        reeses.text = reesesPrice.toString()

        val snickersPrice = 1.25
        val snickers: TextView = findViewById(R.id.Snickers)
        snickers.text = snickersPrice.toString()

        val pretzelsPrice = 1.25
        val pretzels: TextView = findViewById(R.id.Pretzels)
        pretzels.text = pretzelsPrice.toString()

        val peanutCookiePrice = 1.50
        val peanutCookie: TextView = findViewById(R.id.PenutCookie)
        peanutCookie.text = peanutCookiePrice.toString()

        val chocolateCookiePrice = 1.50
        val chocolateCookie: TextView = findViewById(R.id.ChocolateCookie)
        chocolateCookie.text = chocolateCookiePrice.toString()
    }

    private fun buyFood(cost: Double, name: String){
        if (cost <= insertedMoney) {
            insertedMoney -= cost
            val totalMoney: TextView = findViewById(R.id.moneyInserted)
            totalMoney.text = insertedMoney.toString()
            Toast.makeText(this, "You Bought $name", Toast.LENGTH_LONG).show()
        } else {
            Toast.makeText(this,"Not Enough Money",Toast.LENGTH_LONG).show()
        }
    }
}
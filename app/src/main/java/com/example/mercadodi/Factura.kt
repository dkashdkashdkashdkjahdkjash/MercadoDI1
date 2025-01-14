package com.example.mercadodi

import android.os.Bundle
import android.widget.ListView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Factura :AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.factura)
        val lista = findViewById<TextView>(R.id.textView)

        lista.text = intent.getStringExtra("cosa") + " x 1 \n\n\nTotal = 1€"


    }
}
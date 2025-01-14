package com.example.mercadodi

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.SeekBar
import android.widget.Switch
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class compraIndividual :AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.compraindividual)

        val nombre = findViewById<TextView>(R.id.textViewNombre2)
        nombre.text = intent.getStringExtra("name")

        val seekBar = findViewById<SeekBar>(R.id.seekBarCantidad)
        val cantidad = findViewById<TextView>(R.id.textViewCantidad)
        seekBar.min=1
        seekBar.max=99
        var amount = 1
        val añadir = findViewById<Button>(R.id.buttonAñadirCarrito)

        val urgente = findViewById<Switch>(R.id.switchUrgente)

        seekBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            /**
             * Método que se llama cada vez que cambio el progreso
             * seekBar contiene la referencia a la seekBar
             * progress contiene el valor actual de la seekbar
             * fromUser indica si el cambio lo ha producido el usuario al arastar la barra
             */
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                // Actualiza el TextView mientras se mueve la SeekBar
                amount = progress
                cantidad.text = "Cantidad : $progress"

            }

            /**
             * Se llama caundo el usuario comienza a tocar la seekbar
             */
            override fun onStartTrackingTouch(seekBar: SeekBar?) {
                // No se necesita implementación en este caso
            }

            /**
             * Se llama cuando el usuario deja de tocarla
             */
            override fun onStopTrackingTouch(seekBar: SeekBar?) {
                // No se necesita implementación en este caso
            }
        })


        añadir.setOnClickListener(){
            val intent3 = Intent(this,MainActivity::class.java)
            intent3.putExtra("name2",nombre.text.toString())
            intent3.putExtra("cantidad",amount)
            intent3.putExtra("añadir","1")
            startActivity(intent3)
        }
    }
}
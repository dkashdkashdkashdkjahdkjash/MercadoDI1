package com.example.mercadodi

import android.content.Intent
import android.os.Bundle
import android.provider.Telephony.Mms.Intents
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class ListaDeArticulos : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.compra)

        val panaderia = findViewById<Button>(R.id.buttonPanaderia)
        val pescaderia = findViewById<Button>(R.id.buttonPescaderia)
        val fruteria = findViewById<Button>(R.id.buttonFruteria)
        val carniceria = findViewById<Button>(R.id.buttonCarniceria)
        val charchuteria = findViewById<Button>(R.id.buttonCharchuteria)
        val conservas = findViewById<Button>(R.id.buttonConservas)
        val perfumeria = findViewById<Button>(R.id.buttonPerfumeria)
        val general = findViewById<Button>(R.id.buttonGeneral)
        val todo = findViewById<Button>(R.id.buttonTodo)

        var articulos = ArrayList<String>()
        val listaArticulos = findViewById<ListView>(R.id.listView2)
        articulos.add("Croissant")
        articulos.add("Bizcocho")
        articulos.add("Bacalao")
        articulos.add("Merluza")
        articulos.add("Melon")
        articulos.add("Kiwi")
        articulos.add("Ternera")
        articulos.add("Cerdo")
        articulos.add("Jamon")
        articulos.add("Chope")
        articulos.add("Mermelada")
        articulos.add("Pepinillos encurtidos")
        articulos.add("Perfume 1")
        articulos.add("Perfume 2")
        articulos.add("Papel higienico")
        articulos.add("Pañuelos")
        var adaptador = ArrayAdapter(this,android.R.layout.simple_list_item_1,articulos)
        listaArticulos.adapter = adaptador
        panaderia.setOnClickListener(){
            articulos = ArrayList<String>()
            articulos.add("Croissant")
            articulos.add("Bizcocho")
            adaptador = ArrayAdapter(this,android.R.layout.simple_list_item_1,articulos)
            listaArticulos.adapter = adaptador
        }
        pescaderia.setOnClickListener(){
            articulos = ArrayList<String>()
            articulos.add("Bacalao")
            articulos.add("Merluza")
            adaptador = ArrayAdapter(this,android.R.layout.simple_list_item_1,articulos)
            listaArticulos.adapter = adaptador
        }
        fruteria.setOnClickListener(){
            articulos = ArrayList<String>()
            articulos.add("Melon")
            articulos.add("Kiwi")
            adaptador = ArrayAdapter(this,android.R.layout.simple_list_item_1,articulos)
            listaArticulos.adapter = adaptador
        }
        carniceria.setOnClickListener(){
            articulos = ArrayList<String>()
            articulos.add("Ternera")
            articulos.add("Cerdo")
            adaptador = ArrayAdapter(this,android.R.layout.simple_list_item_1,articulos)
            listaArticulos.adapter = adaptador
        }
        charchuteria.setOnClickListener(){
            articulos = ArrayList<String>()
            articulos.add("Jamon")
            articulos.add("Chope")
            adaptador = ArrayAdapter(this,android.R.layout.simple_list_item_1,articulos)
            listaArticulos.adapter = adaptador
        }
        conservas.setOnClickListener(){
            articulos = ArrayList<String>()
            articulos.add("Mermelada")
            articulos.add("Pepinillos encurtidos")
            adaptador = ArrayAdapter(this,android.R.layout.simple_list_item_1,articulos)
            listaArticulos.adapter = adaptador
        }
        perfumeria.setOnClickListener(){
            articulos = ArrayList<String>()
            articulos.add("Perfume 1")
            articulos.add("Perfume 2")
            adaptador = ArrayAdapter(this,android.R.layout.simple_list_item_1,articulos)
            listaArticulos.adapter = adaptador
        }
        general.setOnClickListener(){
            articulos = ArrayList<String>()
            articulos.add("Papel higienico")
            articulos.add("Pañuelos")
            adaptador = ArrayAdapter(this,android.R.layout.simple_list_item_1,articulos)
            listaArticulos.adapter = adaptador
        }
        todo.setOnClickListener(){
            articulos = ArrayList<String>()
            articulos.add("Croissant")
            articulos.add("Bizcocho")
            articulos.add("Bacalao")
            articulos.add("Merluza")
            articulos.add("Melon")
            articulos.add("Kiwi")
            articulos.add("Ternera")
            articulos.add("Cerdo")
            articulos.add("Jamon")
            articulos.add("Chope")
            articulos.add("Mermelada")
            articulos.add("Pepinillos encurtidos")
            articulos.add("Perfume 1")
            articulos.add("Perfume 2")
            articulos.add("Papel higienico")
            articulos.add("Pañuelos")
            adaptador = ArrayAdapter(this,android.R.layout.simple_list_item_1,articulos)
            listaArticulos.adapter = adaptador
        }
        listaArticulos.onItemClickListener =
            AdapterView.OnItemClickListener { _, _, position, _ ->
                val nombre = articulos[position].toString()
                val intent2 = Intent(this,compraIndividual::class.java)
                intent2.putExtra("name",nombre)
                startActivity(intent2)
            }

    }

}
package com.example.mercadodi

import android.content.Intent
import android.os.Bundle
import android.util.SparseBooleanArray
import android.view.View
import android.widget.AbsListView
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ImageButton
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.get
import androidx.core.view.size


class MainActivity : AppCompatActivity() , AdapterView.OnItemClickListener{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val borrar = findViewById<Button>(R.id.buttonBorrar)
        val borrarTodo = findViewById<Button>(R.id.buttonBorrarTodo)
        val comprar = findViewById<ImageButton>(R.id.imageButton5)
        val imprimir = findViewById<Button>(R.id.buttonImprimir)
        var primeraVez = true
        var data = ArrayList<String>()
        if(intent.getStringExtra("añadir").toString() != "1"){
            data.add("Croissant")
            data.add("Kiwi")
            data.add("Jamon")
            data.add("Mermelada")
            data.add("Pañuelos")
        }else{
            data.add(intent.getStringExtra("name2").toString())
        }



        var adaptador: ArrayAdapter<String>
        //Declaramos el objeto lista de tipo ListView y lo enlazamos con el ListView
        var lista = findViewById<ListView>(R.id.list_view_1)
        //Invocamos al método que nos permite seleccionar el modo de selección
        //múltiple en una lista. AbsListView es una clase abstracta que sirve
        // de clase base para ListView
        lista.choiceMode = AbsListView.CHOICE_MODE_MULTIPLE
        //Creamos el adaptador pasando como parámetro this(esta actividad)
        //La referencia al layout predefinido para la selección múltiple
        //El array que contiene los elementos que va a mostrar
        adaptador = ArrayAdapter(this, android.R.layout.simple_list_item_multiple_choice, data)
        lista.adapter = adaptador
        //Fijar un adaptador sin labdas
        lista.onItemClickListener = this

        borrar.setOnClickListener(){
            lista = findViewById<ListView>(R.id.list_view_1)
            val dataAux = ArrayList<String>()
            for (i in 0 until lista.size) {
                if(!lista.isItemChecked(i)){
                    dataAux.add(data[i])
                }
            }
            data = ArrayList<String>()
            for (i in 0 until dataAux.size){
                data.add(dataAux[i])
            }
            adaptador = ArrayAdapter(this, android.R.layout.simple_list_item_multiple_choice, data)
            lista.adapter = adaptador

        }


        borrarTodo.setOnClickListener(){
            data = ArrayList<String>()
            adaptador = ArrayAdapter(this, android.R.layout.simple_list_item_multiple_choice, data)
            lista.adapter = adaptador
        }

        comprar.setOnClickListener(){
            val intent1 = Intent(this,ListaDeArticulos::class.java)
            startActivity(intent1)
        }

        imprimir.setOnClickListener(){
            val intent5 = Intent(this,Factura::class.java)
            intent5.putExtra("cosa",data[0].toString())
            startActivity(intent5)
        }

    }
    override fun onItemClick(a: AdapterView<*>, view: View, position: Int, id: Long) {

    }


}
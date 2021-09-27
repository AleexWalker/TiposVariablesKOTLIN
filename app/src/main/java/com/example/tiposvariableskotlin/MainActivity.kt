package com.example.tiposvariableskotlin

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
    fun setText (view: View ){
        val button = findViewById<Button>(R.id.button)
        val et1 = findViewById<EditText>(R.id.et1)
        val et2 = findViewById<EditText>(R.id.et2)
        val et3 = findViewById<EditText>(R.id.et3)

        button.setOnClickListener {

            val pesoPrimero = et1.text.toString().toFloat()
            val pesoSegundo = et2.text.toString().toFloat()
            val pesoTercero = et3.text.toString().toFloat()

            val pesoMedio = (pesoPrimero + pesoSegundo + pesoTercero)/3
            println("El peso medio sera: \n $pesoMedio")

            val tv1 = findViewById<TextView>(R.id.tv1).apply {
                text = ("El peso medio equivale a: $pesoMedio ").toString()
            }
        }
    }
}
package com.example.cursoandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.core.text.set

class MainActivity : AppCompatActivity() {

    var contador: Int = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //indica que actividad desea visualizar
        setContentView(R.layout.activity_main)

        var botonIncrementar = findViewById<Button>(R.id.tvIncrementa)
        var botonDecrementar = findViewById<Button>(R.id.tvDecrementa)
        var botonResetear = findViewById<Button>(R.id.tvResetea)


        botonIncrementar.setOnClickListener {
            incrementar()
        }
        botonDecrementar.setOnClickListener {
            decrementar()
        }
        botonResetear.setOnClickListener() {
            resetear()
        }
    }

    fun incrementar() {
        contador++
        println(contador)
    }

    fun decrementar() {
        contador--
        println(contador)
    }

    fun resetear() {
        contador = 0
        println(contador)
    }

    //me falta saber como poner el resultado en el campo de texto

}


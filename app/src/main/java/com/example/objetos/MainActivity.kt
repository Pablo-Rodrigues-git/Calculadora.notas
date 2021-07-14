package com.example.objetos

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.example.objetos.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btCalcular = calcular
        val resultado = resultado

        btCalcular.setOnClickListener {
            val nota1: Int = Integer.parseInt(nota1.text.toString())
            val nota2: Int = Integer.parseInt(nota2.text.toString())
            val media: Int = (nota1+nota2)/2
            val faltas: Int = Integer.parseInt(Faltas.text.toString())

        }

    }

}
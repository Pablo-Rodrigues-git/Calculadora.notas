package com.example.objetos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.objetos.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    val binding by lazy {ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.calcular.setOnClickListener {
            Log.d("1", "onCreate: Entrou")

            val nota1 = Integer.parseInt(binding.nota1.text.toString())
            val nota2 = Integer.parseInt(binding.nota2.text.toString())
            val media = (nota1 + nota2) / 2
            val faltas = Integer.parseInt(binding.Faltas.text.toString())

            if (media >= 6 && faltas <= 10) {
                binding.resultado.setText("Aluno Aprovado" + "\n" + "Nota Final:" + media+ "\n"+ "Faltas:"+faltas)
            }
            else{
                binding.resultado.setText("Aluno Reprovadoo" + "\n" + "Nota Final:" + media+ "\n"+ "Faltas:"+faltas)

            }
        }

    }

}
package com.example.calculadora

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {

    lateinit var btnVoltar : Button
    lateinit var txtOla : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_teste1)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        txtOla = findViewById(R.id.txtOla)
        btnVoltar = findViewById(R.id.btnVoltar)

        // pega informação de outra tela
        val bundle = intent.extras
        var usuario = bundle?.getString("nome_usuario") ?: "sem nome"


        txtOla.text = "Bem vindo: $usuario"

        btnVoltar.setOnClickListener {

            finish()
        }

    }


}
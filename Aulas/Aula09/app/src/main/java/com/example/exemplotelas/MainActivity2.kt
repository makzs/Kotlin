package com.example.exemplotelas

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {

    private lateinit var txtBemVindo : TextView

    private lateinit var btnVoltar : Button

    private lateinit var btnLivro1 : ImageButton
    private lateinit var btnLivro2 : ImageButton
    private lateinit var btnLivro3 : ImageButton



    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        btnLivro1 = findViewById(R.id.btnLivro1)
        btnLivro2 = findViewById(R.id.btnLivro2)
        btnLivro3 = findViewById(R.id.btnLivro3)

        btnVoltar = findViewById(R.id.btnVoltar)

        txtBemVindo = findViewById(R.id.txtBemVindo)

        var nome = "LivroX"
        var autor = "AutorX"
        var ano = "AnoX"

        val bundle = intent.extras
        var nomePessoa = bundle?.getString("nomePessoa") ?: "sem nome"

        txtBemVindo.text = "Bem vindo ${nomePessoa}"

        btnLivro1.setOnClickListener {
            val intent = Intent(this, MainActivity3::class.java)

            nome = "Livro1"
            autor = "autor Livro1"
            ano = "2021"

            intent.putExtra("nome", nome)
            intent.putExtra("autor", autor)
            intent.putExtra("ano", ano)

            startActivity(intent)

        }

        btnLivro2.setOnClickListener {
            val intent = Intent(this, MainActivity3::class.java)

            nome = "Livro2"
            autor = "autor Livro2"
            ano = "2020"

            intent.putExtra("nome", nome)
            intent.putExtra("autor", autor)
            intent.putExtra("ano", ano)

            startActivity(intent)

        }

        btnLivro3.setOnClickListener {
            val intent = Intent(this, MainActivity3::class.java)

            nome = "Livro3"
            autor = "autor Livro3"
            ano = "2024"

            intent.putExtra("nome", nome)
            intent.putExtra("autor", autor)
            intent.putExtra("ano", ano)

            startActivity(intent)

        }

        btnVoltar.setOnClickListener {

            finish()
        }

    }
}
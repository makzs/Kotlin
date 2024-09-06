package com.example.exemplotelas

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity3 : AppCompatActivity() {

    private lateinit var txtLivro : TextView
    private lateinit var txtLivroTitulo : TextView
    private lateinit var txtLivroAutor : TextView
    private lateinit var txtLivroAno : TextView

    private lateinit var btnVoltar2 : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main3)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        txtLivro = findViewById(R.id.txtLivro)
        txtLivroTitulo = findViewById(R.id.txtLivroTitulo)
        txtLivroAutor = findViewById(R.id.txtLivroAutor)
        txtLivroAno = findViewById(R.id.txtLivroAno)

        btnVoltar2 = findViewById(R.id.btnVoltar2)

        val bundle = intent.extras
        var nome = bundle?.getString("nome") ?: "sem nome"
        var autor = bundle?.getString("autor") ?: "sem autor"
        var ano = bundle?.getString("ano") ?: "sem ano"

        txtLivro.text = "Livro ${nome}"
        txtLivroTitulo.text = "Titulo: ${nome}"
        txtLivroAutor.text = "Autor: ${autor}"
        txtLivroAno.text = "Ano: ${ano}"


        btnVoltar2.setOnClickListener {

            finish()
        }
    }
}
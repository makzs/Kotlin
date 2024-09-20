package com.example.aulafragmentos

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ReciclerViewClass : AppCompatActivity() {

    lateinit var rvListaContato : RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.fragment_blank)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.ContatosFragment)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

       rvListaContato = findViewById(R.id.rvListaContato)

        val contatos = listOf(
            Contato("Roger", "Fala ai", "5:40", "-"),
            Contato("Maria", "oii", "3:40", "-"),
            Contato("Rodrigo", "AAAAAAAAAAAAAA", "23:49", "-")
        )

        rvListaContato.adapter = ContatoAdapter(contatos)

        rvListaContato.layoutManager = LinearLayoutManager(this)
    }
}
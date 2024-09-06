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
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {

    private lateinit var txtNome : TextInputEditText
    private lateinit var btnCadastro : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        txtNome = findViewById(R.id.txtNome)
        btnCadastro = findViewById(R.id.btnCadastro)

        btnCadastro.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)

            var nomePessoa: String = txtNome.text.toString()

            intent.putExtra("nomePessoa", nomePessoa)

            startActivity(intent)

        }



    }
}
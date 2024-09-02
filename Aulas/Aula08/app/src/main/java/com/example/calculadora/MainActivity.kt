package com.example.calculadora

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var txtValor1 : EditText
    private lateinit var txtValor2 : EditText
    private lateinit var txtResultado : EditText

    private lateinit var btnSoma : Button
    private lateinit var btnSubtracao: Button
    private lateinit var btnMultiplicacao : Button
    private lateinit var btnDivisao : Button

    private lateinit var btnConfig : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        txtValor1 = findViewById(R.id.txtValor1)
        txtValor2 = findViewById(R.id.txtValor2)
        txtResultado = findViewById(R.id.txtResultado)

        btnSoma = findViewById(R.id.btnSoma)
        btnSubtracao = findViewById(R.id.btnSubtracao)
        btnMultiplicacao = findViewById(R.id.btnMultiplicacao)
        btnDivisao = findViewById(R.id.btnDivisao)

        btnSoma.setOnClickListener {
            var valor1 = txtValor1.text.toString()
            var valor2 = txtValor2.text.toString()
            var soma = valor1.toDouble() + valor2.toDouble()

            txtResultado.setText("$soma")
        }

        btnSubtracao.setOnClickListener {
            var valor1 = txtValor1.text.toString()
            var valor2 = txtValor2.text.toString()
            var subtracao = valor1.toDouble() - valor2.toDouble()

            txtResultado.setText("$subtracao")
        }

        btnMultiplicacao.setOnClickListener {
            var valor1 = txtValor1.text.toString()
            var valor2 = txtValor2.text.toString()
            var multiplicacao = valor1.toDouble() * valor2.toDouble()

            txtResultado.setText("$multiplicacao")
        }

        btnDivisao.setOnClickListener {
            var valor1 = txtValor1.text.toString()
            var valor2 = txtValor2.text.toString()
            var divisao = valor1.toDouble() / valor2.toDouble()

            txtResultado.setText("$divisao")
        }

        Log.i("Ciclo de vida", "OnCreate")

        var usuario : String? = "Roberto"


        btnConfig = findViewById(R.id.btnConfig)
        btnConfig.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)

            if (usuario != null)
            {
                intent.putExtra("nome_usuario", usuario)
            }

            startActivity(intent)
        }



    }

    override fun onStart() {
        super.onStart()
        Log.i("ciclo de vida ", "OnStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("ciclo de vida ", "OnResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i("ciclo de vida ", "OnPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("ciclo de vida ", "OnStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("ciclo de vida ", "onDestroy")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("ciclo de vida ", "onRestart")
    }


}
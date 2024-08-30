package com.example.aula06

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {

    private lateinit var txtInputReal : TextInputLayout
    private lateinit var txtReal : TextInputEditText

    private lateinit var txtInputDolar : TextInputLayout
    private lateinit var txtDolar : TextInputEditText

    private lateinit var btnConversor : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        txtInputReal = findViewById(R.id.txtInputReal)
        txtInputDolar = findViewById(R.id.txtInputDolar)

        txtReal = findViewById(R.id.txtReal)
        txtDolar = findViewById(R.id.txtDolar)

        btnConversor = findViewById(R.id.btnConversor)

        btnConversor.setOnClickListener {
            var valorReal = txtReal.text.toString()
            var valorDolar = valorReal.toFloat() / 5.6f

            txtDolar.setText("$valorDolar")
        }
    }
}
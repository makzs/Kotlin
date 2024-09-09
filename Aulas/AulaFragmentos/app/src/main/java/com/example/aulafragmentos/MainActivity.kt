package com.example.aulafragmentos

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    lateinit var btnTela1 : Button
    lateinit var btnTela2 : Button
    lateinit var btnTela3 : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        btnTela1 = findViewById(R.id.btnTela1)
        btnTela2 = findViewById(R.id.btnTela2)
        btnTela3 = findViewById(R.id.btnTela3)

        val fragmentManager = supportFragmentManager.beginTransaction()

        btnTela1.setOnClickListener {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.fragmentContainerView, BlankFragment())
                .commit()
        }

        btnTela2.setOnClickListener {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.fragmentContainerView, fragment_teste2())
                .commit()
        }


    }
}
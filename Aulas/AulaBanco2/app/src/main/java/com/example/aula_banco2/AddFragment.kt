package com.example.aula_banco2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import com.example.aula_banco2.Data.Livro
import com.example.aula_banco2.Data.LivroViewModel
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.textfield.TextInputEditText

class AddFragment : Fragment() {

    lateinit var btnVoltar : Button
    lateinit var btnAdicionar : Button
    lateinit var txtEditNomeLivro : TextInputEditText
    lateinit var livroViewModel : LivroViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_add, container, false)

        btnVoltar = view.findViewById(R.id.btnVoltar)
        btnAdicionar = view.findViewById(R.id.btnAdicionar)
        txtEditNomeLivro = view.findViewById(R.id.txtEditNomeLivro)
        livroViewModel = ViewModelProvider(this).get(LivroViewModel::class.java)

        btnVoltar.setOnClickListener {
            parentFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView, ListFragment())
                .commit()

        }

        btnAdicionar.setOnClickListener {
            addLivro()
        }

        return view
    }

    fun addLivro(){
        //pegar o texto

        val nome = txtEditNomeLivro.text.toString()

        //criar um livro

        val novoLivro = Livro(0, nome, 1900)

        //adicionar no banco

        livroViewModel.addLivro(novoLivro)

        Toast.makeText(requireContext(), "Livro Adicionado", Toast.LENGTH_SHORT).show()

        //voltar para a tela
        voltar()
    }

    fun voltar(){
        parentFragmentManager.beginTransaction()
            .replace(R.id.fragmentContainerView, ListFragment())
            .commit()

    }

}
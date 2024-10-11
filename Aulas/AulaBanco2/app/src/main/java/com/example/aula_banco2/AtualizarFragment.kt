package com.example.aula_banco2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.lifecycle.ViewModelProvider
import com.example.aula_banco2.Data.LivroViewModel
import com.google.android.material.textfield.TextInputEditText


class AtualizarFragment : Fragment() {

    lateinit var btnVoltar : Button
    lateinit var btnAtualizar : Button
    lateinit var txtEditNomeLivro : TextInputEditText
    lateinit var livroViewModel : LivroViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_atualizar, container, false)

        btnVoltar = view.findViewById(R.id.btnVoltar)
        btnAtualizar = view.findViewById(R.id.btnAtualizar)
        txtEditNomeLivro = view.findViewById(R.id.txtEditNomeLivro)
        livroViewModel = ViewModelProvider(this).get(LivroViewModel::class.java)

        val nome : String = arguments?.getString("nome") ?: "erro"

        txtEditNomeLivro.setText("$nome")



        btnVoltar.setOnClickListener {
            voltar()
        }

        return view
    }

    fun voltar(){
        parentFragmentManager.beginTransaction()
            .replace(R.id.fragmentContainerView, ListFragment())
            .commit()

    }

}
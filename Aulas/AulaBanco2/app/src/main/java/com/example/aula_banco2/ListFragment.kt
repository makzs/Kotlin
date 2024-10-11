package com.example.aula_banco2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.aula_banco2.Data.LivroAdapter
import com.example.aula_banco2.Data.LivroViewModel
import com.google.android.material.floatingactionbutton.FloatingActionButton

class ListFragment : Fragment() {

    lateinit var fbtnAdd : FloatingActionButton
    lateinit var livroViewModel : LivroViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_list, container, false)

        fbtnAdd = view.findViewById(R.id.fbtnAdd)
        //fbtnAdd = view.findViewById<FloatingActionButton>(R.id.fbtnAdd).setOnClickListener()

        fbtnAdd.setOnClickListener{
            parentFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView, AddFragment())
                .commit()
        }

        val adapter = LivroAdapter()
        val recyclerView = view.findViewById<RecyclerView>(R.id.recyclerViewLivros)

        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(requireContext())

        livroViewModel = ViewModelProvider(this).get(LivroViewModel::class.java)
        livroViewModel.readAllData.observe(viewLifecycleOwner) {
            livros -> adapter.setData(livros, parentFragmentManager)
        }

        return view
    }

}
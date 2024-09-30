package com.example.aula_banco2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.floatingactionbutton.FloatingActionButton

class ListFragment : Fragment() {

    lateinit var fbtnAdd : FloatingActionButton

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

        return view
    }

}
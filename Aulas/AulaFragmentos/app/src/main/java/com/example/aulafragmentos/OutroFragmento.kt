package com.example.aulafragmentos

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class OutroFragmento : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //return super.onCreateView(R.layout.fragment_outrofragmento , container, savedInstanceState)
        return inflater.inflate(
            R.layout.fragment_teste,
            container,
            false
        )
    }



}
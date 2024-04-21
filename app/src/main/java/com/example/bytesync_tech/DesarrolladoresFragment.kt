package com.example.bytesync_tech

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.bytesync_tech.databinding.FragmentDesarrolladoresBinding
import com.example.bytesync_tech.databinding.FragmentInicioBinding
import com.example.bytesync_tech.databinding.InicioPaginaBinding


class DesarrolladoresFragment : Fragment() {

    private lateinit var binding: FragmentDesarrolladoresBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = FragmentDesarrolladoresBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding.DevDesc1.text = "Fragment Desarrolladores"
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_desarrolladores, container, false)
    }


}
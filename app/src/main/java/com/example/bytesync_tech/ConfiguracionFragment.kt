package com.example.bytesync_tech

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.bytesync_tech.databinding.FragmentConfiguracionBinding
import com.example.bytesync_tech.databinding.FragmentInicioBinding
import com.example.bytesync_tech.databinding.InicioPaginaBinding


class ConfiguracionFragment : Fragment() {

    private lateinit var binding: FragmentConfiguracionBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = FragmentConfiguracionBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding.Settings1.text = "Fragment Configuración"
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_configuracion, container, false)
    }


}
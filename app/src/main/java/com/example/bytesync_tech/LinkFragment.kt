package com.example.bytesync_tech

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.bytesync_tech.databinding.FragmentInicioBinding
import com.example.bytesync_tech.databinding.FragmentLinkBinding
import com.example.bytesync_tech.databinding.InicioPaginaBinding


class LinkFragment : Fragment() {

    private lateinit var binding: FragmentLinkBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = FragmentLinkBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding.Link1.text = "Fragment Link"
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_link, container, false)
    }


}
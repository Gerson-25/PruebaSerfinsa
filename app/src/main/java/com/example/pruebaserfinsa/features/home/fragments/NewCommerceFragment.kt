package com.example.pruebaserfinsa.features.home.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.pruebaserfinsa.R
import com.example.pruebaserfinsa.databinding.FragmentNewCommerceBinding

class NewCommerceFragment : Fragment() {

    lateinit var binding: FragmentNewCommerceBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentNewCommerceBinding.inflate(inflater, container, false)
        return binding.root
    }

}
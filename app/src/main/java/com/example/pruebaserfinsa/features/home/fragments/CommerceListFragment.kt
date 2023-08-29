package com.example.pruebaserfinsa.features.home.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import com.example.pruebaserfinsa.R
import com.example.pruebaserfinsa.databinding.FragmentCommerceListBinding
import com.example.pruebaserfinsa.features.home.adapters.CommerceListAdapters
import com.example.pruebaserfinsa.features.home.models.Commerces


class CommerceListFragment : Fragment() {

    lateinit var binding: FragmentCommerceListBinding
    lateinit var commerceListAdapters: CommerceListAdapters

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCommerceListBinding.inflate(inflater, container, false)
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val list = listOf(
            Commerces("Super Selectos", "San Salvador", "000945445", "https://th.bing.com/th/id/OIP.OpCmVN5sUULNx4XBlDT_dQAAAA?pid=ImgDet&rs=1"),
            Commerces("Super Selectos", "San Salvador", "009099888", "https://th.bing.com/th/id/OIP.OpCmVN5sUULNx4XBlDT_dQAAAA?pid=ImgDet&rs=1"),
            Commerces("Super Selectos", "San Salvador", "000945445", "https://th.bing.com/th/id/OIP.OpCmVN5sUULNx4XBlDT_dQAAAA?pid=ImgDet&rs=1"),
            Commerces("Super Selectos", "San Salvador", "000945445", "https://th.bing.com/th/id/OIP.OpCmVN5sUULNx4XBlDT_dQAAAA?pid=ImgDet&rs=1"),
            Commerces("Super Selectos", "San Salvador", "000945445", "https://th.bing.com/th/id/OIP.OpCmVN5sUULNx4XBlDT_dQAAAA?pid=ImgDet&rs=1"),
            Commerces("Super Selectos", "San Salvador", "000945445", "https://th.bing.com/th/id/OIP.OpCmVN5sUULNx4XBlDT_dQAAAA?pid=ImgDet&rs=1"),
            Commerces("Super Selectos", "San Salvador", "000945445", "https://th.bing.com/th/id/OIP.OpCmVN5sUULNx4XBlDT_dQAAAA?pid=ImgDet&rs=1"),
            Commerces("Super Selectos", "San Salvador", "000945445", "https://th.bing.com/th/id/OIP.OpCmVN5sUULNx4XBlDT_dQAAAA?pid=ImgDet&rs=1"),
            Commerces("Super Selectos", "San Salvador", "000945445", "https://th.bing.com/th/id/OIP.OpCmVN5sUULNx4XBlDT_dQAAAA?pid=ImgDet&rs=1"),
            Commerces("Super Selectos", "San Salvador", "000945445", "https://th.bing.com/th/id/OIP.OpCmVN5sUULNx4XBlDT_dQAAAA?pid=ImgDet&rs=1")
        )

        commerceListAdapters = CommerceListAdapters(list)
        binding.commerceList.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
        binding.commerceList.adapter = commerceListAdapters

    }

}
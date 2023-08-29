package com.example.pruebaserfinsa.features.home.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.pruebaserfinsa.databinding.CommerceItemBinding
import com.example.pruebaserfinsa.features.home.models.Commerces

class CommerceListAdapters(val commercerList: List<Commerces>): RecyclerView.Adapter<ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = CommerceItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return commercerList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(data = commercerList[position])
    }
}

class ViewHolder(val view: CommerceItemBinding): RecyclerView.ViewHolder(view.root) {
    fun bind(data: Commerces){
        view.commerceName.text = data.name
        view.documentNumber.text = data.documentNumber
    }
}
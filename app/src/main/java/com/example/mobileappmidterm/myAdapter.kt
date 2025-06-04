package com.example.mobileappmidterm

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class myAdapter(private val list: List<dieRoll>) : RecyclerView.Adapter<myAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun getItemCount(): Int = list.size
}

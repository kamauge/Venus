package com.example.venus.adapter

import Planets
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class PlanetsAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private lateinit var items: List<Planets>
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }



    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
    }

    override fun getItemCount(): Int {
        return items.size
    }

}


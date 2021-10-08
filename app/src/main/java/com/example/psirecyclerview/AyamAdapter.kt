package com.example.psirecyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AyamAdapter(private var olahan_ayam: Array<String>, private var deskripsi: Array<String>, private var images: IntArray) :
    RecyclerView.Adapter<AyamAdapter.MyViewHolder>() {
    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imageView : ImageView = itemView.findViewById(R.id.imageView)
        var titletext: TextView = itemView.findViewById(R.id.title_text)
        var desctext: TextView = itemView.findViewById(R.id.desc_text)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemsView = LayoutInflater.from(parent.context)
            .inflate(R.layout.items_view, parent, false)
        return MyViewHolder(itemsView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.imageView.setImageResource(images[position])
        holder.titletext.text = olahan_ayam[position]
        holder.desctext.text = deskripsi[position]

    }

    override fun getItemCount(): Int {
        return images.size
    }

}
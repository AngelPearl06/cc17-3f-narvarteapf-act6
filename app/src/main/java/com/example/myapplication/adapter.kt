package com.example.myapplication

import android.icu.text.CaseMap.Title
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R

data class Tip(val day: Int,val title: String, val text: String, val image: Int)

class adapter(private val tips: List<Tip>) : RecyclerView.Adapter<adapter.ViewHolder>() {
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val day1: TextView = itemView.findViewById(R.id.day1)
        val titleTextView: TextView = itemView.findViewById(R.id.titleTextView)
        val imageView: ImageView = itemView.findViewById(R.id.imageView)
        val textTextView: TextView = itemView.findViewById(R.id.textTextView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val tip = tips[position]
        holder.day1.text = "Day ${tip.day}"
        holder.titleTextView.text = tip.title
        holder.textTextView.text = tip.text
        holder.imageView.setImageResource(tip.image)
    }


    override fun getItemCount() = tips.size
}
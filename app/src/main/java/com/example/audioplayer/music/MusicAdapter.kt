package com.example.audioplayer.music;

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.audioplayer.databinding.MusicCardBinding

class MusicAdapter(private val dataSet: List<MusicItem>, private val onClick: (Int) -> Unit) :
        RecyclerView.Adapter<MusicAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val b = MusicCardBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(b)
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(dataSet[position], onClick)
    }
    override fun getItemCount() = dataSet.size
    class ViewHolder(private val b: MusicCardBinding) : RecyclerView.ViewHolder(b.root) {
        fun bind(entry: MusicItem, onClick: (id: Int) -> Unit) = b.apply {
            cardTitle.text = entry.title
            cardImage.setImageResource(entry.img)
            root.setOnClickListener {
                // TODO: "ruchałem matkę dawida btw"
            }
        }
    }
}
package com.example.audioplayer.ui;

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.audioplayer.databinding.MusicCardBinding
import com.example.audioplayer.music.MusicItem

class MusicAdapter(private val dataSet: List<MusicItem>, private val onClick: (Int) -> Unit) :
        RecyclerView.Adapter<MusicAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val b = MusicCardBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(b, parent.context)
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(dataSet[position], onClick)
    }
    override fun getItemCount() = dataSet.size
    class ViewHolder(private val b: MusicCardBinding, private val context: Context) : RecyclerView.ViewHolder(b.root) {
        fun bind(entry: MusicItem, onClick: (Int) -> Unit) = b.apply {
            cardTitle.text = entry.title
            cardImage.setImageResource(entry.img)
            root.setOnClickListener {
                onClick(entry.audio)
            }
        }

    }
}
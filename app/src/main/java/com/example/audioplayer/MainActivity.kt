package com.example.audioplayer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.example.audioplayer.databinding.ActivityMainBinding
import com.example.audioplayer.music.MusicHandler
import com.example.audioplayer.ui.MusicAdapter
import com.example.audioplayer.music.MusicItem

class MainActivity : AppCompatActivity() {
    private val b by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(b.root)

        val list = listOf(
            MusicItem("Miauczący kot", R.drawable.cat, R.raw.cat),
            MusicItem("Duża metalowa rura", R.drawable.metal_pipe, R.raw.metal_pipe)
        )
        val music = MusicHandler(this)
        b.recycler.apply {
            layoutManager = GridLayoutManager(context, 2)
            adapter = MusicAdapter(list) { id -> music.play(id) }
        }
    }
}
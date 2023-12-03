package com.example.audioplayer.music

import android.content.Context
import android.media.MediaPlayer
import com.example.audioplayer.MainActivity
import java.io.FileDescriptor

class MusicHandler(private val context: Context) {
    private var player: MediaPlayer = MediaPlayer()
    fun play(res: Int) {
        load(res)
        player.start()
    }

    private fun load(res: Int){
        player.apply {
            stop()
            reset()
            release()
        }
        player = MediaPlayer.create(context, res)
    }
}
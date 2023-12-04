package com.example.audioplayer.music

import android.content.Context
import android.media.MediaPlayer

class MusicHandler(private val context: Context) {
    private var mp: MediaPlayer = MediaPlayer()
    fun play(res: Int) {
        load(res)
        mp.start()
    }

    fun loop(): Boolean = mp.isLooping.also { mp.isLooping = !it }.run { mp.isLooping }
    fun playNext() {
        //mp.
    }

    private fun load(res: Int){
        mp.apply {
            stop()
            reset()
            release()
        }
        mp = MediaPlayer.create(context, res)
    }
}
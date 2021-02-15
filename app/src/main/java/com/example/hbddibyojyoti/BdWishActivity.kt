package com.example.hbddibyojyoti

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_bd_wish.*

class BdWishActivity : AppCompatActivity() {

    private lateinit var mediaPlayer: MediaPlayer
    private var pause:Boolean = true

    companion object {
        const val NAME_EXTRA = "name_extra"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bd_wish)

        // TO get the name from other activity
        val name = intent.getStringExtra(NAME_EXTRA)
        textView.text = "Happy BirthDay\n$name🎂🎂🎂"

        // Initialize the media player
        mediaPlayer = MediaPlayer.create(this, R.raw.hbd_music)
        mediaPlayer.start()
        mediaPlayer.isLooping = true

        fab_music.setOnClickListener {
            if (pause) {
                fab_music.setImageResource(R.drawable.ic_play)
                Toast.makeText(this, "Pause the music...", Toast.LENGTH_SHORT).show()
                mediaPlayer.pause()
                pause = false
            } else {
                fab_music.setImageResource(R.drawable.ic_pause)
                Toast.makeText(this, "Resume the music", Toast.LENGTH_SHORT).show()
                mediaPlayer.start()
                pause = true

            }

        }

    }
}
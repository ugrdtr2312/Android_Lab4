package com.example.lab4_shengeliya

import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.MediaController
import android.widget.VideoView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    var videoPlayer: VideoView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        videoPlayer = findViewById(R.id.videoPlayer)

        val mediaController : MediaController = MediaController(this)
        mediaController.setAnchorView(videoPlayer)
        val myVideoUri = Uri.parse("android.resource://" + packageName + "/" + R.raw.ameno)
        videoPlayer?.setVideoURI(myVideoUri)
        videoPlayer?.start()
        videoPlayer?.setMediaController(mediaController)
    }

    fun setAmeno(view: View?) {
        val myVideoUri: Uri = Uri.parse("android.resource://com.example.lab4_shengeliya/raw/ameno")
        videoPlayer!!.setVideoURI(myVideoUri)

        val mediaController : MediaController = MediaController(this)
        mediaController.setAnchorView(videoPlayer)
        videoPlayer?.start()
        videoPlayer?.setMediaController(mediaController)
    }

    fun setHealth(view: View?) {
        val myVideoUri: Uri = Uri.parse("android.resource://com.example.lab4_shengeliya/raw/health")
        videoPlayer!!.setVideoURI(myVideoUri)

        val mediaController : MediaController = MediaController(this)
        mediaController.setAnchorView(videoPlayer)
        videoPlayer?.start()
        videoPlayer?.setMediaController(mediaController)
    }

    fun setTiktok(view: View?) {
        val myVideoUri: Uri = Uri.parse("android.resource://com.example.lab4_shengeliya/raw/tiktok")
        videoPlayer!!.setVideoURI(myVideoUri)

        val mediaController : MediaController = MediaController(this)
        mediaController.setAnchorView(videoPlayer)
        videoPlayer?.start()
        videoPlayer?.setMediaController(mediaController)
    }

    fun play(view: View?) {
        videoPlayer!!.start()
    }

    fun pause(view: View?) {
        videoPlayer!!.pause()
    }

    fun stop(view: View?) {
        videoPlayer!!.stopPlayback()
        videoPlayer!!.resume()
    }
}
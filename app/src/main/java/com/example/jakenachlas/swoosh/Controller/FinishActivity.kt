package com.example.jakenachlas.swoosh.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.jakenachlas.swoosh.Model.Player
import com.example.jakenachlas.swoosh.R
import com.example.jakenachlas.swoosh.Utilities.EXTRA_PLAYER

import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        //Need to do <player> since we are declaring it here as opposed to lateinit
        val player = intent.getParcelableExtra<Player>(EXTRA_PLAYER)

        searchLeaguesText.text = "Looking for a ${player.league} ${player.skill} league near you..."

    }
}

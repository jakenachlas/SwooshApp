package com.example.jakenachlas.swoosh

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_welcome.*

class WelcomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        //Intent is an object that allows you to interact with other apps as well as your own
        //Two types: explicit: specify the component that is the target class
        // implicit: specify action type, send to android system, it will serve up an app to respond
        //to the intent.. if >1 app that matches action type, user will be presented with option to
        //be able to select one of the apps
        getStartedBtn.setOnClickListener {
            val leagueIntent = Intent(this, LeagueActivity::class.java)
            startActivity(leagueIntent)
        }
    }
}

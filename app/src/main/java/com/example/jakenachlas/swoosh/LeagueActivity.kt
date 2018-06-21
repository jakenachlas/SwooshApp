package com.example.jakenachlas.swoosh

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

    var selectedLeague = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    fun onMensClicked(view: View) {
        womensBtn.isChecked = false
        coedBtn.isChecked = false

        selectedLeague = "Mens"
    }

    fun onWomensClicked(view: View ){
        mensBtn.isChecked = false
        coedBtn.isChecked = false

        selectedLeague = "Womens"
    }

    fun onCoedClicked(view: View){
        mensBtn.isChecked = false
        womensBtn.isChecked = false

        selectedLeague = "Co-Ed"
    }


    fun leagueNextClicked(view: View) {
        if (selectedLeague != "") {
            val skillActivity = Intent(this, SkillActivity::class.java)
            skillActivity.putExtra(EXTRA_LEAGUE, selectedLeague)
            startActivity(skillActivity)
        } else {
            Toast.makeText(this, "Please select a league.", Toast.LENGTH_SHORT).show()
        }
    }
}

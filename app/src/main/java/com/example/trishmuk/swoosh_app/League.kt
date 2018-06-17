package com.example.trishmuk.swoosh_app

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_league.*

class League : baseActivity() {

    var leagueSelected = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)


    }

    fun mensSelected (view: View){
        womenButton.isChecked = false
        Co_Button.isChecked = false

        leagueSelected = "Mens"
    }

    fun womensSelected (view: View){
        menButton.isChecked = false
        Co_Button.isChecked = false

        leagueSelected = "Womens"
    }

    fun coedSelected (view: View){
        menButton.isChecked = false
        womenButton.isChecked = false

        leagueSelected = "Co-Ed"
    }

    fun leagueSelected (view: View){
        if (leagueSelected != "") {
            val nextPage = Intent(this, PlayerLevel::class.java)
            nextPage.putExtra(LEAGUE_SELECTED, leagueSelected)
            startActivity(nextPage)
        } else{
            Toast.makeText(this, "Please select a league.", Toast.LENGTH_SHORT).show()
        }
    }
}

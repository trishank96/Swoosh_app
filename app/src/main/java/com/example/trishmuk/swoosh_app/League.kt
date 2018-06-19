package com.example.trishmuk.swoosh_app

import com.example.trishmuk.swoosh_app.Model.Player
import com.example.trishmuk.swoosh_app.Utilities.PLAYER_INST
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_league.*

class League : baseActivity() {

     var player = Player("","")

    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)
        outState?.putParcelable(PLAYER_INST, player)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        super.onRestoreInstanceState(savedInstanceState)
        if (savedInstanceState != null){
            player = savedInstanceState.getParcelable(PLAYER_INST)
        }
    }

    fun mensSelected (view: View){
        womenButton.isChecked = false
        Co_Button.isChecked = false

        player.league = "Mens"
    }

    fun womensSelected (view: View){
        menButton.isChecked = false
        Co_Button.isChecked = false

        player.league = "Womens"
    }

    fun coedSelected (view: View){
        menButton.isChecked = false
        womenButton.isChecked = false

        player.league = "Co-Ed"
    }

    fun leagueSelected (view: View){
        if (player.league != "") {
            val nextPage = Intent(this, PlayerLevel::class.java)
            nextPage.putExtra(PLAYER_INST, player)
            startActivity(nextPage)
        } else{
            Toast.makeText(this, "Please select a league.", Toast.LENGTH_SHORT).show()
        }
    }
}

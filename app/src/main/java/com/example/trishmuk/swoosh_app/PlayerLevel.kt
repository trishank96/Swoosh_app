package com.example.trishmuk.swoosh_app

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_player_level.*

class PlayerLevel : baseActivity() {
    var league = ""
    var player_level = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_player_level)
        league = intent.getStringExtra(LEAGUE_SELECTED)
    }

    fun beginnerLevel (view: View){
        BallerButton.isChecked = false

        player_level = "Beginner"
    }

    fun ballerLevel (view: View){
        Beginner.isChecked = false

        player_level = "Baller"
    }

    fun finishBut(view: View){
        val tofinal = Intent(this, FinalActivity::class.java)
        tofinal.putExtra(LEAGUE_SELECTED, league)
        tofinal.putExtra(SKILL_LEVEL, player_level)
        startActivity(tofinal)
    }
}

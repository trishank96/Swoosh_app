package com.example.trishmuk.swoosh_app


import com.example.trishmuk.swoosh_app.Model.Player
import com.example.trishmuk.swoosh_app.Utilities.PLAYER_INST
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_final.*

class FinalActivity : baseActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_final)
        val player = intent.getParcelableExtra<Player>(PLAYER_INST)
        finaltextView.text = "Looking for ${player.league}'s ${player.skill} league near you...."
    }
}

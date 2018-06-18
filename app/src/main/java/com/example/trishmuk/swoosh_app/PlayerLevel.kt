package com.example.trishmuk.swoosh_app

import com.example.trishmuk.swoosh_app.Model.Player
import com.example.trishmuk.swoosh_app.Utilities.PLAYER_INST
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_player_level.*

class PlayerLevel : baseActivity() {

    var player = Player("","")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_player_level)
        player = intent.getParcelableExtra(PLAYER_INST)

    }

    fun beginnerLevel (view: View){
        BallerButton.isChecked = false

        player.skill = "Beginner"
    }

    fun ballerLevel (view: View){
        Beginner.isChecked = false

        player.skill = "Baller"
    }

    fun finishBut(view: View){
        if (player.skill != "") {
            val tofinal = Intent(this, FinalActivity::class.java)
            tofinal.putExtra(PLAYER_INST, player)
            startActivity(tofinal)
        } else{
            Toast.makeText(this, "Please select a skill level", Toast.LENGTH_SHORT).show()
        }
    }
}

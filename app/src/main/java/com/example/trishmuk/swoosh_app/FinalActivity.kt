package com.example.trishmuk.swoosh_app

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_final.*

class FinalActivity : baseActivity() {

    var league = ""
    var skill = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_final)
        league = intent.getStringExtra(LEAGUE_SELECTED)
        skill = intent.getStringExtra(SKILL_LEVEL)

        finaltextView.text = "Looking for $league $skill league near you...."
    }
}

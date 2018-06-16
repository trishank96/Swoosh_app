package com.example.trishmuk.swoosh_app

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class League : baseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)


    }
    fun leagueSelected (view: View){
        val nextPage = Intent(this, PlayerLevel::class.java)
        startActivity(nextPage)
    }
}

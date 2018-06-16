package com.example.trishmuk.swoosh_app

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_welcome.*

class MainActivity : baseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        startbutton.setOnClickListener {
            val leagueIntent = Intent(this, League::class.java)
            startActivity(leagueIntent)
        }
    }
}

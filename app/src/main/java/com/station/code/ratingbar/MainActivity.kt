package com.station.code.ratingbar

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import timber.log.Timber

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ratingBar?.setOnRatingBarChangeListener { ratingBar, rating, fromUser ->
            if (!fromUser) return@setOnRatingBarChangeListener
        }
    }
}

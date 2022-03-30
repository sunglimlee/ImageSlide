package com.example.imageslide

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.viewpager2.widget.ViewPager2
import java.util.*

class MainActivity : AppCompatActivity() {
    private lateinit var mButton : Button
    private lateinit var mViewPager : ViewPager2
    private lateinit var mConstraintLayout : ConstraintLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mButton = findViewById<Button>(R.id.button)
        mViewPager = findViewById<ViewPager2>(R.id.viewpager)
        mConstraintLayout = findViewById<ConstraintLayout>(R.id.layout)
        mButton.setOnClickListener {
            val random : Random = Random()
            val color : Int = Color.argb(255, random.nextInt(256),random.nextInt(256), random.nextInt(256) )
            mConstraintLayout.setBackgroundColor(color)
        }
    }
}
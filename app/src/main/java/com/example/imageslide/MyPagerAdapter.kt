package com.example.imageslide

import android.content.Context
import android.view.View
import androidx.viewpager.widget.PagerAdapter

class MyPagerAdapter(var mContext : Context) : PagerAdapter() {
    private val mImageIds = arrayOf<Int>(R.drawable.ic_human1, R.drawable.ic_human2, R.drawable.ic_human3)

    override fun getCount(): Int {
        TODO("Not yet implemented")
    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        TODO("Not yet implemented")
    }
}
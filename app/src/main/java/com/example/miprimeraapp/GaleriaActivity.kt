package com.example.miprimeraapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.example.miprimeraapp.databinding.ActivityGaleriaBinding
import com.gtappdevelopers.kotlingfgproject.ViewPagerAdapter

class GaleriaActivity : PintorMenuActivity() {
    // on below line we are creating variable for view pager,
    // viewpager adapter and the image list.
    lateinit var viewPager: ViewPager
    lateinit var viewPagerAdapter: ViewPagerAdapter
    lateinit var imageList: List<Int>

    lateinit var activityGaleriaBinding : ActivityGaleriaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityGaleriaBinding = ActivityGaleriaBinding.inflate(getLayoutInflater())
        setContentView(activityGaleriaBinding.root)
        allocateActivityTitle("Galeria")

        // initializing variables
        // of below line with their id.
        viewPager = findViewById(R.id.idViewPager)

        // on below line we are initializing
        // our image list and adding data to it.
        imageList = ArrayList<Int>()
        imageList = imageList + R.mipmap.java
        imageList = imageList + R.mipmap.kotlin
        imageList = imageList + R.mipmap.cplus
        imageList = imageList + R.mipmap.ic_launcher

        // on below line we are initializing our view
        // pager adapter and adding image list to it.
        viewPagerAdapter = ViewPagerAdapter(this@GaleriaActivity, imageList)

        // on below line we are setting
        // adapter to our view pager.
        viewPager.adapter = viewPagerAdapter
    }
}
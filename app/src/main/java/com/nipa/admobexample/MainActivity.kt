package com.nipa.admobexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.MobileAds
import com.nipa.admobexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.getRoot())
      //  setContentView(R.layout.activity_main)
        MobileAds.initialize(this) {}
        val adRequest = AdRequest.Builder().build()

        binding.adViewBanner.loadAd(adRequest)
        binding.adViewFullBanner.loadAd(adRequest)
        binding.adViewLargeBanner.loadAd(adRequest)
        binding.adViewLeaderboard.loadAd(adRequest)
        binding.adViewMediumRectangle.loadAd(adRequest)
        binding.adViewSmartBanner.loadAd(adRequest)
    }
}
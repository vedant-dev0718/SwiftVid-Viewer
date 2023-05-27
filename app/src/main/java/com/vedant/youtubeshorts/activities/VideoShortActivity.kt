package com.vedant.youtubeshorts.activities

import android.os.Bundle
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.vedant.youtubeshorts.adapter.SingleVideoAdapter
import com.vedant.youtubeshorts.databinding.ActivityVideoShortBinding
import com.vedant.youtubeshorts.viewmodel.YoutubeShortsViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class VideoShortActivity : AppCompatActivity() {

    private lateinit var binding: ActivityVideoShortBinding
    private lateinit var adapter: SingleVideoAdapter
    private lateinit var youtubeViewModel: YoutubeShortsViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityVideoShortBinding.inflate(layoutInflater)
        setContentView(binding.root)

        youtubeViewModel = ViewModelProvider(this)[YoutubeShortsViewModel::class.java]

        adapter = SingleVideoAdapter(this)
        binding.pager2.adapter = adapter


        youtubeViewModel.list.observe(this, Observer {
            adapter.submitData(lifecycle, it)
        })


    }

}
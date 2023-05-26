package com.vedant.youtubeshorts.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.vedant.youtubeshorts.adapter.VideosAdapter
import com.vedant.youtubeshorts.databinding.ActivityMainBinding
import com.vedant.youtubeshorts.viewmodel.YoutubeShortsViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private lateinit var adapter: VideosAdapter

    private lateinit var youtubeViewModel: YoutubeShortsViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        adapter = VideosAdapter(this)
        youtubeViewModel = ViewModelProvider(this)[YoutubeShortsViewModel::class.java]

        binding.rv.adapter = adapter

        youtubeViewModel.list.observe(this, Observer {
            adapter.submitData(lifecycle, it)
        })
    }
}
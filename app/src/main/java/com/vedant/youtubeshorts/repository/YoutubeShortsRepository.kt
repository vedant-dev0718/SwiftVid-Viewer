package com.vedant.youtubeshorts.repository

import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.liveData
import com.vedant.youtubeshorts.paging.YoutubeShortPagingSource
import com.vedant.youtubeshorts.retrofit.YtAPI
import javax.inject.Inject

class YoutubeShortsRepository @Inject constructor(private val youtubeAPI: YtAPI) {

    fun getVideos() =
        Pager(
            config = PagingConfig(pageSize = 10, maxSize = 100),
            pagingSourceFactory = { YoutubeShortPagingSource(youtubeAPI) }
        ).liveData
}
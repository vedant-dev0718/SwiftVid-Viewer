package com.vedant.youtubeshorts.retrofit

import com.vedant.youtubeshorts.model.YoutubeShortsModel
import retrofit2.http.GET
import retrofit2.http.Query

interface YtAPI {

    @GET("videos")
    suspend fun getVideos(@Query("page") page: Int): YoutubeShortsModel


}
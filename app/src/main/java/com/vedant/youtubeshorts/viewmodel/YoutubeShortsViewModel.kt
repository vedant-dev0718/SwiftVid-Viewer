package com.vedant.youtubeshorts.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.cachedIn
import com.vedant.youtubeshorts.repository.YoutubeShortsRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class YoutubeShortsViewModel @Inject constructor(val youtubeShortsRepository: YoutubeShortsRepository) :
ViewModel
() {

    val list = youtubeShortsRepository.getVideos().cachedIn(viewModelScope)
}
package com.vedant.youtubeshorts.paging

import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.vedant.youtubeshorts.model.PostsItem
import com.vedant.youtubeshorts.retrofit.YtAPI

class YoutubeShortPagingSource(private val youtubeAPI: YtAPI) : PagingSource<Int, PostsItem>() {

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, PostsItem> {
        return try {
            val position = params.key ?: 1
            val response = youtubeAPI.getVideos(position)
            LoadResult.Page(
                data = response.data.posts,
                prevKey = if (position == 1) null else position - 1,
                nextKey = if (position == 10) null else position + 1
            )

        } catch (e: Exception) {
            LoadResult.Error(e)
        }
    }

    override fun getRefreshKey(state: PagingState<Int, PostsItem>): Int? =
        state.anchorPosition?.let {
            state.closestPageToPosition(it)?.prevKey?.plus(1)
                ?: state.closestPageToPosition(it)?.nextKey?.minus(1)
        }
}
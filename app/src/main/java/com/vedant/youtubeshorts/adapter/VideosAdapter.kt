package com.vedant.youtubeshorts.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.lifecycle.LiveData
import androidx.paging.PagingData
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.vedant.youtubeshorts.activities.VideoShortActivity
import com.vedant.youtubeshorts.databinding.OtherViewholderBinding
import com.vedant.youtubeshorts.model.PostsItem

class VideosAdapter(private var context: Context) :
    PagingDataAdapter<PostsItem, VideosAdapter.ViewHolder>(COMPARATOR) {


    class ViewHolder(private val binding: OtherViewholderBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(posts: PostsItem, context: Context) {
            Glide.with(binding.root).load(posts.submission.thumbnail).into(binding.nameImage)

            binding.nameImage.setOnClickListener {
                val intent = Intent(context, VideoShortActivity::class.java)
                intent.putExtra("postId", posts.postId)
                context.startActivity(intent)
            }
        }
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) = run {
        val item = getItem(position)

        if (item != null) {
            holder.bind(item, context)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder =
        ViewHolder(OtherViewholderBinding.inflate(LayoutInflater.from(parent.context)))

    companion object {
        private val COMPARATOR = object : DiffUtil.ItemCallback<PostsItem>() {
            override fun areItemsTheSame(oldItem: PostsItem, newItem: PostsItem): Boolean {
                return oldItem.postId == newItem.postId
            }

            override fun areContentsTheSame(oldItem: PostsItem, newItem: PostsItem): Boolean {
                return oldItem.equals(newItem)
            }
        }
    }
}
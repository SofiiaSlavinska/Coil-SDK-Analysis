package com.sofiia.coilresearch

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import coil.load
import coil.transform.CircleCropTransformation
import coil.transform.RoundedCornersTransformation

class ImageAdapter(private val urls: List<String>) : RecyclerView.Adapter<ImageAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val imageView: ImageView = view.findViewById(R.id.imageView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_image, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.imageView.load(urls[position]) {
            crossfade(true)
            crossfade(500)
            placeholder(android.R.drawable.progress_indeterminate_horizontal)
            error(android.R.drawable.stat_notify_error)

            if (position % 5 == 0) {
                transformations(CircleCropTransformation())
            } else if (position % 3 == 0) {
                transformations(RoundedCornersTransformation(40f))
            }
        }
    }

    override fun getItemCount() = urls.size
}
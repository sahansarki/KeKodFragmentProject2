package com.sahan.kekodfragmentproject2.binding

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestOptions

object ViewBinding {
    @JvmStatic
    @BindingAdapter("LoadImage", "CornerRadius", "Width", "Height")
    fun ImageView.bindLoadImage(
        new_image_url: String,
        radius: Int,
        width: Int,
        height: Int,

    ) {
        Glide.with(this.context)
            .load(new_image_url)
            .apply(RequestOptions().override(width,height).transform(RoundedCorners(radius)))
            .into(this)
    }
}
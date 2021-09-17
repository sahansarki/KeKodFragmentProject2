package com.sahan.kekodfragmentproject2.handler

import android.view.View
import com.sahan.kekodfragmentproject2.MainActivity
import com.sahan.kekodfragmentproject2.model.News

class SectionHandler (
    val news: News,
    private val activity: MainActivity
) {

    fun getIntoDetail(view: View) {
        activity.initHome(true)
        activity.initDetail(false, news.id)
    }
}

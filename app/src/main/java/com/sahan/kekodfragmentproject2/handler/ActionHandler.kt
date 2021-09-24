package com.sahan.kekodfragmentproject2.handler

import com.sahan.kekodfragmentproject2.MainActivity

object ActionHandler {

    fun moveBack(activity: MainActivity) {
        activity.initDetail(true)
        activity.initHome(false)
    }
}
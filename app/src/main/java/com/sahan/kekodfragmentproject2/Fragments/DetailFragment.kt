package com.sahan.kekodfragmentproject2.Fragments

import android.os.Bundle
import androidx.activity.OnBackPressedCallback
import com.sahan.kekodfragmentproject2.Base.BaseFragment
import com.sahan.kekodfragmentproject2.MainActivity
import com.sahan.kekodfragmentproject2.mockdata.mockData.newsList
import com.sahan.kekodfragmentproject2.R
import com.sahan.kekodfragmentproject2.databinding.FragmentDetailBinding
import com.sahan.kekodfragmentproject2.handler.ActionHandler


class DetailFragment : BaseFragment<FragmentDetailBinding>() {

    private var selectedNew: Int = 0

    override fun getLayoudId(): Int = R.layout.fragment_detail

    override fun initUi() {

        val mainActivity = (activity as MainActivity)
        fragmentDataBinding.detailNew = getSelectedArticle(selectedNew)

        activity?.onBackPressedDispatcher?.addCallback(
            viewLifecycleOwner,
            object : OnBackPressedCallback(true) {
                override fun handleOnBackPressed() {
                    ActionHandler.moveBack(mainActivity)
                }
            }
        )
    }

    override fun Bundle.getArgumentsToVariable() {
        selectedNew = this.getInt(NEWS_ID)
    }

    private fun getSelectedArticle(id: Int) = newsList[id]

    companion object {
        private const val NEWS_ID = "newsId"

        @JvmStatic
        fun newInstance(newsId: Int): DetailFragment = DetailFragment().apply {
            arguments = Bundle().apply {
                putInt(NEWS_ID, newsId)
            }
        }


    }
}
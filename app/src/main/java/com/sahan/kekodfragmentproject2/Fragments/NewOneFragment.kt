package com.sahan.kekodfragmentproject2.Fragments

import android.os.Bundle
import com.sahan.kekodfragmentproject2.Base.BaseFragment
import com.sahan.kekodfragmentproject2.MainActivity
import com.sahan.kekodfragmentproject2.mockdata.mockData
import com.sahan.kekodfragmentproject2.R
import com.sahan.kekodfragmentproject2.databinding.FragmentNewOneBinding
import com.sahan.kekodfragmentproject2.handler.SectionHandler


class NewOneFragment : BaseFragment<FragmentNewOneBinding>() {


    override fun getLayoudId(): Int = R.layout.fragment_new_one

    override fun initUi() {
        fragmentDataBinding.news = SectionHandler(mockData.newsList[0], (activity as MainActivity))
    }


    companion object {

        @JvmStatic
        fun newInstance() = NewOneFragment().apply {
                arguments = Bundle()
            }

    }


}
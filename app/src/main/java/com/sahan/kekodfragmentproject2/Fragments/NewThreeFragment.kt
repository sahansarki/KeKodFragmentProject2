package com.sahan.kekodfragmentproject2.Fragments

import com.sahan.kekodfragmentproject2.Base.BaseFragment
import com.sahan.kekodfragmentproject2.MainActivity
import com.sahan.kekodfragmentproject2.mockdata.mockData
import com.sahan.kekodfragmentproject2.R
import com.sahan.kekodfragmentproject2.databinding.FragmentNewThreeBinding
import com.sahan.kekodfragmentproject2.handler.SectionHandler


class NewThreeFragment : BaseFragment<FragmentNewThreeBinding>() {

    override fun getLayoudId(): Int = R.layout.fragment_new_three

    override fun initUi() {
        fragmentDataBinding.news = SectionHandler(mockData.newsList[2], (activity as MainActivity))
    }


    companion object {

        @JvmStatic
        fun newInstance() = NewThreeFragment()
    }
}
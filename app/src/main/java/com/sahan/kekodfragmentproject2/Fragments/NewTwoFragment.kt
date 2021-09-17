package com.sahan.kekodfragmentproject2.Fragments

import com.sahan.kekodfragmentproject2.Base.BaseFragment
import com.sahan.kekodfragmentproject2.MainActivity
import com.sahan.kekodfragmentproject2.mockdata.mockData
import com.sahan.kekodfragmentproject2.R
import com.sahan.kekodfragmentproject2.databinding.FragmentNewTwoBinding
import com.sahan.kekodfragmentproject2.handler.SectionHandler


class NewTwoFragment : BaseFragment<FragmentNewTwoBinding>() {

    override fun getLayoudId(): Int = R.layout.fragment_new_two

    override fun initUi() {
        fragmentDataBinding.news = SectionHandler(mockData.newsList[1], (activity as MainActivity))
    }

    companion object {


        @JvmStatic
        fun newInstance() = NewTwoFragment()
    }
}
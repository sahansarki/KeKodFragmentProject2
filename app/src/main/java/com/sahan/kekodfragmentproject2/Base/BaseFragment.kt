package com.sahan.kekodfragmentproject2.Base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment

abstract class BaseFragment<B : ViewDataBinding> : Fragment() {

    private var _fragmentDataBinding : B? = null
    protected val fragmentDataBinding get() = _fragmentDataBinding!!

    abstract fun getLayoudId() : Int

    open fun initUi() {}

    open fun Bundle.getArgumentsToVariable(){}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        arguments?.getArgumentsToVariable()
    }


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _fragmentDataBinding = DataBindingUtil.inflate(inflater,getLayoudId(),container,false)
        return fragmentDataBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initUi()
    }

    override fun onDestroy() {
        super.onDestroy()
        _fragmentDataBinding = null
    }
}
package com.fengdi.voiceintellect.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.fengdi.voiceintellect.R
import com.fengdi.voiceintellect.app.base.BaseFragment
import com.fengdi.voiceintellect.databinding.FragmentMainBinding
import com.fengdi.voiceintellect.viewmodel.MainViewModel

/**
 *
 *
 *@author: YangJie
 *@email: 2295360491@qq.com
 *@time: 2021/9/25 下午 1:42
 *@descripton: MainFragment
 *
 *
 */
class MainFragment : BaseFragment<MainViewModel, FragmentMainBinding>() {
    override fun layoutId() = R.layout.fragment_main

    override fun initView(savedInstanceState: Bundle?) {

    }


}
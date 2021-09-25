package com.fengdi.voiceintellect.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.fengdi.voiceintellect.R
import com.fengdi.voiceintellect.app.base.BaseFragment
import com.fengdi.voiceintellect.databinding.FragmentLoginBinding
import com.fengdi.voiceintellect.viewmodel.LoginViewModel
import me.hgj.jetpackmvvm.base.viewmodel.BaseViewModel


/**
 *
 *
 *@author: YangJie
 *@email: 2295360491@qq.com
 *@time: 2021/9/25 下午 1:47
 *@descripton:
 *
 *
 */

class LoginFragment : BaseFragment<LoginViewModel,FragmentLoginBinding>() {
    override fun layoutId()=R.layout.fragment_login

    override fun initView(savedInstanceState: Bundle?) {

    }

}
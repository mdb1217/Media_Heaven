package com.java.mediaheaven.base

import android.os.Bundle
import android.view.View
import androidx.annotation.LayoutRes
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment
import com.java.mediaheaven.intent.ViewIntent
import com.java.mediaheaven.intent.ViewState

abstract class BaseFragment <T : ViewDataBinding, I: ViewIntent,
        S: ViewState>(
    @LayoutRes private val layoutRes: Int
) : BindingFragment<T>(layoutRes), BaseView<I, S> {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        subscribeIntents()
    }
}
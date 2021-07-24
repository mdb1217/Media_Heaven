package com.java.mediaheaven.base

import android.os.Bundle
import androidx.annotation.LayoutRes
import androidx.databinding.ViewDataBinding
import com.java.mediaheaven.intent.ViewIntent
import com.java.mediaheaven.intent.ViewState

abstract class BaseActivity<T : ViewDataBinding, I : ViewIntent,
        S : ViewState>(
    @LayoutRes private val layoutRes: Int
) : BindingActivity<T>(layoutRes), BaseView<I, S> {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        subscribeIntents()
    }
}
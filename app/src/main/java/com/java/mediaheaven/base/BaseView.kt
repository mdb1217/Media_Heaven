package com.java.mediaheaven.base

import com.java.mediaheaven.intent.ViewIntent
import com.java.mediaheaven.intent.ViewRenderer
import com.java.mediaheaven.intent.ViewState
import io.reactivex.Observable

interface BaseView <I: ViewIntent, S: ViewState> : ViewRenderer<S> {
    fun subscribeIntents()
    val intents: Observable<I>
}
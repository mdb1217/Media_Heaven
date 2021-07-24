package com.java.mediaheaven.base

import androidx.lifecycle.LiveData
import com.java.mediaheaven.intent.*
import io.reactivex.Observable

abstract class IntentViewModel<I: ViewIntent, A: ViewAction, S: ViewState, R: ViewResult>(
    private val stateMachine: BaseState<I, A, S, R>
) : BaseViewModel() {

    abstract val viewState: LiveData<S>
    fun subscribeIntents(intents: Observable<I>) = stateMachine.subscribeIntents(intents)
    fun processIntent(intent: I) = stateMachine.processIntent(intent)
}
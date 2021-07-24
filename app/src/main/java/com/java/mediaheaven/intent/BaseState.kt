package com.java.mediaheaven.intent

import io.reactivex.Observable

abstract class BaseState<I: ViewIntent, A: ViewAction, S: ViewState, R: ViewResult>(
    private val intentProcessor: IntentProcessor<I, A>
): StateStore<S> {

    fun subscribeIntents(intents: Observable<I>) = intents.subscribe(intentProcessor.intentsSubject)
    fun processIntent(intent: I) = intentProcessor.intentsSubject.onNext(intent)
}
package com.java.mediaheaven.intent

import io.reactivex.subjects.PublishSubject

interface IntentProcessor<I: ViewIntent, A: ViewAction> {
    val intentsSubject: PublishSubject<I>
    fun toAction(intent: I): A
}
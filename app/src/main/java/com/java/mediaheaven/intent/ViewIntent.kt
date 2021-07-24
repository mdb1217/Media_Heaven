package com.java.mediaheaven.intent

import io.reactivex.subjects.PublishSubject

interface ViewIntent

fun <T: ViewIntent> ViewIntent.toPublisher() = PublishSubject.create<T>()
fun <T: ViewIntent> ViewIntent.toPublisherWithEmit(item: T): PublishSubject<T> = toPublisher<T>().also { it.onNext(item) }
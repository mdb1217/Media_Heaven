package com.java.mediaheaven.intent

import androidx.lifecycle.LiveData

interface StateStore <S: ViewState> {
    val currentState: LiveData<S>
}
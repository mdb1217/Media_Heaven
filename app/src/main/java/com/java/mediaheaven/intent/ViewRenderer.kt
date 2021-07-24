package com.java.mediaheaven.intent

interface ViewRenderer<STATE: ViewState> {
    fun render(state: STATE)
}
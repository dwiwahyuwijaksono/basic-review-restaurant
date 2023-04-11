package com.example.restaurantreview.helper

class Event<out T>(private val content: T) {

    @Suppress("MemberVisibilityCanBePrivate")
    private var hasBenHendled = false

    fun getContentIfNotHandle(): T? {
        return if (hasBenHendled) {
            null
        } else {
            hasBenHendled = true
            content
        }
    }

    fun peekContent(): T = content
}
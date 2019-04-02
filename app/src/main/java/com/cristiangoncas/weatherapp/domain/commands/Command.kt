package com.cristiangoncas.weatherapp.domain.commands

interface Command<out T> {
    fun execute(): T
}
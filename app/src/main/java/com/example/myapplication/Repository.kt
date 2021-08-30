package com.example.myapplication

object Repository {
    private val task=Task()
    val newCopy= task.copy(number = 5.2)
}
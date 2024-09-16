package com.alalodev.androidDesde0.todoapp

sealed class TaskCategory {
    object  Personal: TaskCategory()
    object  Business: TaskCategory()
    object  Other: TaskCategory()
}
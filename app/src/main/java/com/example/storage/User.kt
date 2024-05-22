package com.example.storage

data class User(
    val name: String,
    val email: String,
    val uid: String
){
    constructor(): this("", "", "")
}
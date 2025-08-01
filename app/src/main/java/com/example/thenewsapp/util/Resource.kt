package com.example.thenewsapp.util

sealed class Resource<T>(
    val data: T? = null,
    val message: String? = null
){
    class Success<T>(data: T): Resource<T>(data)
    class Error<T>(message: String, data: T?=null): Resource<T>(data, message)
    class Loading<T>: Resource<T>()
    /** Represents a successful response that returned no data. */
    class Empty<T>: Resource<T>()
}

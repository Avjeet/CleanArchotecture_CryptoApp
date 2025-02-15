package com.express.cryptoapp.common

sealed class Resource<T>(var data: T? = null, var message: String? = null) {
    class Success<T>(data: T) : Resource<T>(data)
    class Error<T>(message: String, data: T?= null): Resource<T>(data, message)
    class Loading<T>(data: T?= null): Resource<T>(data = null)

}
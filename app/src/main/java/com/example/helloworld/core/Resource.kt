package com.example.helloworld.core

/**
 * BISMILLAH HIR RAHMAN NIR RAHIM
 * Created by Shohrab Hossen on 22,February,2022
 * @Company Minisoft Park
 * @Address 18/Kha, West Nakhalpara, Tejgaon, Dhaka-1215
 * @Email shohrab.minisoftpark@gmail.com
 */
data class Resource<out T, out E>(val status: Status, val data: T?, val error: E?) {

    companion object {

        fun <T, E> success(data: T?): Resource<T, E> {
            return Resource(Status.SUCCESS, data, null)
        }

        fun <T, E> error( data: T?,error: E): Resource<T, E> {
            return Resource(Status.ERROR, data, error)
        }

        fun <T, E> loading(data: T?): Resource<T, E> {
            return Resource(Status.LOADING, data, null)
        }
    }
}
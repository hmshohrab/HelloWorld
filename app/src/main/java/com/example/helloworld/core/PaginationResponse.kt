package com.example.helloworld.core

import com.google.gson.annotations.SerializedName

/**
 * BISMILLAH HIR RAHMAN NIR RAHIM
 * Created by Shohrab Hossen on 06,March,2022
 * @Company Minisoft Park
 * @Address 18/Kha, West Nakhalpara, Tejgaon, Dhaka-1215
 * @Email shohrab.minisoftpark@gmail.com
 */
data class PaginationResponse<T>(
    @SerializedName("page")
    var page: Int? = 0, // 1
    @SerializedName("hasMore")
    var hasMore: Int? = 0, // 0
    @SerializedName("count")
    var count: Int? = 0, // 1
    @SerializedName("total")
    var total: Int? = 0, // 1
    @SerializedName("totalPages")
    var totalPages: Int? = 0, // 1
    @SerializedName("results")
    var results: MutableList<T>? = mutableListOf()
)

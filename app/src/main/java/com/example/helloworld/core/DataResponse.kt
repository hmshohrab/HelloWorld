package com.example.helloworld.core

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class DataResponse<T>(
    @SerializedName("status_code")
    @Expose
    var status_code: Int = 0,

    @SerializedName("count")
    @Expose
    var count: Int = 0,

    @SerializedName("data")
    @Expose
    var data: T? = null,

    @SerializedName("message")
    @Expose
    var message: String = "",

    @SerializedName("success")
    @Expose
    var success: Boolean = false,

    @SerializedName("user_role")
    @Expose
    var userRole: String = ""
)
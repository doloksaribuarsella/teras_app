package com.bangkit.teras_app.data.response

import com.google.gson.annotations.SerializedName

data class LoginResponse(
    @SerializedName("sucess")
    val success : Int,
    @SerializedName("message")
    val message : String,
    @SerializedName("token")
    val token : String,
)

data class LoginData(
    @field:SerializedName("email")
    val email: String,
    @field:SerializedName("password")
    val password: String,)

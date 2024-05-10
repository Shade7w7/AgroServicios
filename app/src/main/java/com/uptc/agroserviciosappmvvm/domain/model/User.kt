package com.uptc.agroserviciosappmvvm.domain.model

import com.google.gson.Gson
import com.google.gson.annotations.SerializedName

data class User(
    @SerializedName("id_user") val id: String? = null,
    @SerializedName("firstname_user") val name: String,
    @SerializedName("lastname_user") val lastname: String,
    @SerializedName("email_user") val email: String,
    @SerializedName("password_user") val password: String,
    @SerializedName("phone_user") val phone: String? = null,
    @SerializedName("image_user") val image: String? = null,
    @SerializedName("token") val token: String? = null
) {

    fun toJson(): String = Gson().toJson(this)

    companion object {
        fun fromJson (data: String): User = Gson().fromJson(data, User::class.java)
    }
}

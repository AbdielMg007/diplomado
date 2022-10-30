package com.mg.diplomado1

import java.io.Serializable

data class Usuarios(
    var name: String,
    val lastName: String,
    val age: Int,
):Serializable

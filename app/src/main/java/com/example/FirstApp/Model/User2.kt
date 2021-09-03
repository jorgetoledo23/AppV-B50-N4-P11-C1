package com.example.FirstApp.Model

class User2 (nU:String, pass:String, nom:String, ape:String) {
    val nombreUsuario = nU
    val password = pass
    val nombre = nom.uppercase()
    val apellido = ape.uppercase()
}
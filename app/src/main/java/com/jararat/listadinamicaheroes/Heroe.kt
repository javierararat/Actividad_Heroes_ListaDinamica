package com.jararat.listadinamicaheroes

data class Heroe (var name:String, var alterego:String, var url:String) {

    fun getFullName():String = "$alterego - $name"
}
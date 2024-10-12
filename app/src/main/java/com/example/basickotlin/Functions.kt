package com.example.basickotlin

fun withoutParameter(){
    println("== withoutParameter ==")
    println("Hello World!")
}

fun withParameter(name: String){
    println()
    println("== withParameter ==")
    println("Hello, $name!")
}

// named argument merupakan cara untuk memanggil fungsi dengan menyebutkan nama parameter
fun withNamedArgument(name: String, age: Int){
    println()
    println("== withParameter ==")
    println("Hello, $name! You are $age years old.")
}

// default parameter value
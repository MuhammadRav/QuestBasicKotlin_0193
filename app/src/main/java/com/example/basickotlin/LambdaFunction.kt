package com.example.basickotlin

// Lambda functions adalah fungsi yang tidak memiliki nama
// lambda functions biasanya digunakan untuk membuat fungsi yang sederhana
// lambda functions menggunakan tanda panah -> untuk memisahkan parameter dan body fungsi

fun uppercaseString(string: String): String{
    return string.uppercase()
}

// dapat ditulis dalam ekspresi lambda sbb :
fun main(){
    uppercaseString("Hello")
    println({ string: String -> string.uppercase()} ("Hello"))
    //Hello
}
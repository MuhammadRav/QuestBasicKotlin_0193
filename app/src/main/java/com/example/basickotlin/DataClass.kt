package com.example.basickotlin

import android.provider.ContactsContract.Data

// Data class adalah class yang digunakan untuk menyimpan data.
// Data class menyediakan fungsi untuk meng-override fungsi equals(), hashCode(), dan toString()
// Data class juga menyediakan fungsi copy() untuk membuat salina objek dengan beberapa perubahan

data class DataClass(
    val id: Int,
    var email: String
)

fun main(){
    val data = DataClass(1, "shen@gmail.com")
    println(data)

    // fungsi equals
    val data2 = DataClass(1, "makan@gmail.com")
    println(data == data2)  // false

    // fungsi copy
    val data3 = data.copy()
    println(data3)

    // fungsi copy dengan perubahan
    val data4 = data.copy(email = "sahar@gmail.com" )
    println(data4)
}
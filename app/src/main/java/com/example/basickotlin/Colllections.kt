package com.example.basickotlin

// list adalah kumpulan data yang disusun secara berurutan seperto antrian
// list bersifat ordered, artinya data yang dimasukkan akan memiliki posisi sesuai urutan
// list bersifat mutable dan read only, artinya data yang dimasukkan dapat diubah dan tidak dapat diubah
// list Read-only menggunakan listOf
// list Mutable menggunakan mutableListOf

fun ContohList(){
    println("=== List ===")
    //List Read-Only
    val readOnlyAbjad = listOf("A", "B", "C")
    println(readOnlyAbjad)

    //List mutable
    val shape: MutableList<String> = mutableListOf("Circle", "Square", "Triangle")
    println(shape)

    // menambahkan data ke dalam list mutable
    shape.add("Circle")
    println(shape)

    // menghapus data di dalam list mutable
    shape.remove("Triangle")
    println(shape)

    // mengedit data di dalam list mutable
    shape[0] = "Oval"
    println(shape)

    // list read-only
    val shapesLocked: List<String> = shape
    println(shapesLocked)
}
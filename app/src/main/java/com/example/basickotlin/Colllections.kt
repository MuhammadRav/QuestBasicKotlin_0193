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

// Set adalah kumpulan data yang tidak memiliki posisi atau urutan tertentu dan hanya menyimpan data unik(tidak ada duplikasi)
// Set bersifat unordered(tidak antri), artinya data yang dimasukkan tidak memiliki posisi tertentu
// Set bersifat mutable dan read only, artinya datayang dimasukkan dapat diubah dan tidak dapat diubah
// Set Read-Only menggunakan setOf
// Set Mutable menggunakan mutableSetOf

fun ContohSet(){
    println()
    println("=== Set ===")

    // set Read-Only
    val readOnlyAbjad = setOf("A", "B", "C")
    println(readOnlyAbjad)

    // set mutable
    val shape: MutableSet<String> = mutableSetOf("Circle", "Square", "Triangle")
    println(shape)

    // menambahkan data ke dalam set mutable
    shape.add("Rectangle")
    println(shape)

    //menghapus data di dalam set mutable
    shape.remove("Circle")
    println(shape)

    //set Read-Only
    val shapesLocked: Set<String> = shape
    println(shapesLocked)
}

// Map adalah kumpulan data yang disusun dalam pasangan key-value
// Map bersifat unordered, artinya data yang dimasukkan tidak memiliki posisi tertentu
// Map bersifat mutable dan read only, artinya datayang dimasukkan dapat diubah dan tidak dapat diubah
// Map Read-Only menggunakan mapOf
// Map Mutable menggunakan mutableMapOf

fun ContohMap(){
    println()
    println("=== Map ===")

    // Map Read-Only
    val readOnlyShape: Map<String, Int> = mapOf("Circle" to 1, "Squar" to 2, "Triangle" to 3)
    println(readOnlyShape)

    // Map mutable
    val shape: MutableMap<String, Int> = mutableMapOf("Circle" to 1, "Square" to 2, "Triangle" to 3)
    println(shape)

    // menambahkan data ke dalam map mutable
    shape["Rectangle"] = 4
    println(shape)

    // menghapus data dari map mutable
    shape.remove("Circle")
    println(shape)

    // Mengubah data dari map mutable
    shape["Square"] = 5
    println(shape)

    // Map Read-Only
    val shapesLocked: Map<String, Int> = shape
    println(shapesLocked)
}

fun main(){
    ContohList()
    ContohSet()
    ContohMap()
}

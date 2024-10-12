package com.example.basickotlin

fun nullSafety(){
    // neverNull has String type
    var neverNull: String = "This can't be null"

    // Throws a compiler error
    // neverNull = null

    // nullable has nullable String type
    var nullable: String? = "You can keep a null here"
    // this is ok
    nullable = null

    // check for null in conditions
    if (neverNull == null){
        println("inferredNonNull is null")
    }else {
        println("inferredNonNull is not null")
    }

    // safe call operator
    println(neverNull.length) // 18
    println(nullable?.length) // null

    // notNull doesn't accept null values
    fun strLength(notNull: String): Int{
        return notNull.Length
    }

    println(strLength(neverNull)) // 18
}

fun main(){
    nullSafety()
}
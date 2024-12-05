package com.example.androidstudy.kotlin

fun plusThree(first: Int, second: Int, third: Int) : Int {
    return first + second + third
}

fun minusThree(first: Int, second: Int, third: Int) = first - second - third

fun multiplyThree(first: Int = 1, second: Int = 1, third: Int = 1) : Int {
    return first * second * third
}

// 내부 함수
// - 함수 안에 존재하는 함수
fun showMyPlus(first: Int, second: Int) : Int {
    println(first)
    println(second)

    fun plus(first: Int, second: Int) : Int {
        return first + second
    }

    return plus(first, second)
}

fun main(array: Array<String>) {
    val result = plusThree(first=1, second=2, third=5)
    println(result)

    val result2 = minusThree(first=10, second=2, third=3)
    println(result2)

    val result3 = multiplyThree(first=10, second=2, third=3)
    println(result3)

    val result4 = multiplyThree()
    println(result4)

    val result5 = showMyPlus(4,5)
    println(result5)
}
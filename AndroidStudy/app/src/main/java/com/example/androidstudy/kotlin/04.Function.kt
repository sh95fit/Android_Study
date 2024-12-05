package com.example.androidstudy.kotlin

// 04. 함수
// - Input을 넣으면 Output을 출력

// 함수 선언 방법
// fun 함수명 (변수명: 타입, 변수명: 타입 ...) : 반환형 {
//    함수 내용
//    return 반환값
// }

fun plus(first: Int, second: Int): Int {
    println(first)
    println(second)
    val result: Int = first + second
    return result
}

// - 디폴트 값을 갖는 함수 만들기
fun plusFive(first: Int, second: Int = 5): Int {
    val result: Int = first + second
    return result
}

// - 반환값이 없는 함수 만들기 (Unit을 표시하거나 생략 가능)
fun printPlus(first: Int, second: Int): Unit {
    val result: Int = first + second
    println(result)
}

fun printPlus1(first: Int, second: Int) {
    val result: Int = first + second
    println(result)
}

// - 간단하게 함수 선언하는 방법
fun plusShort(first: Int, second: Int) = first + second

// - 가변 인자를 갖는 함수 선언하는 방법
fun plusMany(vararg numbers: Int) {
    for (number in numbers) {
        println(number)
    }
}

fun main(array: Array<String>) {
    // 함수를 호출하는 방법
    println()
    val result = plus(5, 10)
    println(result)

    // 인수를 명시적으로 전달하는 방법
    println()
    val result1 = plus(first = 15, second = 10)
    println(result1)

    println()
    val result2 = plus(second = 150, first = 10)
    println(result2)

    println()
    val result3 = plusFive(10, 20)
    println(result3)
    val result4 = plusFive(10)
    println(result4)

    println()
    printPlus(10, 20)

    println()
    val result5 = plusShort(50, 50)
    println(result5)

    println()
    plusMany(1,2,3,4,5)
    plusMany(1,2,3,4,5)
}

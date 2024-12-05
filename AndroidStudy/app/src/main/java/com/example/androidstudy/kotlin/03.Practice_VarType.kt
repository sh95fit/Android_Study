package com.example.androidstudy.kotlin

var a = 1 + 2 + 3 + 4 + 5 // 연산의 결과 값을 변수에 넣을 수 있음
var b = "1"
var c = b.toInt()
var d = b.toFloat()

var e = "John"
var f = "My name is $e Nice to meet you"

// Null
// - "존재하지 않음"을 나타내는 값

//var abc : Int = null  // 에러 발생
var abc : Int? = null   // 물음표를 붙이면 null을 포함하는 값이 된다!

fun main(array : Array<String>){
    println(a)
    println(b)
    println(c)
    println(d)
    println(e)
    println(f)
    println(abc)
}
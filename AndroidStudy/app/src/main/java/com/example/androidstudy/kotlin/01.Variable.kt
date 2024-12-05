package com.example.androidstudy.kotlin

// 01. Variable -> 변수

// 변수 선언
// var/val 변수명 = 값
// var : Variable : 마음대로 값을 넣을 수 있는 형태
// val : Value : 한 번 지정되면 변경될 수 없는 형태

var num = 10
var hello = "hello"
var point = 3.4

const val fix = 20

fun main(args:Array<String>){

    println(num)
    println(hello)
    println(point)
    println(fix)

    num = 100
    hello = "Change"
    point = 34.4

    println(num)
    println(hello)
    println(point)
    println(fix)

}
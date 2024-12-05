package com.example.androidstudy.kotlin

// 02. 자료형
// 정수형 : Long > Int > Short > Byte
// 실수형 : Double > Float
// 문자 : Char
// 문자열 : String
// 논리형(참 : True / 거짓 : False) : Boolean

// var의 경우 최초에 지정한 값의 자료형 타입과 같은 형태로만 변경이 가능하다!

var number = 20

// 변수 선언하는 방법(2)
// var/val 변수명 : 자료형 = 값

var number1 : Int = 20
var hello1 : String = "String"
var point1 : Double = 3.4

// Variable vs Value
// - 1. 변하지 않는 값이라면 Value로 선언
// - 2. 변수가 변할지 안 변할지 모르는 경우 Value로 선언해둔 후 추후 변경이 발생할 때 수정 (실수를 줄이는 팁!)

// 코틀린의 특징
// 자료형을 명시해주지 않으면 최초에 들어온 값으로 자료형을 자동으로 지정한다

fun main(array: Array<String>){
//    number = 20.5  // 형태가 다르므로 에러 발생

}
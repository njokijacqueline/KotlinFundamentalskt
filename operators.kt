//Arithmetic operators
var a=15
var b=8
var c=27
var d=50
var sum=15+8+27
var difference=15-8-27
var multiplication=15*8*27
var division=15/8/27
var first=15+8
var sec=27+50
//Arithmetic operators example
//Add all
fun main() {
    sum=a+b+c
    println("a+b+c=$sum")
    //subtract all
    difference=a-b-c
    println("c-a-b=$difference")
    //multiply all
    multiplication=a*b*c
    println("a*b*c=$multiplication")
    //divide all
    division=a/b/c
    println("a/b/c=$division")

    //comparison operators
    if(a>b){
        println("$a and is greater than $b")
    }else{
        println("$b and is greater than $a")
    }
//logical operator
    val x =10
    val y =5
    val z =7

    val result1 :Boolean = (x > y) && (y < z)
    val result2 :Boolean = (x < y) || (z > y)
    val result3 :Boolean = !(x == z)

    println("result1: $result1")//Output:Result 1: true
    println("result2: $result2")//Output:Result 2: true
    println("result3: $result3")//Output:Result 3: true
}

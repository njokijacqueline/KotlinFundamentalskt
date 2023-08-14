package con.example.kotlinfundamentals

//Kotlin Variables

/*
*Variables refers to a memory location. It is used to store data.
* The data of variables can be changed and reused depending on condition or pn information passed to the programmer.
 */

//Variable Declaration
/*
*Kotlin variable is declared using keyword var val.
* example below
*   var language="java"
*   val salary="30000"
 */

//Difference between var and val
/*
*Var [Mutable variable]: We can change the value of variable declared using var keyword later in the program.
* Val [Immutable variable]: We cannot change the value of a variable which is not declared using val keyword.*/

    var chairs=20
    var tables=40
    var desks=60

    val pie=3.142
    val km=1000
    val cm=100
fun main() {
    println("i have $chairs so i need $tables")
}
package com.example.kotlincoroutines

//higher order functions
//fun which takes or returns another function


//function
//fun someFunction() {
//
//}

//lambda - anonymous function
//val lambda = {
//
//}

//fun main() {
//    val i = 10
//    println(i)
//}


//fun main() {
//    someMethod()
//}
//
//fun someMethod() {
//    println("someMethod")
//}


//fun main() {
//    val lambda = {
//        println("this is lambda")
//    }
//    lambda()
//}

//fun main() {
//    //takes no arguments and return "Unit"
//    //takes no parameters and return "Unit"
//    val lambda = {
//        println("this is lambda")
//    }
//    lambda
//}

//fun main() {
//    val i = 10
//    i
//}


//fun main() {
//    someMethod
//}
//
//fun someMethod() {
//    println("someMethod")
//}


//() -> Unit
//() -> Int

//fun main() {
//    someMethod()
//    someMethod2()
//}
//
////Unit === void in Java
//fun someMethod() {
//    println("someMethod")
//}
//fun someMethod2():Unit {
//    println("someMethod")
//}




//fun main() {
//    val lambda = {
//    }
//
//    val lambda2 = {
//        10  //return 10 gives compile error
//    }
//
//    val lambda3 = {
//        "hai"
//    }
//    //println(lambda3)//Function0<java.lang.String>
//    //wildcards
//    //generics
//
//    val lambda4 = {
//        10
//    }
//    //println(lambda4)//Function0<java.lang.Integer>
//
//    val myFun = MyFun().invoke()//Type is Int not () -> Int
//
//    m(lambda4)
//    val l = m2()
//    m(l)
//    m(m2())
//
//    val someObject = SomeClass()
//    //println(someObject)//com.example.androidcoroutines.SomeClass@36d64342
//
//
//    //
//    20.sayHi()
//
//}
//
//fun m(v: () -> Int) {
//    val i = v()
//    println(i)
//}
//
//fun m2(): () -> Int {
//    //Kotlin Type inference
//    val l = {
//        10
//    }
//    val i = 10
//    return l
//}
//
//class MyFun : Function0<Int> {
//    override fun invoke(): Int {
//        return 10
//    }
//}
//
//class SomeClass {}
//
//


////extension functions
//
//fun Int.sayHi() {
//    println("Hi")
//}
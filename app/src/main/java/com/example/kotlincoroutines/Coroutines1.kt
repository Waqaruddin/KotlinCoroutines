package com.example.kotlincoroutines

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch


//fun main(){
//    println("A: " + Thread.currentThread().name)
//    Thread{
//        println("B: " + Thread.currentThread().name)
//    }.start()
//}

//
//fun main(){
//    println("A: " + Thread.currentThread().name)
//    Thread{
//        Thread.sleep(5000)
//        println("B: " + Thread.currentThread().name)
//    }.start()
//
//    println("C:")
//}


//fun main(){
//    println("A: " + Thread.currentThread().name)
//    GlobalScope.launch {
//        println("B: " + Thread.currentThread().name)
//    }
//}

suspend fun main() = coroutineScope{
    println("A: " + Thread.currentThread().name)
    launch {
        delay(1000)
       // println("Kotlin Coroutines World!")
        println("B: " + Thread.currentThread().name)

    }
    println("Hello")
    println("C: " + Thread.currentThread().name)


}
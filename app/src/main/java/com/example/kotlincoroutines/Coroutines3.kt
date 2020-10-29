package com.example.kotlincoroutines

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

//coroutines discussion
//fun main() {
//    //val i = GlobalScope.launch {}
//    //val i = GlobalScope.launch(block = {})
//    val i = GlobalScope.launch(block = f)
//}
//
//val f2: () -> String = {
//    "10"
//}
//
//val f: suspend CoroutineScope.() -> Unit = {
//}

//fun main() {
//    //coroutine
//    val i = GlobalScope.launch(block = f)
//
//}
//
//val f: suspend CoroutineScope.() -> Unit = {
//    println("A: " + Thread.currentThread().name)//A: DefaultDispatcher-worker-2
//}

//suspend fun main() {
//    val job = GlobalScope.launch(block = CoroutineScope::m)
//}
//
//suspend fun CoroutineScope.m() {
//    println("A: " + Thread.currentThread().name)
//}


//suspend fun main() {
//    val i = GlobalScope.async(block = f)
//    val value = i.await()
//    println(value)
//}
//
//val f: suspend CoroutineScope.() -> Int = {
//    println("A: " + Thread.currentThread().name)//A: DefaultDispatcher-worker-1
//    10  //return 10
//}

//suspend fun main() {
//    val job = CoroutineScope(IO).launch {
//        println("A: " + Thread.currentThread().name)//A: DefaultDispatcher-worker-1
//    }
//}

//fun main() {
//    val job = CoroutineScope(Main).launch {
//        println("A: " + Thread.currentThread().name)//A: DefaultDispatcher-worker-1
//    }
//}

fun main() {
    val job = CoroutineScope(Dispatchers.IO).launch {
        println("A: " + Thread.currentThread().name)//A: DefaultDispatcher-worker-1
    }
}

//suspend fun main() {
//    val i = CoroutineScope(IO).async(block = f)
//    val value = i.await()
//    println(value)
//}
//
//val f: suspend CoroutineScope.() -> Int = {
//    println("A: " + Thread.currentThread().name)//A: DefaultDispatcher-worker-1
//    10  //return 10
//}


//questions:


//launch vs async
// fire and forget vs returns value
//{
//}
//
//vs
//
//{
//    10
//}


//how to create coroutines

//GlobalScope
//CoroutineScope
//CoroutineContext

//Dispatchers
//
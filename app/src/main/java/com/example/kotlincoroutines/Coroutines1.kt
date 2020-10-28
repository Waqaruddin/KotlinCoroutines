package com.example.kotlincoroutines

import kotlinx.coroutines.*


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

//fun main() {
//    println("A: " + Thread.currentThread().name)
//    println("B: " + Thread.currentThread().name)
//}

//fun main() {
//    println("A: " + Thread.currentThread().name)
//    Thread {
//        println("B: " + Thread.currentThread().name)
//    }.start()
//}


//fun main() {
//    println("A: " + Thread.currentThread().name)
//    Thread {
//        Thread.sleep(10000)
//        println("B: " + Thread.currentThread().name)
//    }.start()
//}

//fun main() {
//    println("A: " + Thread.currentThread().name)
//    Thread {
//        Thread.sleep(10000)
//        println("B: " + Thread.currentThread().name)
//    }.start()
//    println("C: " + Thread.currentThread().name)
//}


//A: main
//B: Thread-0
//C: main
//OR
//A: main
//C: main
//B: Thread-0
//fun main() {
//    println("A: " + Thread.currentThread().name)
//    Thread {
//        println("B: " + Thread.currentThread().name)
//    }.start()
//    println("C: " + Thread.currentThread().name)
//}

//fun main() {
//    println("A: " + Thread.currentThread().name)
//    GlobalScope.launch {
//        println("B: " + Thread.currentThread().name)
//    }
//}


//fun main() {
//    println("A: " + Thread.currentThread().name)
//    GlobalScope.launch {
//        println("B: " + Thread.currentThread().name)
//    }
//    runBlocking {
//        delay(5000)
//    }
//}


//
//fun main() {
//    val i = 10//cannot put suspend
//}
//
//class SomeClass { //cannot put suspend
//    suspend fun m() {//can put suspend
//    }
//}
//suspend fun m() {//can put suspend
//}

//fun main() {
//    m1()//can call suspend fun only from coroutine or another suspend fun
//}
//suspend fun m1() {
//}


//fun main() {
//}
//
//suspend fun m1() {
//    m2()
//}
//
//suspend fun m2() {
//}


//suspend fun main() {
//    m1()
//}
//suspend fun m1() {
//}

//suspend fun main() {
//    println("A")
//    m1()
//}
//suspend fun m1() {
//    println("B")
//}


//suspend fun main() {
//    println("A: " + Thread.currentThread().name)
//    m1()
//}
//suspend fun m1() {
//    println("B: " + Thread.currentThread().name)
//}

//fun main() {
//    val f = {
//        println("B: " + Thread.currentThread().name)
//    }
//}

//suspend fun main() {
//    val f = GlobalScope.m()
//    //GlobalScope.launch(block = GlobalScope.m())
//}
//suspend fun CoroutineScope.m(){//extension fun
//    println("B: " + Thread.currentThread().name)
//}

//suspend fun main() {
//    val d = GlobalScope.async {
//        println("c: " + Thread.currentThread().name)
//        10
//    }
//
//    //get value from deferred
//    val i = d.await()
//    println(i)
//}

//fun main() {
//    println("A: " + Thread.currentThread().name)
//    runBlocking {
//        println("B: " + Thread.currentThread().name)
//        m()
//    }
//    println("D: " + Thread.currentThread().name)
//}
//
//suspend fun m() {
//    println("C: " + Thread.currentThread().name)
//}
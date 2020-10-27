Android Async programming
======

Java:
Thread
https://docs.oracle.com/javase/7/docs/api/java/lang/Thread.html

ExecutorService
https://docs.oracle.com/javase/7/docs/api/java/util/concurrent/ExecutorService.html


Android:
AsyncTask (deprecated)
https://developer.android.com/reference/android/os/AsyncTask

class MyAsyncTask extends AsyncTask{
    //doInBackground(){
        //new thread
    }
}

Kotlin
========
coroutines
https://kotlinlang.org/docs/reference/coroutines-overview.html
https://github.com/Kotlin/kotlinx.coroutines

1.4


jetbrains library


Android Kotlin Coroutines
https://developer.android.com/kotlin/coroutines

    implementation 'org.jetbrains.kotlinx:kotlinx-coroutines-android:1.4.0'




Suspend keyword
===================
part of kotlin lang


Java Future
https://docs.oracle.com/javase/7/docs/api/java/util/concurrent/Future.html

Deferred
https://kotlin.github.io/kotlinx.coroutines/kotlinx-coroutines-core/kotlinx.coroutines/-deferred/



suspend calling suspend
coroutine calling suspend
launch
async
runBlocking
coroutineScope
how to create coroutine


CPS
//continuation
{
}

button.onclick {

}

Java
Thread {
}.start













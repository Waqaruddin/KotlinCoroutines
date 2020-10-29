package com.example.kotlincoroutines

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import java.io.BufferedReader
import java.net.HttpURLConnection
import java.net.URL

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //networkCall()//android.os.NetworkOnMainThreadException

//        Thread {
//            networkCall()
//        }.start()

        CoroutineScope(Dispatchers.IO).launch {
            networkCall()
        }

        //repository.method() //cannot call directly as it is suspend method

//        CoroutineScope(IO).launch {
//            repository.method()
//        }
    }


    private fun networkCall() {
        val s =
                (URL("http://www.android.com/").openConnection() as HttpURLConnection)
                        .inputStream
                        .bufferedReader()
                        .use(BufferedReader::readText)
        Log.d("TADA", s)
    }
}


//RETROFIT
//interface API{
//    fun s:Person
//}

//interface API{
//    suspend fun s:Person
//}

//class Repository{
//    suspend fun m(){
//        api.s()
//    }
//}


//project1


//coroutines retrofit
//copy of project1


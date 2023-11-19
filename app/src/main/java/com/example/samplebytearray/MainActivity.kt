package com.example.samplebytearray

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.samplebytearray.ui.theme.SampleByteArrayTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SampleByteArrayTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    main()
                }
            }
        }
    }
}

fun main() {
    val byte4096 = ByteArray(4096)
    val byteArray = byteArrayOf(65, 66, 67)
    println("${byte4096.size}") // size = 4096
    println("${byteArray.size}") // size = 3
    byteArray.forEach {
        println("$it")
    }
}
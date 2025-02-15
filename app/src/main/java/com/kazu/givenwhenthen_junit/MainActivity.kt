package com.kazu.givenwhenthen_junit

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.kazu.givenwhenthen_junit.ui.theme.GivenWhenThenJUnitTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val viewModel = MainViewModel()
        setContent {
            GivenWhenThenJUnitTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val nameFlag = 1
                    Greeting(viewModel.outputName(nameFlag))
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Box {
        Text(
            text = "Hello $name !",
            modifier = modifier
                .align(Alignment.Center)
                .background(
                    color = Color.Cyan
                )
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    GivenWhenThenJUnitTheme {
        Greeting("Android")
    }
}
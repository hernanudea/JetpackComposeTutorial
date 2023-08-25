package dev.velasquez.jetpackcomposetutorial

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyComponents()
        }
    }
}

@Composable
fun myTests() {
    Column {
        myText("lorem ipsun")
        myText("Hola Mundo Inmundo!")
        myText("Hola Mundo Inmundo!")
    }
}

@Composable
fun MyComponents() {
    Row {
        MyImage()
        myTests()
    }
}


@Composable
fun MyImage() {
    Image(
        painterResource(R.drawable.ic_launcher_foreground),
        "Mi primera imagen"
    )
}

@Composable
fun myText(text: String) {
    Text(text)
}

@Preview
@Composable
fun PreviewComponents() {
    MyComponents()
}


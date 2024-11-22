package com.example.firstappjetpack

import android.content.res.Resources.Theme
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.firstappjetpack.ui.theme.FirstAppJetpackTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FirstAppJetpackTheme {
//                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
//                    Greeting(
//                        name = "Android",
//                        modifier = Modifier.padding(innerPadding)
//                    )
//                    GretingText(
//                        message = "happy birthday yassine",
//                        from = "from ali",
//                        modifier = Modifier.padding(innerPadding)
//                    )
//                }
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    GretingText(
                        message = "happy birthday yassine",
                        from = "from ali",
                        modifier = Modifier.padding(8.dp)
                    )

                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier,
        lineHeight = 36.sp

    )
}
@Composable
fun GretingText(message:String,from:String,modifier: Modifier=Modifier){
    Column (
        verticalArrangement = Arrangement.Center,
        modifier = modifier
    ){
        Text(
            text=message,
            fontSize = 100.sp,
            lineHeight = 110.sp,
            textAlign = TextAlign.Center
        )
        Text(
            text = from,
            fontSize = 36.sp, modifier=Modifier.padding(16.dp).align(alignment = Alignment.End)

        )
    }

}
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    FirstAppJetpackTheme {
        GretingText(message = "happy birthday yassine", from = "from ali",Modifier)
    }
}
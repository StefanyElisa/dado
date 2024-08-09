package com.example.dado

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.dado.ui.theme.DadoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DadoTheme {
                // A surface container using the 'background' color from the theme
                DadoComBotao(modifier = Modifier
                    .fillMaxSize()
                    .wrapContentSize(Alignment.Center)
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DadoAppPreview(){
    //para colocar texto precisa colocar um text dentro do componente
    DadoTheme {
        DadoComBotao(modifier = Modifier
            .fillMaxSize()
            .wrapContentSize(Alignment.Center)

        )
    }
}

@Composable
fun DadoComBotao(modifier: Modifier = Modifier){
    //por padrão o button tem o onclick
    var resultado by remember { mutableStateOf(1)}
    Column(
        modifier = modifier,

        horizontalAlignment = Alignment.CenterHorizontally
        ) {

        //para organizar colocar uma prorpiedade embaixo da outra para ficar mais facil de interpretar

        Image(
            painter = painterResource(id = R.drawable.dice_6) ,
            contentDescription = "Dado lado 1")
        Button(
            onClick = {
                val intervaloDeSorteio = 1..6
                resultado = intervaloDeSorteio.random()


            }) {
            Text(text = "ROLAR DADO")
            //

        }
    }
}











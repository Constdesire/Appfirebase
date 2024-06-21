package com.example.meuprimeiro

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.meuprimeiro.ui.theme.MeuPrimeiroTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
              App()
        }
    }
}

@Composable
fun App(){
    Column(
        Modifier
            .fillMaxWidth()
    ) {
        Row(
            Modifier
                .fillMaxWidth(),
            Arrangement.Center
        ){
            Text(
                text = "App Firebase Firestore",
                fontFamily =  FontFamily.SansSerif,
                fontWeight = FontWeight.Bold,
                fontSize = 30.sp
            )
        }
        //------------------
        Row(
            Modifier
                .fillMaxWidth()
        ) {

        }
        //-----------------
        Row(
            Modifier
                .fillMaxWidth()
        ) {
            Column(
                Modifier
                    .fillMaxWidth(0.3f)
            ) {
                Text(text = "Nome:")
            }
            Column(

            ) {
               TextField(
                   value = "",
                   onValueChange = {}
               )
            }
        }
        //------------------//
        Row(
            Modifier
                .fillMaxWidth()
                .padding(20.dp)
        ) {

        }
        //------------------//
        Row(
            Modifier
                .fillMaxWidth()
        ) {
            Column(
                Modifier
                    .fillMaxWidth(0.3f)
            ) {
                Text(text = "Telefone:")
            }
            Column(

            ) {
                TextField(
                    value = "",
                    onValueChange = {}
                )
            }

        }
        //-------------------
        Row(
            Modifier
                .fillMaxWidth(),
            Arrangement.Center
        ) {
            Button(onClick = { /*TODO*/ }) {
                Text(text = "Cadastrar")
            }
        }
        //-------------------
    }
}


@Preview
@Composable
fun appPreview(){
    MeuPrimeiroTheme {
        // A surface container using the 'background' color from the theme
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            App()
        }
    }
}
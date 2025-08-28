package com.ssu.tutorials.captiangame

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.ssu.tutorials.captiangame.ui.theme.CaptianGameTheme
import kotlin.random.Random

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CaptianGameTheme {
                CaptianGame()
            }
        }
    }

    @Composable
    fun CaptianGame(){
        val treasuresFound = remember { mutableStateOf(0) }
        val direction = remember { mutableStateOf("North") }
        val stormontreasurevalue = remember { mutableStateOf("") }
        Column {
            Text("Treasures Found:${treasuresFound.value}")
            Text("Direction :${direction.value}")
            Text(" :${stormontreasurevalue.value}")

            Button(onClick = {
                direction.value = "East"
                if(Random.nextBoolean()){
                    treasuresFound.value +=1
                    stormontreasurevalue.value = "We Found the Treasure "
                }else{
                    stormontreasurevalue.value = "Not  Found The Tresure"
                }
            }) {
                Text("Sail East")
            }


            Button(onClick = {
                direction.value = "West"
                if(Random.nextBoolean()){
                    treasuresFound.value +=1
                    stormontreasurevalue.value = "We Found the Treasure "
                }else{
                    stormontreasurevalue.value = "Not  Found The Tresure"
                }
            }) {
                Text("Sail West")
            }


            Button(onClick = {
                direction.value = "North"
                if(Random.nextBoolean()){
                    treasuresFound.value +=1
                    stormontreasurevalue.value = "We Found the Treasure "
                }else{
                    stormontreasurevalue.value = "Not  Found The Tresure"
                }
            }) {
                Text("Sail North")
            }


            Button(onClick = {
                direction.value = "South"
                if(Random.nextBoolean()){
                    treasuresFound.value +=1
                    stormontreasurevalue.value = "We Found the Treasure "
                }else{
                    stormontreasurevalue.value = "Not  Found The Tresure"
                }
            }) {
                Text("Sail South")
            }
        }
    }
}


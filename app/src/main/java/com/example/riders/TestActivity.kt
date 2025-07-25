package com.example.riders

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Surface
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.riders.ui.theme.RidersTheme

class TestActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent{
            RidersTheme {
                Surface(modifier = Modifier.fillMaxSize()){
                    Box(
                        modifier = Modifier.fillMaxSize(),
                        contentAlignment = Alignment.Center
                    ) {
                        Button(onClick = {
                            Log.d("TestActivity", "Compose Button Clicked in TestActivity")
                        }) {
                            Text("Test Compose Button")
                        }
                    }
                }
            }
        }
        }
    }

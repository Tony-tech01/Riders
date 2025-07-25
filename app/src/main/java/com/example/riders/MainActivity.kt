package com.example.riders

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.lifecycle.lifecycleScope
import com.example.riders.ui.screen.home.HomePage

import com.example.riders.ui.theme.RidersTheme
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val splashscreen = installSplashScreen()
        var keepSplashOnScreen = true
        super.onCreate(savedInstanceState)
        splashscreen.setKeepOnScreenCondition { keepSplashOnScreen }
        lifecycleScope.launch{
            delay(3000)
            keepSplashOnScreen = false
        }
        enableEdgeToEdge()

        setContent {
            RidersTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    HomePage(
                        modifier = Modifier.padding(innerPadding),
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun HomePagePreview() {
    RidersTheme {

    }
}



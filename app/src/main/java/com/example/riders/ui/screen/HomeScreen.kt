package com.example.riders.ui.screen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import coil3.compose.AsyncImage


@Composable
fun HomePage( modifier: Modifier = Modifier, innerPadding: PaddingValues){
    Box(
        modifier = Modifier.fillMaxSize().padding(innerPadding)
    ){
       AsyncImage(
           model = "https://imgs.search.brave.com/GL-l5r9rbZhAUks68m_p4Ef4-RzjMYaICj55MeNxjAg/rs:fit:500:0:1:0/g:ce/aHR0cHM6Ly9tZWRp/YS5pc3RvY2twaG90/by5jb20vaWQvMTI5/MDgwMDg5MC92ZWN0/b3IvbmFpcm9iaS1r/ZW55YS1jaXR5LW1h/cC1pbi1yZXRyby1z/dHlsZS1pbi1nb2xk/ZW4tY29sb3Itb3V0/bGluZS1tYXAuanBn/P3M9NjEyeDYxMiZ3/PTAmaz0yMCZjPVFT/Njk4OVNCMVlSZzVM/UzBzaEhMMDlUa1Bh/SHFSQjJ4Vms3UFBO/N1ZnTGs9",
           contentDescription = "Riders Home Page",
           modifier = Modifier.fillMaxSize()
       )
    }
}
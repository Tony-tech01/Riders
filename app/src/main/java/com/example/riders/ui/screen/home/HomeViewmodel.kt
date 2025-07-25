package com.example.riders.ui.screen.home

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class HomeViewmodel: ViewModel() {
    var isSheetExpanded by mutableStateOf(false)
        private set
    fun toggleSheet(){
        isSheetExpanded = !isSheetExpanded
    }
    fun onMenuClick(){
        println("Viewmodel: Menu Clicked")
    }
    fun onDestinationClick(){
        println("Viewmodel: destination Clicked")
    }
    fun updateSheetExpanded(expanded: Boolean){
        isSheetExpanded = expanded

    }
}
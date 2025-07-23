package com.example.riders.ui.components

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun ButtonForCAT(
    catName: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier.padding(horizontal = 24.dp, vertical = 4.dp),
    buttonColor: Color = Color(0xFF4CAF50),
    textSize: Int = 16,
) {
    Button(
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(buttonColor),
        shape = RoundedCornerShape(12.dp),
        modifier = modifier

    ) {
        Text(
            text = catName, fontSize = textSize.sp
        )

    }
}

@Composable
fun SignUpOptionButton(
    providerName: String,
    icon: Painter,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
        .padding(vertical = 8.dp, horizontal = 16.dp)
        .fillMaxWidth(),
    backgroundColor: Color = Color.LightGray,

    ) {
    Button(
        onClick = onClick,
        modifier = modifier,
        shape = RoundedCornerShape(12.dp),
        colors = ButtonDefaults.buttonColors(backgroundColor),elevation = ButtonDefaults.buttonElevation(4.dp)
    ) {
        Icon(
            painter = icon,
            contentDescription = "$providerName icon",
            modifier = Modifier.size(24.dp)
        )
        Spacer(modifier = Modifier.width(12.dp))
        Text(text = "Continue with $providerName", fontSize = 16.sp, color = Color.White)
    }

}


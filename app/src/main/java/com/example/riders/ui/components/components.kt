package com.example.riders.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.text.font.FontWeight
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
        colors = ButtonDefaults.buttonColors(backgroundColor),
        elevation = ButtonDefaults.buttonElevation(4.dp)
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

@Composable
fun WhereToSheetContent(
    onSearchClick: () -> Unit = {},
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .padding(16.dp)
    ){
        Text(text = "Where to?",
            fontSize = 20.sp,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.LightGray.copy(alpha = 0.3f), RoundedCornerShape(8.dp))
                .clickable { onSearchClick }
                .padding(horizontal = 16.dp, vertical = 12.dp)
        ){
            Row(
                verticalAlignment = Alignment.CenterVertically
            ){
                Icon(
                    Icons.Filled.Search,
                    contentDescription = "Search Icon",
                    tint = Color.Gray,
                    modifier = Modifier.size(24.dp)
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(
                    text = "Search",
                    color = Color.Gray,
                    fontSize = 16.sp
                )
            }
        }
        Spacer(modifier = Modifier.height(16.dp))
        Text(text = "Recent Places",
            fontWeight = FontWeight.SemiBold,
            modifier = Modifier.padding(bottom = 8.dp)
        )
        Column{
            RecentPlaceItem(placeName = "Home", address = "123 Main St, City")
            RecentPlaceItem(placeName = "Work", address = "456 Park Ave, City")
            RecentPlaceItem(placeName = "School", address = "789 Elm St, City")
        }
    }

}

@Composable
fun RecentPlaceItem(placeName: String, address: String){
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clickable{}
            .padding(vertical = 8.dp)
            .background(Color.White, RoundedCornerShape(8.dp)),
        verticalAlignment = Alignment.CenterVertically

    ){
        Column{
            Text(text = placeName,
                fontSize = 16.sp,
                fontWeight = FontWeight.Medium,
                modifier = Modifier.padding(start = 16.dp)
            )
            Text(text = address,
                fontSize = 14.sp,
                color = Color.Gray,
                modifier = Modifier.padding(start = 16.dp, top = 4.dp)
            )
        }
    }
}


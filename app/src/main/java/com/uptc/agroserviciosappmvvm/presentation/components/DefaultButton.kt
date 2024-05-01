package com.uptc.agroserviciosappmvvm.presentation.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.uptc.agroserviciosappmvvm.presentation.ui.theme.Green400

@Composable
fun DefaultButton (
    modifier: Modifier,
    text: String,
    onClick: () -> Unit,
    color: Color = Green400
){
    Button(
        modifier = modifier,
        onClick = { onClick() },
        //colors = ButtonDefaults.buttonColors(backgroundColor = color)
    ) {
        Text(
            modifier = Modifier
                .padding(bottom = 10.dp)
                .padding(top = 10.dp),
            text = text,
            fontWeight = FontWeight.Bold,
            color = Color.Black,
            fontSize = 18.sp,
        )
    }
}

@Composable
fun DefaultButtonIcon (
    modifier: Modifier,
    text: String,
    onClick: () -> Unit,
    color: Color = Green400,
    icon: ImageVector = Icons.Default.ArrowForward
){
    Button(
        modifier = modifier,
        onClick = { onClick() },
        //colors = ButtonDefaults.buttonColors(backgroundColor = color)
    ) {
        Icon(
            imageVector = icon,
            contentDescription = ""
        )
        Text(
            modifier = Modifier
                .padding(bottom = 10.dp)
                .padding(top = 10.dp),
            text = text,
            fontWeight = FontWeight.Bold,
            color = Color.Black,
            fontSize = 18.sp,
        )
    }
}
package com.example.jetpack_compose_practice.text_basics

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(
    name = "previewScreen", showBackground = true, showSystemUi = true,
    device = "spec:width=411dp,height=891dp,navigation=buttons"
)
@Composable
fun TextFieldExample() {
    // mutable state is used to update the fields
    var name by remember { mutableStateOf("") }
    TextField(
        value = name,
        onValueChange = { name = it },
        // label = { Text(text="Enter Your Name :") }
        placeholder = { Text(text = "Enter Your Name :") },
        leadingIcon = {
            Text(
                text = "Name :", fontSize = 15.sp,
                fontWeight = FontWeight.Bold
            )
        },
        trailingIcon = {Text(text = "#" , fontWeight = FontWeight.Bold
        , fontSize = 10.sp)} ,

        // for only single line input
        singleLine = true ,

    shape = RoundedCornerShape(20.dp) ,

        colors = TextFieldDefaults.colors(
            unfocusedTextColor = Color.Red,
            focusedTextColor = Color.Green ,
            unfocusedContainerColor = Color.Cyan ,
            focusedContainerColor = Color.Yellow ,
            unfocusedIndicatorColor = Color.Black ,
            focusedIndicatorColor = Color.Black ,
            unfocusedLabelColor = Color.Red ,

        )
    )
}





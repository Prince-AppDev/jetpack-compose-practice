package com.example.jetpack_compose_practice.layouts
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(
    name = "previewScreen", showBackground = true, showSystemUi = true,
    device = "spec:width=411dp,height=891dp,navigation=buttons"
)
@Composable
fun ColumnExample2() {
    Column(
        modifier = Modifier.fillMaxSize()
            .safeDrawingPadding(),
        horizontalAlignment = Alignment.CenterHorizontally ,
        verticalArrangement = Arrangement.Center,
    ) {
        Text(
            text = "Login Please", fontSize = 30.sp,

            fontWeight = FontWeight.Bold
        )
        OutlinedTextField(
            value = "",
            onValueChange = { },
            label = { Text(text = "Enter Name :")},
            singleLine = true ,
            shape = RoundedCornerShape(20.dp)
            )

        OutlinedTextField(
            value = "",
            onValueChange = { },
            label = { Text(text = "Enter Email :")} ,
            singleLine = true,
            shape = RoundedCornerShape(20.dp)
            )
        OutlinedTextField(
            value = "",
            onValueChange = { },
            label = { Text(text = "Enter Password :")},
            shape = RoundedCornerShape(20.dp)
        )
       Spacer(modifier = Modifier.weight(2f))
        Text(text = "Continue   ->" , modifier = Modifier.align(Alignment.CenterHorizontally)
            .padding(bottom =500.dp) ,
            fontWeight = FontWeight.SemiBold ,
            fontSize = 20.sp)

    }
}
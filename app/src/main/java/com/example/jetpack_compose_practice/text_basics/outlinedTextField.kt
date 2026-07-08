package com.example.jetpack_compose_practice.text_basics
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(name = "previewScreen" , showBackground = true , showSystemUi = true,
    device = "spec:width=411dp,height=891dp,navigation=buttons"
)
@Composable
fun OutlineField()
{
var name by remember { mutableStateOf("") }
    Column(modifier = Modifier.fillMaxSize().padding(20.dp) ,
        horizontalAlignment = Alignment.CenterHorizontally) {
        OutlinedTextField(
            value = name ,
            onValueChange = {name = it} ,
            label = {Text(text = "Enter Your Name :" , color = Color.Black ,
                fontWeight = FontWeight.Bold) },
            singleLine = true,
            shape = RoundedCornerShape(20.dp) ,
        )
    }
}



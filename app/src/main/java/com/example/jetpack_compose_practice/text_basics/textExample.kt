package com.example.jetpack_compose_practice.text_basics
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Preview(name = "previewScreen" , showBackground = true , showSystemUi = true,
    device = "spec:width=411dp,height=891dp,navigation=buttons"
)
@Composable
fun TextExample()
{
    Text(
        text ="Mission Android 2026" ,
        modifier = Modifier.fillMaxWidth(),
        color = Color.Blue ,
        fontSize = 20.sp,
        fontWeight = FontWeight.Bold,
        fontFamily = FontFamily.Serif,
        letterSpacing = 0.1.sp ,
        textAlign = TextAlign.Center,
        textDecoration = TextDecoration.Underline ,
        lineHeight = 30.sp,
        overflow =  TextOverflow.Clip ,
        softWrap = true,
        maxLines = 2,
    )
}





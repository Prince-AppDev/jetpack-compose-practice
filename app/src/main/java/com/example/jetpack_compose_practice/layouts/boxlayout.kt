package com.example.jetpack_compose_practice.layouts
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Preview(
    name = "previewScreen", showBackground = true, showSystemUi = true,
    device = "spec:width=411dp,height=891dp,navigation=buttons"
)
@Composable
fun BoxLayoutExample() {
    Box(
        modifier = Modifier.fillMaxSize()
            .safeDrawingPadding()
    ) {

        Text(text = "text1", fontSize = 20.sp ,
            modifier = Modifier.align(Alignment.BottomEnd))

        Text(text = "text2", fontSize = 20.sp ,
            modifier = Modifier.align(Alignment.TopEnd))

        Text(text = "text3", fontSize = 20.sp ,
            modifier = Modifier.align(Alignment.CenterStart))
    }
}

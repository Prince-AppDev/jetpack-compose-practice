package com.example.jetpack_compose_practice.images_icons
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpack_compose_practice.R

@Preview(
    name = "previewScreen", showBackground = true, showSystemUi = true,
    device = "spec:width=411dp,height=891dp,navigation=buttons"
)
@Composable
fun ImagesExample()
{
    Image(
       painterResource(R.drawable.anime),
        contentDescription = "Anime image " ,
        modifier = Modifier.safeDrawingPadding()
            .padding(all = 15.dp)
            .clip(shape = RoundedCornerShape(20.dp)) ,
        contentScale = ContentScale.FillWidth


    )
}
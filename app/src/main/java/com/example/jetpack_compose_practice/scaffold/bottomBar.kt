package com.example.jetpack_compose_practice.scaffold

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(
    name = "previewScreen", showBackground = true, showSystemUi = true,
    device = "spec:width=411dp,height=891dp"
)
@Composable
fun AppBottomBar() {

    BottomAppBar(
        containerColor = Color(0xFF15100E),
        contentColor = Color.White

    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = androidx.compose.foundation.layout.Arrangement.SpaceAround,
            verticalAlignment = androidx.compose.ui.Alignment.Bottom
        )
        {
            IconButton(onClick = {}
            )
            {
                Icon(
                    imageVector = Icons.Default.Home,
                    contentDescription = "Home", modifier = Modifier.size(30.dp)
                )
            }
            IconButton(onClick = {}
            )
            {
                Icon(
                    imageVector = Icons.Default.Search,
                    contentDescription = "Search Icon", modifier = Modifier.size(30.dp)
                )
            }
            IconButton(onClick = {}
            )
            {
                Icon(
                    imageVector = Icons.Default.Notifications,
                    contentDescription = "Notifications", modifier = Modifier.size(30.dp)
                )
            }
            IconButton(onClick = {}
            )
            {
                Icon(
                    imageVector = Icons.Default.Person,
                    contentDescription = "Person", modifier = Modifier.size(30.dp)
                )
            }

        }
    }
}

package com.example.jetpack_compose_practice.scaffold

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(
    name = "previewScreen", showBackground = true, showSystemUi = true,
    device = "spec:width=411dp,height=891dp"
)
@Composable
fun MyScreen() {
    Scaffold(
        topBar = { AppTopbar() },
        bottomBar = { AppBottomBar() },
        floatingActionButton = { AppFloatingActionButton() },

    ) {
            innerPadding ->
//        Column(
//            modifier = androidx.compose.ui.Modifier
//                .padding(innerPadding)
//        )
//        {
//            MyScreenContent()
//
//     }
        LazyColumn(
            modifier = Modifier.fillMaxSize()
                .padding(innerPadding),
            verticalArrangement = Arrangement.spacedBy(0.1.dp)
        ) {
            items(count = 2) {
                MyScreenContent()
            }
        }
    }

}
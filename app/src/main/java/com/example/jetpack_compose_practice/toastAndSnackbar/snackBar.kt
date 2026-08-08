package com.example.jetpack_compose_practice.toastAndSnackbar

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarDuration
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.launch

@Preview(
    name = "previewScreen", showBackground = true, showSystemUi = true,
    device = "spec:width=411dp,height=891dp"
)
@Composable
fun SnackBarExample() {
    val snackBarHostState = remember { SnackbarHostState() }

    //  coroutine Scope -> to show snack bar

    val scope = rememberCoroutineScope()
    Scaffold(
        snackbarHost = {SnackbarHost(hostState = snackBarHostState )}
    )
    { innerPadding ->

        Column(
            modifier = Modifier.fillMaxSize().padding(horizontal = 24.dp).safeDrawingPadding().padding(innerPadding),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        )
        {
            Button(
                onClick = { scope.launch { snackBarHostState.showSnackbar("This is a snack bar" ,
                    actionLabel = "Undo" ,
                    duration = SnackbarDuration.Short ,
                    ) }
                },
                modifier = Modifier.fillMaxWidth()
            )
            {
                Text(text = "Show Snack Bar")
            }
        }
    }
}

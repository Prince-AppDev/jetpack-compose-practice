//package com.example.jetpack_compose_practice.stateManagement
//
//import androidx.compose.foundation.layout.Arrangement
//import androidx.compose.foundation.layout.Column
//import androidx.compose.foundation.layout.Row
//import androidx.compose.foundation.layout.Spacer
//import androidx.compose.foundation.layout.fillMaxSize
//import androidx.compose.foundation.layout.height
//import androidx.compose.foundation.layout.padding
//import androidx.compose.foundation.layout.width
//import androidx.compose.material3.Button
//import androidx.compose.material3.Text
//import androidx.compose.runtime.Composable
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.text.font.FontWeight
//import androidx.compose.ui.tooling.preview.Preview
//import androidx.compose.ui.unit.dp
//import androidx.compose.ui.unit.sp
//import com.google.android.material.color.utilities.Score.score
//
//@Preview(
//    name = "previewScreen", showBackground = true, showSystemUi = true,
//    device = "spec:width=411dp,height=891dp"
//)
//@Composable
//fun StateHoistingParent() {
//   CounterChild(
//       score = score,
//       increment = { score++ },
//       decrement = { score-- }
//   )
//}
//            @Composable
//    fun CounterChild(score: Int,
//                     increment :() -> Unit,
//                     decrement :() -> Unit
//    ) {
//        Column(
//            modifier = Modifier.fillMaxSize(),
//            horizontalAlignment = Alignment.CenterHorizontally,
//            verticalArrangement = Arrangement.Center
//        ) {
//            Text(text = "Counter : $score", fontSize = 40.sp, fontWeight = FontWeight.Bold)
//            Spacer(Modifier.height(20.dp))
//            Row(
//                modifier = Modifier.padding(16.dp)
//            ) {
//                Button(onClick = { increment() }) {
//                    Text(text = "Increment", fontSize = 20.sp, fontWeight = FontWeight.Bold)
//                }
//                Spacer(Modifier.width(35.dp))
//
//                Button(
//                    onClick = { decrement()},
//                    enabled = score > 0
//                ) {
//                    Text(text = "Decrement", fontSize = 20.sp, fontWeight = FontWeight.Bold)
//
//                }
//            }
//        }
//    }

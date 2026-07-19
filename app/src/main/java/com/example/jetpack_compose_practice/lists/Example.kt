package com.example.jetpack_compose_practice.lists

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(
    name = "previewScreen", showBackground = true, showSystemUi = true,
    device = "spec:width=411dp,height=891dp"
)
@Composable
fun NestedLazyList() {
    LazyColumn(
        modifier = Modifier
            .padding(16.dp)
            .safeDrawingPadding(),
        verticalArrangement = Arrangement.spacedBy(8.dp)

    ) {

        items(count = 10) { columnIndex ->
            Text(
                text = "row $columnIndex",
                fontWeight = FontWeight.SemiBold,
                fontSize = 20.sp,
                color = Color.White,
                modifier = Modifier
                    .background(
                        color = Color.Black,
                        shape = RoundedCornerShape(8.dp)
                    )
                    .padding(14.dp)
            )
            Spacer(modifier = Modifier.height(8.dp))
            LazyRow(
                horizontalArrangement = Arrangement.spacedBy(8.dp)

            ) {
                items(count = 10) { rowIndex ->
                    Box(
                        Modifier
                            .size(90.dp)
                            .background(
                                color = Color.LightGray,
                                shape = RoundedCornerShape(16.dp)
                            )
                            .padding(14.dp),
                        contentAlignment = androidx.compose.ui.Alignment.Center

                    ) {
                        Text(
                            text = "block $rowIndex",
                        )
                    }
                }
            }
        }
    }
}
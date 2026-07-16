package com.example.jetpack_compose_practice.alertdialogs

import android.widget.Toast
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(
    name = "previewScreen", showBackground = true, showSystemUi = true,
    device = "spec:width=411dp,height=891dp"
)
@Composable
fun AlertDialogExample() {
    var openDialog by remember { mutableStateOf(false) }
    val context = LocalContext.current
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .height(70.dp)
                .width(70.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color.White
            ),
            elevation = CardDefaults.cardElevation(
                defaultElevation = 8.dp
            ),
            border = BorderStroke(width = 1.dp, color = Color.Blue),
            shape = RoundedCornerShape(16.dp)
        )
        {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(all = 16.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(text = "Alert Example", fontSize = 20.sp)

                IconButton(
                    onClick = { openDialog = true },
                    colors = IconButtonDefaults.iconButtonColors(
                        containerColor = Color.DarkGray,
                        contentColor = Color.LightGray
                    )
                ) {
                    Icon(
                        imageVector = Icons.Default.Delete,
                        contentDescription = "delete items "
                    )
                }
            }
        }
        if(openDialog)
            AlertDialog(
                onDismissRequest = {openDialog=false },

//                icon = {Icon(imageVector = Icons.Default.Delete ,
//                    contentDescription = "Delete")},
                title ={Text(text="Delete Items ") },
                text = {Text(text="are you sure you want to delete this.")},



                confirmButton = {
                    Button(
                        onClick = { Toast.makeText(context,"Deleted Successfully",Toast.LENGTH_SHORT)
                            .show()}
                        , colors = ButtonDefaults.buttonColors(
                            containerColor = Color.DarkGray
                    ) ){
                        Text(text = "Delete")
                    }
                },
                dismissButton = {
                    Button(
                        onClick = {openDialog=false},colors = ButtonDefaults.buttonColors(
                            containerColor = Color.Gray
                        )
                    ) {
                        Text(text = "Cancel")
                    }
                } ,
                containerColor = Color.White ,
                titleContentColor = Color.Black,
                shape = RoundedCornerShape(20.dp)
            )
        }
    }



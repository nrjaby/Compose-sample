package com.example.compose_sample.basic_component.level3

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties


@Preview
@Composable
fun alertDialogSample() {

    var showDialog by remember { mutableStateOf(false) }

    if (showDialog) {
        showAlertDialogSample(showDialog = showDialog, onDismiss = { showDialog = false })
    }

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(onClick = {
            showDialog = true
        }) {
            Text(
                text = "Show Dialog",
                fontSize = 16.sp,
            )
        }
    }

}

@Composable
fun showAlertDialogSample(
    showDialog: Boolean, onDismiss: () -> Unit
) {
    if (showDialog) {
        AlertDialog(

            onDismissRequest = onDismiss,

            title = { Text(text = "Alert Title", style = MaterialTheme.typography.body2) },

            text = { Text(text = "Alert you sure") },

            confirmButton = {
                TextButton(onClick = onDismiss) {
                    Text(text = "Yes")
                }
            },

            dismissButton = {
                TextButton(onClick = onDismiss) {
                    Text(text = "No")
                }
            })
    }
}

@Composable
fun Loading(state: Boolean) {
    if (state) {
        Dialog(
            onDismissRequest = {},
            DialogProperties(dismissOnBackPress = false, dismissOnClickOutside = false)
        ) {
            Box(
                modifier = Modifier
                    .size(100.dp)
                    .background(Color.White, shape = RoundedCornerShape(8.dp)),
                contentAlignment = Alignment.Center,
            ) {
                CircularProgressIndicator()
            }
        }
    }
}
package com.example.compose_sample.basic_component

import android.widget.Toast
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp


@Composable
fun showButtonSample( ){
    val mContext = LocalContext.current
    Column(
        modifier = Modifier
            .padding(20.dp)
            .fillMaxWidth()
    ) {
        Button(onClick = {
            Toast.makeText(mContext, "you clicked sample button", Toast.LENGTH_SHORT).show()
        }) {
            Text(text = "Button Text")
        }

        Spacer(modifier = Modifier.height(20.dp))
        OutlinedButton(onClick = {
            Toast.makeText(mContext, "clicked on outline button", Toast.LENGTH_SHORT).show()
        }) {
            Text(text = "Outline button text")

        }
    }
}
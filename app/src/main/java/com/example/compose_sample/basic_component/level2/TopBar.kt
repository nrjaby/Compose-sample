package com.example.compose_sample.basic_component.level2

import android.widget.Toast
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview

@Preview
@Composable
fun TopAppBarWithBackArrow() {

    val mContext = LocalContext.current
    TopAppBar(title = { Text(text = "Toolbar Title") }, navigationIcon = {
        IconButton(onClick = {
            Toast.makeText(
                mContext, "Move to previous screen", Toast.LENGTH_SHORT
            ).show()
        }) {
            Icon(
                Icons.Filled.ArrowBack, contentDescription = null, tint = Color.White
            )
        }
    })
}
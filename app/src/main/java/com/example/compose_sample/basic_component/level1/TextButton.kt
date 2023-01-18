package com.example.compose_sample.basic_component.level1

import android.widget.Toast
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp

@Composable
fun ShowTextButtonSample(modifier: Modifier = Modifier) {
    val mContext = LocalContext.current
    TextButton(
        modifier = modifier
            .padding(20.dp)
            .fillMaxWidth()
            .wrapContentHeight(),
        onClick = { Toast.makeText(mContext, "You clicked TextButton",Toast.LENGTH_SHORT).show() }) {
        Text("I'm a Text Button")
    }
}
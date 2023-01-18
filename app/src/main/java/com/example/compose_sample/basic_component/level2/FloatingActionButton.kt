package com.example.compose_sample.basic_component.level2

import android.widget.Toast
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import com.example.compose_sample.basic_component.level1.surfaceSample

@Preview
@Composable
fun showFloatingButtonSample() {

    val mContext = LocalContext.current
    Scaffold(content = {
        surfaceSample()
    }, floatingActionButton = {
        FloatingActionButton(onClick = {
            Toast.makeText(
                mContext, "Fab clicked", Toast.LENGTH_SHORT
            ).show()
        }) {


            Text(text = "Add")


        }
    })
}
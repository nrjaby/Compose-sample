package com.example.compose_sample.basic_component.level1

import android.widget.Toast
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun ShowScaffoldSample() {
    Surface(modifier = Modifier.padding(20.dp)) {
        val mContext = LocalContext.current

        Scaffold(topBar = {
            TopAppBar(
                title = { Text(text = "App Toolbar") },
            )
        }, content = {
            Surface(color = Color.DarkGray, modifier = Modifier.fillMaxSize()) {}
        },

            floatingActionButton = {
                FloatingActionButton(onClick = {
                    Toast.makeText(
                        mContext, "floating button clicked", Toast.LENGTH_SHORT
                    ).show()
                }) {
                    Icon(
                        painter = painterResource(id = com.example.compose_sample.R.drawable.capture),
                        contentDescription = null
                    )
                }
            })
    }
}
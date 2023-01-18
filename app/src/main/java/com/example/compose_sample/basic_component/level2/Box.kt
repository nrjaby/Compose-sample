package com.example.compose_sample.basic_component.level2

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.material.Icon
import androidx.compose.material.Surface
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun showBoxCompose() {
    Box(modifier = Modifier.size(200.dp)) {

        Surface(
            modifier = Modifier
                .size(50.dp)
                .align(alignment = Alignment.Center), color = Color.Black
        ) {

        }

        Icon(
            imageVector = Icons.Filled.CheckCircle,
            contentDescription = null,
            tint = Color.Yellow,
            modifier = Modifier
                .align(alignment = Alignment.Center)
                .size(50.dp)
        )
    }
}
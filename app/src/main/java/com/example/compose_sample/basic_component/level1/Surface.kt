package com.example.compose_sample.basic_component.level1

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun surfaceSample( ){

    Surface(
        modifier = Modifier,
        elevation = 8.dp,
        shape = RoundedCornerShape(10.dp),
        border = BorderStroke(2.dp, Color.White),
        color = Color.DarkGray
    ) {

    }

}
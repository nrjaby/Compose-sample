package com.example.compose_sample.basic_component.level2

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun showCardSample() {
    Card(
        elevation = 5.dp, modifier = Modifier
            .padding(5.dp)
            .wrapContentHeight()
    ) {

        Text(text = "text inside the card", Modifier.padding(5.dp))
    }

}
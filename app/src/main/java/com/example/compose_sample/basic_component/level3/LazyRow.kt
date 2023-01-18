package com.example.compose_sample.basic_component.level3

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun ShowLazyRowSample() {
    val list = (1..50).map { it.toString() }
    Column(Modifier.padding(20.dp)) {
        LazyRow {
            items(list) { item ->
                SampleLazyRowItem(item)
            }
        }
    }
}

@Composable
fun SampleLazyRowItem(item: String) {
    Card(
        elevation = 5.dp, modifier = Modifier
            .padding(5.dp)
            .wrapContentWidth()
            .wrapContentHeight()
    ) {
        Text("List Item #$item", modifier = Modifier.padding(10.dp), maxLines = 1)
    }
}
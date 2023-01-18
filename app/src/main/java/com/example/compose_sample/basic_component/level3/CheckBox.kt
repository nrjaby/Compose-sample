package com.example.compose_sample.basic_component.level3

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Checkbox
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview


@Preview
@Composable
fun ShowCheckBoxSample() {

    val cricketState = remember { mutableStateOf(false) }
    val hockeyState = remember { mutableStateOf(false) }
    val footballState = remember { mutableStateOf(false) }

    Column(verticalArrangement = Arrangement.Center) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .clickable { cricketState.value = !cricketState.value }) {
            Checkbox(
                checked = cricketState.value,
                onCheckedChange = { cricketState.value = it },
            )
            Text("Cricket")
        }
        Row(verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .clickable { hockeyState.value = !hockeyState.value }) {
            Checkbox(
                checked = hockeyState.value,
                onCheckedChange = { hockeyState.value = it },
            )
            Text("Hockey")
        }
        Row(verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .clickable { footballState.value = !footballState.value }) {
            Checkbox(
                checked = footballState.value,
                onCheckedChange = { footballState.value = it },
            )
            Text("Football")
        }

    }
}
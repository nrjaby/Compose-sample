package com.example.compose_sample.basic_component.level5

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ShowRememberSavableSample(modifier: Modifier = Modifier) {

    var revenue by rememberSaveable { mutableStateOf(0) }

    Column {

        Button(onClick = { revenue += 1000 }) {
            Text("Increase Revenue")
        }
        Spacer(modifier.height(20.dp))
        Text("Current Revenue = Rs.$revenue")

    }

}
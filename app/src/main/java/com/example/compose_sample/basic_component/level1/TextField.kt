package com.example.compose_sample.basic_component.level1

import androidx.compose.foundation.layout.*
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun showSampleTextFiled() {

    var basicTextField by remember { mutableStateOf("") }
    var outlineTextField by remember { mutableStateOf("") }

    Column(modifier = Modifier
            .padding(20.dp)
            .fillMaxSize(), verticalArrangement = Arrangement.Top) {
        TextField(
            value = basicTextField,
            onValueChange = { basicTextField = it },
            label = { Text(text = "Basic Sample") },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(20.dp))

        OutlinedTextField(
            value = basicTextField,
            onValueChange = { outlineTextField = it },
            label = { Text(text = "Password") },
            modifier = Modifier.fillMaxWidth()
        )

    }



}
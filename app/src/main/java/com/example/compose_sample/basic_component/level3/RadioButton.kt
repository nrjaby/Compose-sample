package com.example.compose_sample.basic_component.level3

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.selection.selectable
import androidx.compose.material.RadioButton
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun ShowRadioButtonSample() {

    val genderRadioOptions = listOf("Male", "Female", "Transgender")

    val (selectedOption, onOptionSelected) = remember { mutableStateOf(genderRadioOptions[1]) }

    Column(verticalArrangement = Arrangement.Center) {
        genderRadioOptions.forEach { text ->
            Row(
                Modifier
                    .fillMaxWidth()


                    .selectable(
                        selected = (text == selectedOption),
                        onClick = {
                            onOptionSelected(text)
                        }
                    )


                    .padding(horizontal = 16.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                RadioButton(
                    selected = (text == selectedOption),
                    onClick = { onOptionSelected(text) }
                )
                Text(
                    text = text,
                    modifier = Modifier.padding(start = 16.dp)
                )
            }
        }
    }
}
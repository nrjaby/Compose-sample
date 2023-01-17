package com.example.compose_sample.basic_component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.compose_sample.R


@Preview
@Composable
fun showSampleImage( ) {

    val image = painterResource(id = R.drawable.capture)
    Column(
        modifier = Modifier
            .padding(20.dp)
            .fillMaxSize()
            //.wrapContentSize(Alignment.Center),
    ) {
      Image(painter = image,
          contentDescription = null,
          contentScale = ContentScale.Crop
          )
    }
}
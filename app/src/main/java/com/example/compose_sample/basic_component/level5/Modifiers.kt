package com.example.compose_sample.basic_component.level5

import android.widget.Toast
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Icon
import androidx.compose.material.Surface
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun ShowScrollableSample(modifier: Modifier = Modifier) {

    Column(modifier.verticalScroll(rememberScrollState())) {

    }
}

@Composable
fun ShowClickableSample(modifier: Modifier = Modifier) {
    val mContext = LocalContext.current
    Row(modifier.clickable {
        Toast.makeText(mContext, "modifier clicked", Toast.LENGTH_SHORT).show()
    }) {


    }
}

@Composable
fun ShowPaddingSample(modifier: Modifier = Modifier) {

    Box(modifier.padding(all = 20.dp)) {


    }
    Box(modifier.padding(start = 10.dp, top = 10.dp, end = 10.dp, bottom = 10.dp)) {


    }
    Box(modifier.padding(horizontal = 10.dp, vertical = 10.dp)) {


    }
}

@Composable
fun ShowFillOrWrapSample(modifier: Modifier = Modifier) {

    Surface(
        modifier
            .fillMaxWidth()
            .fillMaxHeight()
    ) {
        Column(
            modifier
                .wrapContentWidth()
                .wrapContentHeight()
        ) {

        }
    }
}

@Composable
fun ShowHeightWidthSizeSample(modifier: Modifier = Modifier) {
    Box(
        modifier
            .height(100.dp)
            .width(200.dp)
    ) {
        Icon(
            Icons.Filled.AddCircle, contentDescription = "sample icon", modifier.size(100.dp)
        )
    }
}
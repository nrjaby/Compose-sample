package com.example.compose_sample.basic_component

import android.widget.Toast
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun showSampleIcon(){

    val mContext = LocalContext.current

    Column(Modifier.padding(20.dp)) {

        Spacer(modifier = Modifier.height(20.dp))
        Text(text = "Normal Icon")
        Icon(imageVector = Icons.Filled.Face, contentDescription = null)


        Spacer(modifier = Modifier.height(30.dp))
        Text(text = "Icon with click Actions")
        IconButton(onClick = {
            Toast.makeText(mContext, "Button Icon click", Toast.LENGTH_SHORT).show()},
            modifier = Modifier.wrapContentSize()
        ){
            Icon(imageVector = Icons.Filled.Refresh,
                contentDescription = null,
            tint = Color.Black,
            modifier = Modifier.size(100.dp))
        }

    }
}
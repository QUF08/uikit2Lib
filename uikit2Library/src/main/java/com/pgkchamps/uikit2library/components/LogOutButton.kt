package com.pgkchamps.uikit2library.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.pgkchamps.uikit2library.ui.UikitTheme
import com.pgkchamps.uikitlib.R

@Composable
fun LogOutButton (
    onClick: () -> Unit,
    text: String,
    modifier: Modifier = Modifier.height(24.dp)
) {


    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier.clickable {
            onClick()
        }) {
        Icon(
           painter = painterResource(R.drawable.logout_icon),
            contentDescription = "",
            tint = Color(0xFFFA5075),
        )
        Spacer(Modifier.width(18.dp))
        Text (
            text,
            style = MaterialTheme.typography.headlineMedium
        )
    }
}


@Preview
@Composable
private fun LogOutPrev() {
    UikitTheme {
        Column(
            Modifier
                .fillMaxSize()
                .padding(horizontal = 16.dp),
            Arrangement.Center,
            Alignment.CenterHorizontally
        ) {

            var someText by remember { mutableStateOf("Bye") }

            Text(
                someText
            )

            LogOutButton({
                someText = "Hello"
            }, "Logout")
        }

    }
}




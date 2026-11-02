package com.pgkchamps.uikit2library.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.AbsoluteRoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.pgkchamps.uikit2library.ui.UikitTheme
import com.pgkchamps.uikit2library.ui.gradientPrimary
import kotlinx.coroutines.delay

@Composable
fun TimerButton() {

    Button(
        onClick = {},
        modifier = Modifier
            .width(295.dp)
            .height(100.dp)
            .background(gradientPrimary, AbsoluteRoundedCornerShape(16.dp)),
        shape = AbsoluteRoundedCornerShape(10.dp),
        colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent)
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text("Timer", color = Color.White)
            Spacer(Modifier.height(14.dp))
        }
    }
}
@Preview
@Composable
private fun PrevButton() {
    UikitTheme {

        Column(Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.spacedBy(
                34.dp,
                Alignment.CenterVertically
            ),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            CombatButton(
                "Deaf Bounce",
                {

                }
            )
        }

    }
}
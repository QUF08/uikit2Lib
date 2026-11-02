package com.pgkchamps.uikit2library.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.AbsoluteRoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.pgkchamps.uikit2library.ui.UikitTheme
import com.pgkchamps.uikit2library.ui.gradientPrimary

@Composable
fun CombatButton (
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Button(
        onClick,
        modifier.height(58.dp).width(210.dp).background(
            gradientPrimary,
            AbsoluteRoundedCornerShape(100.dp)
        ),
        shape = AbsoluteRoundedCornerShape(100.dp),
        colors = ButtonDefaults.buttonColors(
            contentColor = Color.White,
            containerColor = Color.Transparent
        )
    ) {
        Text(
            text
        )
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
                "Let`s Combat!", {})
        }

    }
}
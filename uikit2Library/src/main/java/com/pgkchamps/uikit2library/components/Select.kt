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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.pgkchamps.uikit2library.ui.UikitTheme
import com.pgkchamps.uikitlib.R

@Composable
fun Select (
    onClick: () -> Unit,
    textFirst: String,
    textSecond: String,
    modifier: Modifier = Modifier
) {
    Column(modifier = modifier) {
        // 1. Верхний лейбл "FROM"
        Text(
            text = textFirst,
            color = Color(0xFFFA5075),
            style = MaterialTheme.typography.titleSmall
        )

        // Отступ между "FROM" и датой
        Spacer(modifier = Modifier.height(10.dp))

        // 2. Строка с датой и стрелочкой
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = textSecond,
                style = MaterialTheme.typography.titleLarge
            )

            // Отступ между датой и стрелочкой
            Spacer(modifier = Modifier.width(16.dp))

            // 3. Стрелочка с кликом "без действия"
            Icon(
                painter = painterResource(id = R.drawable.dropdown),
                contentDescription = "",
                tint = Color.Unspecified,
                modifier = Modifier.clickable {
                    onClick ()
                }
            )
        }
    }
}

@Preview (showBackground = true)
@Composable
private fun SelectPrev() {
    UikitTheme {
        Column(
            Modifier
                .fillMaxSize(),
            Arrangement.Center,
            Alignment.CenterHorizontally
        ) {
            Select(
                onClick = {},
                "FROM",
                "MON, NOV 4,2019"
            )
        }
    }
}
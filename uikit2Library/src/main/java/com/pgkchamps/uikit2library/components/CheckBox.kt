package com.pgkchamps.uikit2library.components

import android.R.attr.tint
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.pgkchamps.uikit2library.ui.UikitTheme
/*import androidx.core.R*/
import com.pgkchamps.uikit2library.ui.gradientPrimary
import com.pgkchamps.uikitlib.R


@Composable
fun CheckBox (
    checked: Boolean,
    onCheck: (Boolean) -> Unit,
    modifier: Modifier = Modifier
) {
 Box(
     modifier
         .size(14.dp)
         .clip(RoundedCornerShape(1.dp))
         .border(BorderStroke( 1.dp, gradientPrimary))
         .clickable {onCheck(!checked) },
     contentAlignment = Alignment.Center
 ){
     if (checked) {
         Icon(
             painterResource(R.drawable.checkmark),
             contentDescription = "",
             tint = Color.Unspecified
         )
     }
 }
}

@Preview
@Composable
private fun Check() {
    UikitTheme {
        Column(
            Modifier
                .fillMaxSize()
                .padding(horizontal = 16.dp),
            Arrangement.Center,
            Alignment.CenterHorizontally
                ){
            var checked by remember { mutableStateOf(false) }
            CheckBox(checked, {checked=it})
        }
    }
}
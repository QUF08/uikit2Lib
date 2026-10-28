package com.pgkchamps.uikit2library.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.AbsoluteRoundedCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.pgkchamps.uikit2library.ui.UikitTheme
import com.pgkchamps.uikit2library.ui.gradientPrimary
import com.pgkchamps.uikitlib.R

@Composable
fun Cart(
    name: String,
    dis: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
        .height(169.dp).width(315.dp),
    image: Int,
) {
    Card(
        modifier = modifier
            .clip(RoundedCornerShape(10.dp))
            .background(
                gradientPrimary,
                AbsoluteRoundedCornerShape(10.dp)
            ),
        shape = AbsoluteRoundedCornerShape(10.dp),
        colors = CardDefaults.cardColors(containerColor = Color.Transparent)
    ){
        Box (Modifier.fillMaxSize()) {
            Column(
                Modifier
                    .padding(top = 30.dp, start = 24.dp, bottom = 22.dp)
                    .fillMaxSize(0.55f)
            ) {
                Text(
                    name,
                    style = MaterialTheme.typography.headlineLarge,
                    color = Color.White
                )
                Spacer(Modifier.height(14.dp))
                Text(
                    dis,
                    style = MaterialTheme.typography.bodyLarge,
                    color = Color.White
                )
            }
            Icon(
                painter = painterResource(id = R.drawable.right),
                contentDescription = null,
                tint = Color.White,
                modifier = Modifier
                    .align(Alignment.BottomStart)
                    .padding(start = 24.dp, bottom = 23.67.dp) // отступы как у текста
            )
            Image(
                painter =  painterResource(id = image),
                contentDescription = "",
                contentScale = ContentScale.Fit,
                modifier = Modifier
                    .align(Alignment.BottomEnd)
                    .padding(bottom = 22.dp, end = 19.dp)
                    .size(width = 112.dp, height = 107.dp)
            )
        }
    }

}

@Preview
@Composable
private fun CardPrev() {
    UikitTheme {
        Column(
            Modifier
                .fillMaxSize()
                .padding(horizontal = 16.dp),
            Arrangement.Center,
            Alignment.CenterHorizontally
        ){
            Cart(
                "Schedule",
                "Easily schedule event/games then find like minded players for battle. You up for it?",
                {},
                image = R.drawable.image,
            )
        }
    }
}
package com.pgkchamps.uikit2library.ui

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.pgkchamps.uikitlib.R

val PoppinsFontFamily = FontFamily(
    listOf(
        Font(R.font.pb, FontWeight.Bold),
        Font(R.font.peb, FontWeight.ExtraBold),
        Font(R.font.pm, FontWeight.Medium),
        Font(R.font.pr, FontWeight.W400),
        Font(R.font.psb, FontWeight.SemiBold)
    )
)


// Set of Material typography styles to start with
val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = PoppinsFontFamily,
        fontWeight = FontWeight.W400,
        fontSize = 10.sp,
        lineHeight = 1.em,
        letterSpacing = (-0.3).sp
    ),
    labelSmall = TextStyle(
        fontFamily = PoppinsFontFamily,
        fontWeight = FontWeight.W700,
        fontSize = 14.sp,
        lineHeight = 1.em,
        letterSpacing = 0.sp
    ),
    headlineLarge = TextStyle(
        fontFamily = PoppinsFontFamily,
        fontWeight = FontWeight.W700,
        fontSize = 12.sp,
        lineHeight = 1.em,
        letterSpacing =  (-0.3).sp
    ),
    headlineMedium = TextStyle(
        fontFamily = PoppinsFontFamily,
        fontWeight = FontWeight.W400,
        fontSize = 16.sp,
        lineHeight = 1.em,
        letterSpacing = (-0.3).sp
),
    titleSmall = TextStyle(
        fontFamily = PoppinsFontFamily,
        fontWeight = FontWeight.W400,
        fontSize = 8.sp,
        lineHeight = 1.em,
        letterSpacing = 0.sp
),
    titleLarge = TextStyle(
        fontFamily =  PoppinsFontFamily,
        fontWeight = FontWeight.W400,
        fontSize = 12.sp,
        lineHeight = 1.em,
        letterSpacing = 0.sp

    )
)
package com.pgkchamps.uikit2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.pgkchamps.uikit2.ui.theme.Uikit2Theme
import com.pgkchamps.uikit2library.components.Cart
import com.pgkchamps.uikit2library.components.CheckBox
import com.pgkchamps.uikit2library.components.CombatButton
import com.pgkchamps.uikit2library.components.LogOutButton
import com.pgkchamps.uikit2library.components.Nav
import com.pgkchamps.uikit2library.components.NavItems
import com.pgkchamps.uikit2library.components.OurInput
import com.pgkchamps.uikit2library.components.Points
import com.pgkchamps.uikit2library.components.Select
import com.pgkchamps.uikitlib.R

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Uikit2Theme {
                MyAppScreen()
            }
        }
    }
}

@Composable // Верстка
fun MyAppScreen () {
    Scaffold(
        containerColor = androidx.compose.ui.graphics.Color.White,
        modifier = Modifier.fillMaxSize()) { innerPadding ->

    //  Состояния экрана  "Stateful Composable"
    var checked by remember { mutableStateOf(false) }
    var valueTextFiled by remember { mutableStateOf("Full Name") }
    var nowNav by remember { mutableStateOf(NavItems.Schedule) }
    var someText by remember { mutableStateOf("Bye") }

    LazyColumn() {
        item {
            Column(   // Расположение элементов на экране в колонку
                modifier = Modifier
                    .padding(innerPadding)
                    .fillMaxWidth()
                    .padding(16.dp),
                verticalArrangement = Arrangement.spacedBy(24.dp),
                horizontalAlignment = Alignment.CenterHorizontally

            ) { //            Компоненты
                CombatButton(
                    "Let`s Combat!", {}
                )

                Cart(
                    "Schedule",
                    "Easily schedule event/games then find like minded players for battle. You up for it?",
                    {},
                    image = R.drawable.image,
                )

                CheckBox(checked, {checked=it})

                OurInput(
                    valueTextFiled,
                    {
                        valueTextFiled = it
                    },
                )


                Text(
                    someText
                )

                LogOutButton({
                    someText = "Hello" },
                    "Logout")


                Nav(
                    nav = nowNav,
                    { fromNav ->
                        nowNav = fromNav
                    }
                )
                Points(0)
                Points(1)
                Points(2)

                Select(
                    onClick = {},
                    "FROM",
                    "MON, NOV 4,2019",
                    modifier = Modifier
                )
            }
        }
    }
}
}
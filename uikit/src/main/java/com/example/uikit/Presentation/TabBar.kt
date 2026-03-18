package com.example.uikit.Presentation

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Canvas
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.uikit.R

//нижняя навигация
@Composable
fun TabBar(
    currentScreenNumber: Int,
    modifier: Modifier = Modifier,
    onFirstIconCLick: () -> Unit,
    onSecondIconCLick: () -> Unit,
    onThirdIconCLick: () -> Unit,
    onFourthIconCLick: () -> Unit
) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .padding(bottom = 29.dp)
    ) {
        Canvas(
            modifier = Modifier
                .fillMaxWidth()
                .height(1.dp)
        ){
            drawLine(
                start = Offset(0f, 0f),
                end = Offset(size.width, 0f),
                color = Color(0xFFA0A0A0).copy(alpha = 0.3f)
            )
        }
        Row(modifier = Modifier
            .padding(top = 8.dp)
            .padding(horizontal = 8.dp)
            .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween) {
            val items = listOf(
                TabBarItems(
                    icon = R.drawable.home_icon,
                    title = "Главная",
                    number = 1,
                    onCLick = onFirstIconCLick
                ),
                TabBarItems(
                    icon = R.drawable.results_icon,
                    title = "Каталог",
                    number = 2,
                    onCLick = onSecondIconCLick
                ),
                TabBarItems(
                    icon = R.drawable.projects_icon,
                    title = "Проекты",
                    number = 3,
                    onCLick = onThirdIconCLick
                ),
                TabBarItems(
                    icon = R.drawable.profile_icon,
                    title = "Профиль",
                    number = 4,
                    onCLick = onFourthIconCLick
                )
            )
            items.forEach {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .clickable{
                            it.onCLick()
                        }
                ) {
                    Icon(painter = painterResource(it.icon),
                        contentDescription = null,
                        tint = if(currentScreenNumber == it.number){
                            Accent
                        } else{
                            InputIcon
                        })
                    Text(text = it.title,
                        style = Theme.typography.caption2Regular,
                        color = if(currentScreenNumber == it.number){
                            Accent
                        } else{
                            InputIcon
                        })
                }
            }
        }
    }
}

data class TabBarItems(
    val icon: Int,
    val title: String,
    val number: Int,
    val onCLick: () -> Unit
)
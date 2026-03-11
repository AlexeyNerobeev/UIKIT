package com.example.uikit.Presentation.Buttons

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.uikit.Presentation.Black
import com.example.uikit.Presentation.Placeholder
import com.example.uikit.Presentation.Theme
import com.example.uikit.R

//кнопка меню
@Composable
fun MenuButton(
    modifier: Modifier = Modifier,
    icon: Int,
    title: String,
    description: String,
    onCLick: () -> Unit
) {
    Row(modifier = modifier
        .fillMaxWidth()
        .clickable{
            onCLick()
        },
        verticalAlignment = Alignment.CenterVertically) {
        Icon(painter = painterResource(icon),
            contentDescription = null,
            tint = Color.Unspecified)
        Column(
            modifier = Modifier
                .padding(start = 17.dp)
        ) {
            Text(text = title,
                style = Theme.typography.title3Semibold,
                color = Black
            )
            Text(text = description,
                style = Theme.typography.captionRegular,
                color = Placeholder,
                modifier = Modifier
                    .padding(top = 8.dp)
            )
        }
    }
}
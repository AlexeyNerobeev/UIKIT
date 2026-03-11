package com.example.uikit.Presentation.Buttons.LogIn

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.uikit.Presentation.Black
import com.example.uikit.Presentation.InputStroke
import com.example.uikit.Presentation.Theme
import com.example.uikit.Presentation.White
import com.example.uikit.R

//кнопка авторизации с яндекс
@Composable
fun YandexButton(
    modifier: Modifier = Modifier,
    onCLick: () -> Unit
) {
    Button(
        onClick = onCLick,
        modifier = modifier
            .fillMaxWidth()
            .height(56.dp)
            .clip(
                shape = RoundedCornerShape(10.dp)
            )
            .background(color = White,
                shape = RoundedCornerShape(10.dp)
            )
            .border(1.dp,
                color = InputStroke,
                shape = RoundedCornerShape(10.dp)),
        colors = ButtonDefaults.buttonColors(
            containerColor = White
        )
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Icon(painter = painterResource(R.drawable.yandex_icon),
                contentDescription = null,
                tint = Color.Unspecified)
            Text(
                text = "Войти с Yandex",
                style = Theme.typography.title3Medium,
                color = Black,
                modifier = Modifier
                    .padding(start = 16.dp)
            )
        }
    }
}
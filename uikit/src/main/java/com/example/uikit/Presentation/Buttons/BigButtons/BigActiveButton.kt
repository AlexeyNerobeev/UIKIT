package com.example.uikit.Presentation.Buttons.BigButtons

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import com.example.uikit.Presentation.Accent
import com.example.uikit.Presentation.Theme
import com.example.uikit.Presentation.White

//большая активная кнопка
@Composable
fun BigActiveButton(
    onCLick: () -> Unit,
    text: String,
    modifier: Modifier = Modifier
) {
    Button(
        onClick = onCLick,
        modifier = modifier
            .fillMaxWidth()
            .height(56.dp)
            .clip(
                shape = RoundedCornerShape(10.dp)
            )
            .background(color = Accent,
                shape = RoundedCornerShape(10.dp)
            ),
        colors = ButtonDefaults.buttonColors(
            containerColor = Accent
        )
    ) {
        Text(text = text,
            style = Theme.typography.title3Semibold,
            color = White
        )
    }
}
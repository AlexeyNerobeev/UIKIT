package com.example.uikit.Presentation.Buttons.Chips

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.ripple
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import com.example.uikit.Presentation.Accent
import com.example.uikit.Presentation.Black
import com.example.uikit.Presentation.Theme
import com.example.uikit.Presentation.White

//активная chip кнопка
@Composable
fun ChipActiveButton(
    onCLick: () -> Unit,
    text: String,
    modifier: Modifier = Modifier
) {
    Button(
        onClick = onCLick,
        modifier = modifier
            .widthIn(126.dp)
            .height(48.dp)
            .clip(
                shape = RoundedCornerShape(10.dp)
            )
            .background(color = Accent,
                shape = RoundedCornerShape(10.dp)
            ),
        colors = ButtonDefaults.buttonColors(
            containerColor = Accent
        ),
        contentPadding = PaddingValues(horizontal = 20.dp)
    ) {
        Text(text = text,
            style = Theme.typography.title3Semibold,
            color = White
        )
    }
}
package com.example.uikit.Presentation.Buttons.Small

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.size
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

//маленькая кнопка с обводкой
@Composable
fun SmallBorderButton(
    onCLick: () -> Unit,
    text: String,
    modifier: Modifier = Modifier
) {
    Button(
        onClick = onCLick,
        modifier = modifier
            .size(96.dp, 40.dp)
            .clip(
                shape = RoundedCornerShape(10.dp)
            )
            .background(color = White,
                shape = RoundedCornerShape(10.dp)
            )
            .border(1.dp, color = Accent,
                shape = RoundedCornerShape(10.dp)),
        colors = ButtonDefaults.buttonColors(
            containerColor = White
        )
    ) {
        Text(text = text,
            style = Theme.typography.captionSemibold,
            color = Accent
        )
    }
}
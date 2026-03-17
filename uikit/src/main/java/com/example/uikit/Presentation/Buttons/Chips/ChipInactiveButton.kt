package com.example.uikit.Presentation.Buttons.Chips

import android.R
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import com.example.uikit.Presentation.Accent
import com.example.uikit.Presentation.Description
import com.example.uikit.Presentation.InputBG
import com.example.uikit.Presentation.Theme
import com.example.uikit.Presentation.White

//неактивная chip кнопка
@Composable
fun ChipInactiveButton(
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
            .background(color = InputBG,
                shape = RoundedCornerShape(10.dp)
            ),
        colors = ButtonDefaults.buttonColors(
            containerColor = InputBG
        ),
        contentPadding = PaddingValues(horizontal = 20.dp)
    ) {
        Text(text = text,
            style = Theme.typography.textMedium,
            color = Description
        )
    }
}
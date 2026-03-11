package com.example.uikit.Presentation.Inputs

import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.uikit.Presentation.Accent
import com.example.uikit.Presentation.Black
import com.example.uikit.Presentation.InputBG
import com.example.uikit.Presentation.InputStroke
import com.example.uikit.Presentation.Theme

//input для otp
@Composable
fun OTPTF(
    modifier: Modifier = Modifier,
    value: String,
    onValueChange: (String) -> Unit
) {
    OutlinedTextField(
        value = value,
        onValueChange = {
            onValueChange(it)
        },
        modifier = Modifier
            .size(48.dp),
        colors = OutlinedTextFieldDefaults.colors(
            focusedContainerColor = InputBG,
            unfocusedContainerColor = InputBG,
            focusedTextColor = Black,
            unfocusedTextColor = Black,
            focusedBorderColor = InputStroke,
            unfocusedBorderColor = InputStroke,
            cursorColor = Accent
        ),
        shape = RoundedCornerShape(10.dp),
        singleLine = true,
        textStyle = Theme.typography.title2Regular
    )
}
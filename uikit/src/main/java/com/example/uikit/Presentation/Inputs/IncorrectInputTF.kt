package com.example.uikit.Presentation.Inputs

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.uikit.Presentation.Accent
import com.example.uikit.Presentation.Black
import com.example.uikit.Presentation.Error
import com.example.uikit.Presentation.Placeholder
import com.example.uikit.Presentation.Theme

//элемент input с некорректными данными
@Composable
fun IncorrectInputTF(
    modifier: Modifier = Modifier,
    value: String,
    onValueChange: (String) -> Unit,
    placeholder: String,
    message: String
) {
    Column(
        modifier = modifier
            .fillMaxWidth()
    ) {
        OutlinedTextField(
            value = value,
            onValueChange = {
                onValueChange(it)
            },
            modifier = Modifier
                .fillMaxWidth()
                .heightIn(48.dp),
            colors = OutlinedTextFieldDefaults.colors(
                focusedContainerColor = Error.copy(alpha = 0.1f),
                unfocusedContainerColor = Error.copy(alpha = 0.1f),
                focusedPlaceholderColor = Placeholder,
                unfocusedPlaceholderColor = Placeholder,
                focusedTextColor = Black,
                unfocusedTextColor = Black,
                focusedBorderColor = Error,
                unfocusedBorderColor = Error,
                cursorColor = Accent
            ),
            shape = RoundedCornerShape(10.dp),
            placeholder = {
                Text(
                    text = placeholder,
                    style = Theme.typography.textRegular
                )
            },
            singleLine = true,
            textStyle = Theme.typography.textRegular
        )
        Text(text = message,
            style = Theme.typography.captionRegular,
            color = Error,
            modifier = Modifier
                .padding(top = 8.dp))
    }
}
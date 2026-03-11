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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.uikit.Presentation.Accent
import com.example.uikit.Presentation.Black
import com.example.uikit.Presentation.Description
import com.example.uikit.Presentation.InputBG
import com.example.uikit.Presentation.InputIcon
import com.example.uikit.Presentation.InputStroke
import com.example.uikit.Presentation.Placeholder
import com.example.uikit.Presentation.Theme

//элемент input
@Composable
fun InputTF(
    modifier: Modifier = Modifier,
    value: String,
    onValueChange: (String) -> Unit,
    title: String? = null,
    placeholder: String
) {
    Column(
        modifier = modifier
            .fillMaxWidth()
    ) {
        if (!title.isNullOrEmpty()){
            Text(text = title,
                style = Theme.typography.captionRegular,
                color = Description,
                modifier = Modifier
                    .padding(bottom = 4.dp))
        }
        OutlinedTextField(
            value = value,
            onValueChange = {
                onValueChange(it)
            },
            modifier = Modifier
                .fillMaxWidth()
                .heightIn(48.dp),
            colors = OutlinedTextFieldDefaults.colors(
                focusedContainerColor = InputBG,
                unfocusedContainerColor = InputBG,
                focusedPlaceholderColor = Placeholder,
                unfocusedPlaceholderColor = Placeholder,
                focusedTextColor = Black,
                unfocusedTextColor = Black,
                focusedBorderColor = Color(0xFF2254F5).copy(alpha = 0.5f),
                unfocusedBorderColor = if (value.isEmpty()) {
                    InputStroke
                } else {
                    InputIcon
                },
                cursorColor = Accent
            ),
            shape = RoundedCornerShape(10.dp),
            singleLine = true,
            placeholder = {
                Text(
                    text = placeholder,
                    style = Theme.typography.textRegular
                )
            },
            textStyle = Theme.typography.textRegular
        )
    }
}
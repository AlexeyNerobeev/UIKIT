package com.example.uikit.Presentation

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.uikit.R

//элемент поиска
@Composable
fun Search(
    value: String,
    onValueChange: (String) -> Unit,
    modifier: Modifier = Modifier,
    withCancel: Boolean = false,
    onCancelClick: () -> Unit,
    placeholder: String
) {
    Row(
        modifier = modifier
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
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
                focusedContainerColor = InputBG,
                unfocusedContainerColor = InputBG,
                focusedPlaceholderColor = Placeholder,
                unfocusedPlaceholderColor = Placeholder,
                focusedTextColor = Black,
                unfocusedTextColor = Black,
                focusedBorderColor = InputStroke,
                unfocusedBorderColor = InputStroke,
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
            textStyle = Theme.typography.textRegular,
            leadingIcon = {
                Icon(painter = painterResource(R.drawable.icon_search),
                    contentDescription = null,
                    tint = Description
                )
            },
            trailingIcon = {
                IconButton(
                    onClick = {
                        onValueChange("")
                    }
                ) {
                    Icon(painter = painterResource(R.drawable.icon_close),
                        contentDescription = null,
                        tint = Description
                    )
                }
            }
        )
        if(withCancel) {
            Text(
                text = "Отменить",
                style = Theme.typography.captionRegular,
                color = Accent,
                modifier = Modifier
                    .padding(start = 16.dp)
                    .clickable{
                        onCancelClick()
                    }
            )
        }
    }
}
package com.example.uikit.Presentation.Headers

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.uikit.Presentation.Black
import com.example.uikit.Presentation.Description
import com.example.uikit.Presentation.InputBG
import com.example.uikit.Presentation.InputIcon
import com.example.uikit.Presentation.Theme
import com.example.uikit.R

//хэдер строка
@Composable
fun RowHeader(
    modifier: Modifier = Modifier,
    title: String,
    onBackClick: () -> Unit,
    onDeleteClick: () -> Unit
) {
    Row(modifier = modifier
        .padding(start = 20.dp)
        .padding(end = 26.dp)
        .fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically) {
        IconButton(
            onClick = onBackClick,
            modifier = Modifier
                .size(32.dp)
                .clip(RoundedCornerShape(8.dp))
                .background(color = InputBG,
                    shape = RoundedCornerShape(8.dp)),
            colors = IconButtonDefaults.iconButtonColors(
                containerColor = InputBG,
                contentColor = Color.Unspecified
            )
        ) {
            Icon(painter = painterResource(R.drawable.icon_chevron_left),
                contentDescription = null,
                tint = Description)
        }
        Text(text = title,
            style = Theme.typography.title2Semibold,
            color = Black
        )
        IconButton(
            onClick = onDeleteClick
        ) {
            Icon(painter = painterResource(R.drawable.icon_delete),
                contentDescription = null,
                tint = InputIcon
            )
        }
    }
}
package com.example.uikit.Presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.uikit.R

//элемент select
@Composable
fun Select(
    title: String,
    value: String,
    dropItems: List<String>,
    onValueChange: (String) -> Unit,
    modifier: Modifier = Modifier,
    icon: Int? = null,
    description: String? = null,
    withDismiss: Boolean = false
) {
    val drop = remember { mutableStateOf(false) }
    Column(
        modifier = modifier
            .fillMaxWidth()
    ) {
        if(!description.isNullOrEmpty()){
            Text(text = description,
                style = Theme.typography.captionRegular,
                modifier = Modifier
                    .padding(bottom = 4.dp))
        }
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                modifier = modifier
                    .fillMaxWidth()
                    .height(48.dp)
                    .background(
                        color = InputBG,
                        shape = RoundedCornerShape(10.dp)
                    )
                    .border(
                        1.dp,
                        color = InputStroke,
                        shape = RoundedCornerShape(10.dp)
                    )
                    .clickable {
                        drop.value = !drop.value
                    }) {
                Row(
                    modifier = Modifier
                        .padding(14.dp)
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        if(icon != null) {
                            Icon(
                                painter = painterResource(icon),
                                contentDescription = null,
                                tint = Color.Unspecified,
                                modifier = Modifier
                                    .padding(end = 12.dp)
                            )
                        }
                        Text(text = value.ifEmpty {
                            title
                        },
                            style = Theme.typography.headlineRegular,
                            color = if(value.isEmpty()){
                                Placeholder
                            } else{
                                Black
                            })
                    }
                    Icon(painter = painterResource(R.drawable.icon_chevron_down),
                        contentDescription = null,
                        tint = Description
                    )
                }
                DropdownMenu(
                    expanded = drop.value,
                    onDismissRequest = {
                        drop.value = false
                    }
                ) {
                    dropItems.forEach {
                        DropdownMenuItem(
                            text = {
                                Text(text = it)
                            },
                            onClick = {
                                onValueChange(it)
                            }
                        )
                    }
                }
            }
            if(withDismiss){
                IconButton(
                    onClick = {
                        onValueChange("")
                    },
                    modifier = Modifier
                        .padding(start = 16.dp)
                ) {
                    Icon(painter = painterResource(R.drawable.icon_close),
                        contentDescription = null,
                        tint = InputStroke
                    )
                }
            }
        }
    }
}
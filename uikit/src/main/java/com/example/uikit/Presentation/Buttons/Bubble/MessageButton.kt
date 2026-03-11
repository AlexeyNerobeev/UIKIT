package com.example.uikit.Presentation.Buttons.Bubble

import android.os.Message
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.uikit.Presentation.Description
import com.example.uikit.Presentation.InputBG
import com.example.uikit.R

//кнопка сообщенния
@Composable
fun MessageButton(
    onCLick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Box(modifier = modifier
        .size(48.dp)
        .background(color = InputBG,
            shape = RoundedCornerShape(10.dp)
        )
        .clickable{
            onCLick()
        },
        contentAlignment = Alignment.Center){
        Icon(painter = painterResource(R.drawable.icon_message_circle),
            contentDescription = null,
            tint = Description
        )
    }
}
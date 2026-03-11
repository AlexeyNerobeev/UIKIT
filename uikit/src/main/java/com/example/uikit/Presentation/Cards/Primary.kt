package com.example.uikit.Presentation.Cards

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.pointer.stylusHoverIcon
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.uikit.Presentation.Black
import com.example.uikit.Presentation.Buttons.Small.SmallActiveButton
import com.example.uikit.Presentation.Buttons.Small.SmallBorderButton
import com.example.uikit.Presentation.CardStroke
import com.example.uikit.Presentation.Placeholder
import com.example.uikit.Presentation.Theme
import com.example.uikit.Presentation.White

//основная карточка
@Composable
fun Primary(
    modifier: Modifier = Modifier,
    title: String,
    description: String,
    price: Int,
    inCart: Boolean,
    onCLick: () -> Unit
) {
    Box(modifier = modifier
        .fillMaxWidth()
        .background(color = White,
            shape = RoundedCornerShape(12.dp)
        )
        .border(1.dp, color = CardStroke,
            shape = RoundedCornerShape(12.dp))){
        Column(modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth()) {
            Text(text = title,
                style = Theme.typography.headlineMedium,
                color = Black
            )
            Row(
                modifier = Modifier
                    .padding(top = 16.dp)
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column {
                    Text(text = description,
                        style = Theme.typography.captionSemibold,
                        color = Placeholder
                    )
                    Text(text = "$price ₽",
                        style = Theme.typography.title3Semibold,
                        color = Black,
                        modifier = Modifier
                            .padding(top = 4.dp))
                }
                if(inCart){
                    SmallBorderButton(
                        onCLick = onCLick,
                        text = "Убрать"
                    )
                } else{
                    SmallActiveButton(
                        onCLick = onCLick,
                        text = "Добавить"
                    )
                }
            }
        }
    }
}
package com.example.uikit.Presentation.Buttons

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.uikit.Presentation.Accent
import com.example.uikit.Presentation.Theme
import com.example.uikit.Presentation.White
import com.example.uikit.R

//кнопка корзины
@Composable
fun CartButton(
    modifier: Modifier = Modifier,
    title: String,
    price: Int,
    onCLick: () -> Unit
) {
    Button(
        onClick = onCLick,
        modifier = modifier
            .fillMaxWidth()
            .height(56.dp)
            .clip(
                shape = RoundedCornerShape(10.dp)
            )
            .background(color = Accent,
                shape = RoundedCornerShape(10.dp)
            ),
        contentPadding = PaddingValues(16.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = Accent,
            contentColor = White
        )
    ) {
        Row(modifier = Modifier
            .fillMaxSize(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Icon(
                    painter = painterResource(R.drawable.icon_shopping_cart),
                    contentDescription = null
                )
                Text(text = title,
                    style = Theme.typography.title3Semibold,
                    modifier = Modifier
                        .padding(start = 16.dp))
            }
            Text(text = "$price ₽",
                style = Theme.typography.title3Semibold)
        }
    }
}
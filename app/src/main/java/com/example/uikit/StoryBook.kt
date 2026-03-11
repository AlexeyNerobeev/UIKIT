package com.example.uikit

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import com.airbnb.android.showkase.annotation.ShowkaseComposable
import com.example.uikit.Presentation.Buttons.BigButtons.BigActiveButton
import com.example.uikit.Presentation.Buttons.BigButtons.BigBorderButton
import com.example.uikit.Presentation.Buttons.BigButtons.BigInactiveButton
import com.example.uikit.Presentation.Buttons.Bubble.BackButton
import com.example.uikit.Presentation.Buttons.Bubble.FilterButton
import com.example.uikit.Presentation.Buttons.Bubble.MessageButton
import com.example.uikit.Presentation.Buttons.CartButton
import com.example.uikit.Presentation.Buttons.Chips.ChipActiveButton
import com.example.uikit.Presentation.Buttons.Chips.ChipInactiveButton
import com.example.uikit.Presentation.Buttons.LogIn.VKButton
import com.example.uikit.Presentation.Buttons.LogIn.YandexButton
import com.example.uikit.Presentation.Buttons.MediumButtons.MediumActiveButton
import com.example.uikit.Presentation.Buttons.MediumButtons.MediumBorderButton
import com.example.uikit.Presentation.Buttons.MediumButtons.MediumInactiveButton
import com.example.uikit.Presentation.Buttons.MenuButton
import com.example.uikit.Presentation.Buttons.Small.SmallActiveButton
import com.example.uikit.Presentation.Buttons.Small.SmallBorderButton
import com.example.uikit.Presentation.Buttons.Small.SmallInactiveButton
import com.example.uikit.Presentation.Cards.Primary
import com.example.uikit.Presentation.Headers.ColumnHeader
import com.example.uikit.Presentation.Headers.RowHeader
import com.example.uikit.Presentation.Inputs.IncorrectInputTF
import com.example.uikit.Presentation.Inputs.InputTF
import com.example.uikit.Presentation.Inputs.OTPTF
import com.example.uikit.Presentation.Search
import com.example.uikit.Presentation.Select
import com.example.uikit.Presentation.TabBar

//storybook
@ShowkaseComposable(name = "InputTF", group = "Inputs")
@Composable
fun showInputTF(){
    InputTF(
        value = "",
        onValueChange = {},
        placeholder = "dfsdyfilks"
    )
}

@ShowkaseComposable(name = "IncorrectInputTF", group = "Inputs")
@Composable
fun showIncorrectInputTF(){
    IncorrectInputTF(
        value = "",
        onValueChange = {},
        placeholder = "dfsdyfilks",
        message = "jdhfksd"
    )
}

@ShowkaseComposable(name = "OTPTF", group = "Inputs")
@Composable
fun showOTPTF(){
    OTPTF(
        value = "",
        onValueChange = {}
    )
}

@ShowkaseComposable(name = "Select")
@Composable
fun showSelect(){
    Select(
        title = "ksdkfls",
        value = "",
        onValueChange = {},
        withDismiss = false,
        dropItems = listOf(
            "kdlgljdfg",
            "dlghdfgl"
        )
    )
}

@ShowkaseComposable(name = "Search")
@Composable
fun showSearch(){
    Search(
        value = "",
        onValueChange = {},
        onCancelClick = {},
        placeholder = "dkgjkksghj"
    )
}

@ShowkaseComposable(name = "BigActiveButton", group = "Buttons")
@Composable
fun showBigActiveButton(){
    BigActiveButton(
        onCLick = {},
        text = "dklgbsdgfd"
    )
}

@ShowkaseComposable(name = "BigInactiveButton", group = "Buttons")
@Composable
fun showBigInactiveButton(){
    BigInactiveButton(
        onCLick = {},
        text = "dklgbsdgfd"
    )
}

@ShowkaseComposable(name = "BigBorderButton", group = "Buttons")
@Composable
fun showBigBorderButton(){
    BigBorderButton(
        onCLick = {},
        text = "gfd"
    )
}

@ShowkaseComposable(name = "SmallActiveButton", group = "Buttons")
@Composable
fun showSmallActiveButton(){
    SmallActiveButton(
        onCLick = {},
        text = "dgfd"
    )
}

@ShowkaseComposable(name = "SmallInactiveButton", group = "Buttons")
@Composable
fun showSmallInactiveButton(){
    SmallInactiveButton(
        onCLick = {},
        text = "dsfd"
    )
}

@ShowkaseComposable(name = "SmallBorderButton", group = "Buttons")
@Composable
fun showSmallBorderButton(){
    SmallBorderButton(
        onCLick = {},
        text = "ddgfd"
    )
}

@ShowkaseComposable(name = "ChipActiveButton", group = "Buttons")
@Composable
fun showChipActiveButton(){
    ChipActiveButton(
        onCLick = {},
        text = "dklfd"
    )
}

@ShowkaseComposable(name = "ChipInactiveButton", group = "Buttons")
@Composable
fun showChipInactiveButton(){
    ChipInactiveButton(
        onCLick = {},
        text = "dkd"
    )
}

@ShowkaseComposable
@Composable
fun showTabBar(){
    val number = remember { mutableStateOf(1) }
    TabBar(
        currentScreenNumber = number.value,
        onFirstIconCLick = {number.value = 1},
        onSecondIconCLick = {number.value = 2},
        onThirdIconCLick = {number.value = 3},
        onFourthIconCLick = {number.value = 4}
    )
}

@ShowkaseComposable(name = "ColumnHeader", group = "Headers")
@Composable
fun showColumnHeader(){
    ColumnHeader(
        onBackClick = {},
        onDeleteClick = {},
        title = "title"
    )
}

@ShowkaseComposable(name = "RowHeader", group = "Headers")
@Composable
fun showRowHeader(){
    RowHeader(
        onBackClick = {},
        onDeleteClick = {},
        title = "title"
    )
}

@ShowkaseComposable(name = "MediumActiveButton", group = "Buttons")
@Composable
fun showMediumActiveButton(){
    MediumActiveButton(
        onCLick = {},
        text = "text"
    )
}

@ShowkaseComposable(name = "MediumInactiveButton", group = "Buttons")
@Composable
fun showMediumInactiveButton(){
    MediumInactiveButton(
        onCLick = {},
        text = "text"
    )
}

@ShowkaseComposable(name = "MediumBorderButton", group = "Buttons")
@Composable
fun showMediumBorderButton(){
    MediumBorderButton(
        onCLick = {},
        text = "text"
    )
}

@ShowkaseComposable(name = "CartButton", group = "Buttons")
@Composable
fun showCartButton(){
    CartButton(
        onCLick = {},
        title = "text",
        price = 500
    )
}

@ShowkaseComposable(name = "VKButton", group = "Buttons")
@Composable
fun showVKButton(){
    VKButton(
        onCLick = {}
    )
}

@ShowkaseComposable(name = "YandexButton", group = "Buttons")
@Composable
fun showYandexButton(){
    YandexButton(
        onCLick = {}
    )
}

@ShowkaseComposable(name = "MenuButton", group = "Buttons")
@Composable
fun showMenuButton(){
    MenuButton(
        icon = R.drawable.projects_icon,
        title = "title",
        description = "descritpion",
        onCLick = {}
    )
}

@ShowkaseComposable(name = "BackButton", group = "Buttons")
@Composable
fun showBackButton(){
    BackButton(
        onCLick = {}
    )
}

@ShowkaseComposable(name = "FilterButton", group = "Buttons")
@Composable
fun showFilterButton(){
    FilterButton(
        onCLick = {}
    )
}

@ShowkaseComposable(name = "MessageButton", group = "Buttons")
@Composable
fun showMessageButton(){
    MessageButton(
        onCLick = {}
    )
}

@ShowkaseComposable(name = "PrimaryCard", group = " Cards")
@Composable
fun showPrimaryCard(){
    Primary(
        title = "title",
        description = "descriprion",
        price = 500,
        inCart = false
    ) { }
}
package com.black.diamond.ako.private_chat.core.ui.component.text_field.helper

import androidx.compose.material3.LocalContentColor
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import com.black.diamond.ako.private_chat.core.ui.component.text.PlaceholderText
import com.black.diamond.ako.private_chat.core.ui.resources.TextUnitRes
import com.black.diamond.ako.private_chat.core.ui.theme.privateChatTextStyle

@Composable
fun TextFieldLabelText(modifier: Modifier = Modifier, text: String) {
    Text(
        modifier = modifier,
        text = text,
        style = privateChatTextStyle,
        color = LocalContentColor.current,
        fontWeight = FontWeight.SemiBold,
        fontSize = TextUnitRes.bodyMedium
    )
}

@Composable
fun TextFieldErrorText(modifier: Modifier = Modifier, text: String) {
    Text(
        modifier = modifier,
        text = text,
        style = privateChatTextStyle,
        color = MaterialTheme.colorScheme.error,
        fontWeight = FontWeight.SemiBold,
        fontSize = TextUnitRes.labelMedium
    )
}

@Composable
fun TextFieldPlaceholderText(modifier: Modifier = Modifier, text: String) {
    PlaceholderText(
        modifier = modifier,
        text = text,
        fontWeight = FontWeight.SemiBold,
        fontSize = TextUnitRes.bodyMedium
    )
}
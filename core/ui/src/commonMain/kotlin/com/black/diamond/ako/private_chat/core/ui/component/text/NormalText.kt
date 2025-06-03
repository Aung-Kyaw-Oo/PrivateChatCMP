package com.black.diamond.ako.private_chat.core.ui.component.text

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit
import com.black.diamond.ako.private_chat.core.ui.resources.TextUnitRes
import com.black.diamond.ako.private_chat.core.ui.theme.privateChatTextStyle

@Composable
fun PlaceholderText(
    modifier: Modifier = Modifier,
    text: String,
    fontWeight: FontWeight = FontWeight.Normal,
    fontSize: TextUnit = TextUnitRes.bodySmall
) {
    Text(
        modifier = modifier,
        text = text,
        fontWeight = fontWeight,
        fontSize = fontSize,
        style = privateChatTextStyle,
        color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.6f)
    )
}
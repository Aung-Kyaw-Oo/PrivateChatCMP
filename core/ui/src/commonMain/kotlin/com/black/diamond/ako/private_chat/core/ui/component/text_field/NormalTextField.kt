package com.black.diamond.ako.private_chat.core.ui.component.text_field

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import com.black.diamond.ako.private_chat.core.ui.resources.DimensRes
import com.black.diamond.ako.private_chat.core.ui.resources.TextUnitRes
import com.black.diamond.ako.private_chat.core.ui.theme.defaultTextStyle

@Composable
fun NormalTextField(
    modifier: Modifier = Modifier,
    text: String,
    inputBoxHeight: Dp = Dp.Unspecified,
    onTextChange: (String) -> Unit,
) {
    Column(modifier = modifier) {

        BasicTextField(
            modifier = Modifier
                .clip(MaterialTheme.shapes.small)
                .background(MaterialTheme.colorScheme.surfaceContainerHigh)
                .padding(DimensRes.textFieldPadding)
                .fillMaxWidth()
                .height(inputBoxHeight),
            textStyle = defaultTextStyle.copy(
                fontWeight = FontWeight.SemiBold,
                fontSize = TextUnitRes.bodyMedium
            ),
            value = text,
            onValueChange = onTextChange
        )
    }
}


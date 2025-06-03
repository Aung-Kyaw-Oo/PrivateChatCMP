package com.black.diamond.ako.private_chat.core.ui.component.text_field.helper

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.painter.Painter
import com.black.diamond.ako.private_chat.core.ui.resources.DimensRes
import org.jetbrains.compose.resources.painterResource
import privatechat.core.ui.generated.resources.Res
import privatechat.core.ui.generated.resources.baseline_home_24

@Composable
fun NormalTextFieldDecorationBox(
    innerTextField: @Composable () -> Unit,
    text: String,
    placeholder: String,
    trailingIcon: Painter?,
    contentDescription: String
) {
    Row(verticalAlignment = Alignment.CenterVertically) {
        Box(
            modifier = Modifier
                .weight(1f)
                .padding(
                    start = DimensRes.textFieldPadding,
                    top = DimensRes.textFieldPadding,
                    bottom = DimensRes.textFieldPadding,
                    end = if (trailingIcon != null) DimensRes.spacingNormal else DimensRes.textFieldPadding
                )
        ) {
            if (text.isEmpty()) {
                TextFieldPlaceholderText(text = placeholder)
            }
            innerTextField()
        }

        trailingIcon?.let {
            Icon(
                modifier = Modifier
                    .padding(end = DimensRes.spacingSmall)
                    .clip(CircleShape)
                    .clickable { }
                    .padding(DimensRes.spacingNormal)
                    .size(DimensRes.defaultIconSize),
                painter = painterResource(Res.drawable.baseline_home_24),
                contentDescription = contentDescription
            )
        }
    }
}
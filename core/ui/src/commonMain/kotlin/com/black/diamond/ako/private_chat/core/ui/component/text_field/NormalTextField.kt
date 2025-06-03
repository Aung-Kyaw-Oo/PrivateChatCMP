package com.black.diamond.ako.private_chat.core.ui.component.text_field

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsFocusedAsState
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.black.diamond.ako.private_chat.core.ui.component.text_field.helper.NormalTextFieldDecorationBox
import com.black.diamond.ako.private_chat.core.ui.component.text_field.helper.TextFieldErrorText
import com.black.diamond.ako.private_chat.core.ui.component.text_field.helper.TextFieldLabelText
import com.black.diamond.ako.private_chat.core.ui.resources.DimensRes
import com.black.diamond.ako.private_chat.core.ui.resources.TextUnitRes
import com.black.diamond.ako.private_chat.core.ui.theme.privateChatTextStyle

@Composable
fun NormalTextField(
    modifier: Modifier = Modifier,
    text: String,
    label: String,
    placeholder: String,
    isError: Boolean = false,
    errorMessage: String = "",
    shape: Shape = MaterialTheme.shapes.small,
    inputBoxHeight: Dp = Dp.Unspecified,
    trailingIcon: Painter? = null,
    contentDescription: String = "",
    onTextChange: (String) -> Unit,
) {
    val interactionSource = remember { MutableInteractionSource() }
    val isFocus by interactionSource.collectIsFocusedAsState()

    val borderColor = if (isError) MaterialTheme.colorScheme.error
    else MaterialTheme.colorScheme.primary

    Column(modifier = modifier) {
        TextFieldLabelText(
            modifier = Modifier.padding(start = DimensRes.spacingExtraSmall),
            text = label
        )

        Spacer(Modifier.height(DimensRes.spacingSmall))

        BasicTextField(
            modifier = Modifier
                .clip(shape)
                .background(MaterialTheme.colorScheme.surfaceContainerHigh)
                .border(
                    width = if (isFocus) 2.dp else 1.dp,
                    shape = shape,
                    color = borderColor
                )
                .fillMaxWidth()
                .height(inputBoxHeight),
            interactionSource = interactionSource,
            textStyle = privateChatTextStyle.copy(
                fontWeight = FontWeight.SemiBold,
                fontSize = TextUnitRes.bodyMedium
            ),
            singleLine = true,
            value = text,
            onValueChange = onTextChange,
            decorationBox = { innerTextField ->
                NormalTextFieldDecorationBox(
                    innerTextField = innerTextField,
                    text = text,
                    placeholder = placeholder,
                    trailingIcon = trailingIcon,
                    contentDescription = contentDescription
                )
            }
        )

        if (isError) {
            TextFieldErrorText(
                modifier = Modifier.padding(start = DimensRes.spacingExtraSmall),
                text = errorMessage
            )
        }
    }
}


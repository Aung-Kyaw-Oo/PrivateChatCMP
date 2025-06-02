package com.black.diamond.ako.private_chat.core.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable

@Composable
fun PrivateChatTheme(
    content: @Composable () -> Unit
) {

    MaterialTheme(
        content = { Surface { content() } }
    )
}
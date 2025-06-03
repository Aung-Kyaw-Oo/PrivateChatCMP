package com.black.diamond.ako.private_chat

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.black.diamond.ako.private_chat.core.ui.component.text_field.NormalTextField
import org.jetbrains.compose.resources.painterResource

import privatechat.composeapp.generated.resources.Res
import privatechat.composeapp.generated.resources.compose_multiplatform

@Composable
@Preview
fun App() {
    MaterialTheme {
        var text by remember { mutableStateOf("") }
        Column(
            modifier = Modifier
                .safeContentPadding()
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
           NormalTextField(
               modifier = Modifier.height(200.dp),
               text = text,
               label = "Email",
               isError = true,
               errorMessage = "Email must not be emty.",
               placeholder = "Hello",
               onTextChange = { text = it },
           )
        }
    }
}
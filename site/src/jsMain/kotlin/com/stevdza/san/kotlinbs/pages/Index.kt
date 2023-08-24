package com.stevdza.san.kotlinbs.pages

import androidx.compose.runtime.Composable
import com.stevdza.san.kotlinbs.forms.BSSwitch
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.compose.ui.modifiers.margin
import com.varabyte.kobweb.core.Page
import org.jetbrains.compose.web.css.px

@Page
@Composable
fun HomePage() {
    Row(
        modifier = Modifier.fillMaxSize().margin(top = 250.px),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.Top
    ) {
        BSSwitch(
            modifier = Modifier.margin(right = 50.px),
            label = "Android",
            onClick = {}
        )
        BSSwitch(
            modifier = Modifier.margin(right = 50.px),
            label = "iOS",
            defaultChecked = true,
            onClick = {}
        )
        BSSwitch(
            modifier = Modifier.margin(right = 50.px),
            label = "Web",
            disabled = true,
            defaultChecked = true,
            onClick = {}
        )
        BSSwitch(
            label = "Desktop",
            disabled = true,
            onClick = {}
        )
    }
}
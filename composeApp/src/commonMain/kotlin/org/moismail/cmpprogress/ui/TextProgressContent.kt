package org.moismail.cmpprogress.ui

import androidx.compose.animation.core.RepeatMode
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType
import androidx.compose.ui.unit.dp
import loaders.text.HighLightedLettersTextProgress
import loaders.text.HorizontalGradientTextProgress
import loaders.text.JumpingDotLettersTextProgress
import loaders.text.LinearGradientTextProgress

@Composable
fun TextProgressContent(modifier: Modifier = Modifier) {
    Column(
        modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center

    ) {
        HighLightedLettersTextProgress(
            text = "LOADING",
            backgroundColor = MaterialTheme.colors.surface,
            textStyle = TextStyle(fontSize = TextUnit(48f, TextUnitType.Sp)),
            enableMirror = true,
            activeLetterColor = Color.Magenta,
            inActiveLetterColor = Color.Gray,
        )

        ProgressTitle(title = "HighLightedLettersTextProgress")
        Spacer(modifier = Modifier.height(32.dp))

        HorizontalGradientTextProgress(
            text = "LOADING",
            inActiveColor = MaterialTheme.colors.surface,
            textStyle = TextStyle(fontSize = TextUnit(48f, TextUnitType.Sp)),
            activeColor = Color(0xFFAB3FFF),
            duration = 2000,
        )

        ProgressTitle(title = "HorizontalGradientTextProgress")
        Spacer(modifier = Modifier.height(32.dp))

        LinearGradientTextProgress(
            text = "LOADING",
            textStyle = TextStyle(fontSize = TextUnit(48f, TextUnitType.Sp)),
            duration = 1000,
            activeColor = Color.Magenta,
            progressBarBackgroundColor = Color.Gray,
            showProgressBar = true,
            repeatMode = RepeatMode.Reverse,
            initialProgress = 0.5f
        )

        ProgressTitle(title = "LinearGradientTextProgress")
        Spacer(modifier = Modifier.height(32.dp))

        JumpingDotLettersTextProgress(
            text = "LOADING",
            textStyle = TextStyle(fontSize = TextUnit(48f, TextUnitType.Sp)),
            activeLetterColor = Color(0xFFAB3FFF),
            inActiveLetterColor = Color.Gray,
        )

        ProgressTitle(title = "JumpingDotLettersTextProgress")
    }
}
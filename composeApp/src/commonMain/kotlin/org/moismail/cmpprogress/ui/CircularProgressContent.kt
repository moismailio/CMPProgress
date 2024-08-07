package org.moismail.cmpprogress.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import loaders.circular.AnimatingArcsProgress
import loaders.circular.AnimatingCircleWithArcsProgress
import loaders.circular.DroppingDotsProgress
import loaders.circular.ScatteredArcsProgress

@Composable
fun CircularProgressContent(modifier: Modifier = Modifier) {
    Column(
        modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        ScatteredArcsProgress(
            modifier = Modifier.size(100.dp),
            backgroundColor = Color.Gray.copy(alpha = 0.2f),
            activeColor = Color(0xFF0097ff)
        )

        ProgressTitle(title = "ScatteredArcsProgress")
        Spacer(modifier = Modifier.height(32.dp))

        DroppingDotsProgress(
            modifier = Modifier.size(100.dp),
            backgroundColor = Color.Gray.copy(alpha = 0.2f),
            activeColor = Color(0xFF0097ff)
        )

        ProgressTitle(title = "DroppingDotsProgress")
        Spacer(modifier = Modifier.height(32.dp))

        AnimatingArcsProgress(
            modifier = Modifier.size(100.dp),
            activeColor = Color(0xFF0097ff)
        )

        ProgressTitle(title = "AnimatingArcsProgress")
        Spacer(modifier = Modifier.height(32.dp))

        AnimatingCircleWithArcsProgress(
            modifier = Modifier.size(100.dp),
            activeColor = Color(0xFF0097ff)
        )
        ProgressTitle(title = "AnimatingCircleWithArcsProgress")
    }
}
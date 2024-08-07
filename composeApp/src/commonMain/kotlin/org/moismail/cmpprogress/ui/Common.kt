package org.moismail.cmpprogress.ui

import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType
import androidx.compose.ui.unit.dp

@Composable
fun ProgressTitle(modifier: Modifier = Modifier, title: String) {
    Text(
        modifier = modifier.padding(top = 15.dp),
        text = title,
        color = MaterialTheme.colors.onBackground,
        fontSize = TextUnit(16f, TextUnitType.Sp)
    )
}
package org.moismail.cmpprogress.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import org.moismail.cmpprogress.segmented.SegmentedCirclesLoadingIndicator
import org.moismail.cmpprogress.segmented.SegmentedDotsLoadingIndicator
import org.moismail.cmpprogress.segmented.SegmentedRectangularLoadingIndicator

@Composable
fun SegmentedLoaders(modifier: Modifier = Modifier) {
    Column(
        modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly
    )
    {
        SegmentedCirclesLoadingIndicator(
            activeColor = Color(0xFF0097ff)
        )
        ProgressTitle(
            modifier = Modifier.padding(32.dp),
            title = "SegmentedCirclesLoadingIndicator"
        )

        SegmentedDotsLoadingIndicator(
            activeColor = Color(0xFF0097ff)
        )
        ProgressTitle(
            modifier = Modifier.padding(32.dp),
            title = "SegmentedDotsLoadingIndicator"
        )


        SegmentedRectangularLoadingIndicator(
            activeColor = Color(0xFF0097ff)
        )
        ProgressTitle(
            modifier = Modifier.padding(32.dp),
            title = "SegmentedRectangularLoadingIndicator"
        )

    }
}
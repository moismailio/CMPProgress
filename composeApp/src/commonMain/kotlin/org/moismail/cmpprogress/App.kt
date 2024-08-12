package org.moismail.cmpprogress

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawing
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Tab
import androidx.compose.material.TabRow
import androidx.compose.material.TabRowDefaults
import androidx.compose.material.TabRowDefaults.tabIndicatorOffset
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.ui.tooling.preview.Preview
import org.moismail.cmpprogress.ui.CircularProgressContent
import org.moismail.cmpprogress.ui.SegmentedLoaders
import org.moismail.cmpprogress.ui.TextProgressContent

@Composable
@Preview
fun App() {
    MaterialTheme {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(MaterialTheme.colors.surface)
                .windowInsetsPadding(WindowInsets.safeDrawing),
        ) {
            val selectedTab = remember {
                mutableStateOf(0)
            }
            TabRow(
                modifier = Modifier.fillMaxWidth(),
                backgroundColor = MaterialTheme.colors.surface,
                selectedTabIndex = selectedTab.value,
                indicator = { tabPositions ->
                    TabRowDefaults.Indicator(
                        modifier = Modifier.tabIndicatorOffset(tabPositions[selectedTab.value]),
                        color = MaterialTheme.colors.onBackground
                    )
                },
                divider = {},
                tabs = {
                    Tab(
                        modifier = Modifier.padding(20.dp),
                        selected = selectedTab.value == 0,
                        onClick = {
                            selectedTab.value = 0
                        },
                        content = {
                            Text(
                                text = "Circular Progress",
                                maxLines = 1,
                                overflow = TextOverflow.Ellipsis,
                                color = MaterialTheme.colors.onBackground,
                                fontSize = TextUnit(12f, TextUnitType.Sp),
                                fontWeight = FontWeight.Bold
                            )
                        }
                    )
                    Tab(
                        modifier = Modifier.padding(20.dp),
                        selected = selectedTab.value == 1,
                        onClick = {
                            selectedTab.value = 1
                        },
                        content = {
                            Text(
                                text = "Text Progress",
                                maxLines = 1,
                                overflow = TextOverflow.Ellipsis,
                                color = MaterialTheme.colors.onBackground,
                                fontSize = TextUnit(12f, TextUnitType.Sp),
                                fontWeight = FontWeight.Bold
                            )
                        }
                    )
                    Tab(
                        modifier = Modifier.padding(20.dp),
                        selected = selectedTab.value == 2,
                        onClick = {
                            selectedTab.value = 2
                        },
                        content = {
                            Text(
                                text = "Segmented Loaders",
                                maxLines = 1,
                                overflow = TextOverflow.Ellipsis,
                                color = MaterialTheme.colors.onBackground,
                                fontSize = TextUnit(12f, TextUnitType.Sp),
                                fontWeight = FontWeight.Bold
                            )
                        }
                    )
                }
            )
            Column(modifier = Modifier.fillMaxSize()) {
                if (selectedTab.value == 0)
                    CircularProgressContent()
                else if (selectedTab.value == 1)
                    TextProgressContent()
                else if (selectedTab.value == 2)
                    SegmentedLoaders()
            }
        }
    }
}
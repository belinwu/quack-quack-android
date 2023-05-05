/*
 * Designed and developed by Duckie Team, 2022~2023
 *
 * Licensed under the MIT.
 * Please see full license: https://github.com/duckie-team/quack-quack-android/blob/master/LICENSE
 */

@file:OptIn(ExperimentalQuackQuackApi::class)

package team.duckie.quackquack.catalog

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import casaModels
import team.duckie.quackquack.casa.ui.CasaScreen
import team.duckie.quackquack.casa.ui.theme.CasaTheme
import team.duckie.quackquack.ui.util.ExperimentalQuackQuackApi

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CasaTheme {
                CasaScreen(models = casaModels)
            }
            /*Preview {
                var showIcons by remember { mutableStateOf(true) }
                var enabled by remember { mutableStateOf(true) }
                QuackButton(
                    modifier = Modifier.then(Modifier).applyIf(showIcons) {
                        icons(
                            leadingIcon = QuackIcon.Heart,
                            trailingIcon = QuackIcon.Heart,
                        )
                    },
                    enabled = enabled,
                    style = QuackButtonStyle.Large,
                    text = "Hello, World!",
                ) {
                    toast("Hello, World!")
                }
                QuackButton(
                    style = QuackButtonStyle.Medium,
                    text = "enabled state: $enabled",
                ) {
                    enabled = !enabled
                }
                QuackButton(
                    style = QuackButtonStyle.Small,
                    text = "showIcons state: $showIcons",
                ) {
                    showIcons = !showIcons
                }
            }*/
        }
    }
}

@Suppress("UnusedPrivateMember", "unused")
@Composable
private fun Preview(content: @Composable ColumnScope.() -> Unit) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.spacedBy(
            space = 8.dp,
            alignment = Alignment.CenterVertically,
        ),
        horizontalAlignment = Alignment.CenterHorizontally,
        content = content,
    )
}
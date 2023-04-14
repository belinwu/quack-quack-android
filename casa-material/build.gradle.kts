/*
 * Designed and developed by Duckie Team 2023.
 *
 * Licensed under the MIT.
 * Please see full license: https://github.com/duckie-team/quack-quack-android/blob/2.x.x/LICENSE
 */

plugins {
    `buildlogic-android-library`
    `buildlogic-kotlin-explicitapi`
}

android {
    namespace = "team.duckie.quackquack.casa.material"
}

dependencies {
    implementations(
        libs.kotlin.collections.immutable,
        libs.compose.runtime,
    )
}
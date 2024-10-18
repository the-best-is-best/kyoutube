package io.github.the_best_is_best.kyoutube

import androidx.compose.runtime.Composable
import kotlinx.browser.document
import kotlinx.browser.window

@Composable
actual fun KYoutube(videoId: String) {

    val iframe = window.document.createElement("iframe")
    iframe.setAttribute("src", videoId)
    iframe.setAttribute("width", "100%")
    iframe.setAttribute("height", "100%")
    iframe.setAttribute("frameborder", "0")
    iframe.setAttribute("scrolling", "no")

    document.body?.appendChild(iframe)
}

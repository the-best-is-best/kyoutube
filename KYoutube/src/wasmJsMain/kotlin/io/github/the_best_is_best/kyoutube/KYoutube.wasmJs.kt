package io.github.the_best_is_best.kyoutube

import androidx.compose.runtime.Composable
import kotlinx.browser.document
import org.w3c.dom.HTMLIFrameElement

@Composable
actual fun KYoutube(videoId: String) {
    val iframe = document.createElement("iframe") as HTMLIFrameElement
    iframe.width = "100%"
    iframe.height = "100%"
    iframe.src = "https://www.youtube.com/embed/$videoId"
    document.body?.appendChild(iframe)
}
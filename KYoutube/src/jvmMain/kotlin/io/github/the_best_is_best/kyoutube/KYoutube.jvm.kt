package io.github.the_best_is_best.kyoutube

import androidx.compose.runtime.Composable
import com.multiplatform.webview.web.WebView
import com.multiplatform.webview.web.rememberWebViewState

@Composable
actual fun KYoutube(videoId: String) {
    val state = rememberWebViewState("https://www.youtube.com/embed/$videoId")

    WebView(state)


}
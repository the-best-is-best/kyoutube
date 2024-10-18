package io.github.the_best_is_best.kyoutube

import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.IntSize
import androidx.compose.ui.viewinterop.UIKitView
import kotlinx.cinterop.ExperimentalForeignApi
import kotlinx.cinterop.readValue
import platform.CoreGraphics.CGRectZero
import platform.Foundation.NSURL
import platform.Foundation.NSURLRequest
import platform.WebKit.WKWebView


@OptIn(ExperimentalForeignApi::class)
@Composable
actual fun KYoutube(videoId: String) {
    // Get local density from composable
    val density = LocalDensity.current
    var componentSize by remember { mutableStateOf(IntSize.Zero) }

    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .onGloballyPositioned { layoutCoordinates ->
                componentSize = layoutCoordinates.size // Update size with the current layout size
            }
    ) {
        // Use UIKitView with the correct size
        UIKitView(
            modifier = Modifier
                .width(with(density) { componentSize.width.toDp() })
                .height(with(density) { componentSize.height.toDp() }),
            factory = {
                println("Creating WKWebView")
                val webView = WKWebView(frame = CGRectZero.readValue())
                val url = NSURL(string = "https://www.youtube.com/embed/$videoId")
                val request = NSURLRequest(url)
                webView.loadRequest(request)
                webView // Return the WKWebView to UIKitView
            },
            update = {
                // You can perform any necessary updates to the web view here
                println("Updating WKWebView")
            }
        )
    }
}

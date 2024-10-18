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
import androidx.compose.ui.viewinterop.AndroidView
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView

@Composable
actual fun KYoutube(videoId: String) {
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
        AndroidView(
            modifier = Modifier
                .width(with(density) { componentSize.width.toDp() })
                .height(with(density) { componentSize.height.toDp() }),
            factory = {
                YouTubePlayerView(context = it).apply {
                    addYouTubePlayerListener(object : AbstractYouTubePlayerListener() {
                        override fun onReady(youTubePlayer: YouTubePlayer) {
                            youTubePlayer.cueVideo(videoId, 0f)
                            super.onReady(youTubePlayer)
                        }

                    })
                }
            }
        )
    }
}
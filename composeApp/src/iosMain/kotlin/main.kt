import androidx.compose.ui.window.ComposeUIViewController
import org.thechance.photochance.App
import platform.UIKit.UIViewController

fun MainViewController(): UIViewController {
    return ComposeUIViewController { App() }
}

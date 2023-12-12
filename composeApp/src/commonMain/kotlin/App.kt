import androidx.compose.runtime.Composable
import core.presentation.AppTheme
import org.jetbrains.compose.resources.ExperimentalResourceApi
import screen.loginScreen

@OptIn(ExperimentalResourceApi::class)
@Composable
fun App(
    darkTheme: Boolean,
    dynamicColor: Boolean,
) {
    AppTheme(
        darkTheme = darkTheme,
        dynamicColor = dynamicColor
    ) {
        loginScreen()
    }
}
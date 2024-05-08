import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun MainScreen(modifier: Modifier = Modifier) {
    Column(modifier = Modifier.padding(16.dp)) {

        TopScreen()
        Spacer(modifier = Modifier.size(16.dp))
        WelcomeScreen()
        Spacer(modifier = Modifier.height(32.dp))
        SavingsScreen()
        Spacer(modifier = Modifier.height(16.dp))
        EmotionsScreen()

    }
}
@Preview
@Composable
fun MainScreenPreview() {
    MainScreen()
}
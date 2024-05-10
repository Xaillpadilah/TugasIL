package navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Person
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottoBarScreen(
    val route: String,
    val title: String,
    val icon: ImageVector
){
    object Screen1 : BottoBarScreen(
        route = "screen1",
        title = "screen1",
        icon = Icons.Default.Menu
    )
    object Screen2 : BottoBarScreen(
        route = "screen2",
        title = "screen2",
        icon = Icons.Default.Menu
    )
    object Screen3 : BottoBarScreen(
        route = "profile",
        title = "frofile",
        icon = Icons.Default.Person
    )
}

package navigation

import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import screen.GrideView
import screen.PantaiRow
import screen.PreviewViewScreen
import screen.pantaiList


@Composable
fun BottonNavGraph(navController: NavHostController){
    NavHost(
        navController = navController,
        startDestination = BottoBarScreen.Screen1.route
    ){
        composable(route = BottoBarScreen.Screen1.route){
            PantaiRow()
            pantaiList
            TopAppBar {

            }

        }
        composable(route = BottoBarScreen.Screen2.route){
            GrideView()
            TopAppBar {

            }
        }
        composable(route = BottoBarScreen.Screen3.route){
            PreviewViewScreen()
            TopAppBar {
                
            }
        }
    }
}
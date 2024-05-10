package com.example.myapplication

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.RowScope
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.navigation.NavDestination
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import navigation.BottoBarScreen
import navigation.BottonNavGraph

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun MainScreen() {
    val navController = rememberNavController()
    Scaffold(
        bottomBar = { BottoBar(navController = navController)}
    ) {
        BottonNavGraph(navController = navController)
    }
}
@Composable
fun BottoBar(navController: NavHostController){
    val screen = listOf(
        BottoBarScreen.Screen1,
        BottoBarScreen.Screen2,
        BottoBarScreen.Screen3,
    )
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentDestination = navBackStackEntry?.destination

    BottomNavigation {
        screen.forEach{screen ->
            AddItem(
                screen = screen,
                currentDestination = currentDestination,
                navController = navController)
        }
    }
}
@Composable
fun RowScope.AddItem(
    screen: BottoBarScreen,
    currentDestination: NavDestination?,
    navController: NavHostController

){
    BottomNavigationItem(
        label = {
            Text(text = screen.title)
        },
        icon = {
            Icon(
                imageVector = screen.icon ,
                contentDescription = "Navigation Icon"
            )
        },
        selected = currentDestination?.hierarchy?.any{
            it.route == screen.route
        }== true,
        onClick = {
            navController.navigate(screen.route)
        }
    )



}
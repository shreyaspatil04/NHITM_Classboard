package com.example.nhitmclassboard.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHost
import androidx.navigation.NavHostController
import com.example.nhitmclassboard.screens.AboutUs
import com.example.nhitmclassboard.screens.BottomNav
import com.example.nhitmclassboard.screens.Faculty
import com.example.nhitmclassboard.screens.Gallery
import com.example.nhitmclassboard.screens.Home


@Composable
fun NavGraph(navController: NavHostController){
    NavHost(
        navController = navController,
        startDestination = Routes.BottomNav.route
    ){
         composable(Routes.BottomNav.route){
            BottomNav(navController)
        }

        composable(Routes.BottomNav.route){
            Home()
        }

        composable(Routes.BottomNav.route){
            Gallery()
        }

        composable(Routes.BottomNav.route){
            Faculty()
        }

        composable(Routes.BottomNav.route){
            AboutUs()
        }

    }

}


fun composable(route: String, function: @Composable () -> Unit) {

}



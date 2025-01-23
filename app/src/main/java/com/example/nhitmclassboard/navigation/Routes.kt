package com.example.nhitmclassboard.navigation

sealed class Routes(val route:String){
    object Home:Routes:(route:"home")
    object Faculty:Routes:(route:"faculty")
    object AboutUs:Routes:(route:"about_us")
    object Gallery:Routes:(route:"gallery")
    object BottomNav:Routes:(route:"bottom_nav")
}
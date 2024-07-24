package com.example.project1.pro1

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun Call(){
    var navcontroller= rememberNavController()

    NavHost(navController = navcontroller, startDestination = Route.page1, builder = {

        composable(Route.page1){
            page1(navcontroller)
        }
        composable(Route.page2){
            page2(navcontroller)

        }
        composable(Route.page3){
            page3(navcontroller)
        }
    } )


}
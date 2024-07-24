package com.example.project1.pro1

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.project1.R

@Composable
fun page2(navController: NavController){

    Column(
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Image(painter = painterResource(id = R.drawable.img2), contentDescription ="img2",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .padding(top = 25.dp)
                .padding(all = 25.dp)
                .size(400.dp)
                .clip(RoundedCornerShape(50.dp))

            )

        Text(text = "This is the page 2",
            fontWeight = FontWeight.Bold
                )

        Button(onClick = {navController.navigate(Route.page1)}) {
            Text(text = "Back")
        }


        Button(onClick = {navController.navigate(Route.page3)}) {
            Text(text = "Next")
        }

    }
}
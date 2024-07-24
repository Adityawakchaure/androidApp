package com.example.project1.pro1

import android.graphics.fonts.FontStyle
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
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
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.project1.R

@Composable
fun page1(navController: NavController){

    Column(
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Image(painter = painterResource(id= R.drawable.img1), contentDescription ="img1",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .padding(top = 25.dp)
                .padding(all = 25.dp)
                .size(400.dp)
                .clip(shape = RoundedCornerShape(50.dp))

        )

        Text(text = "Welcome",

            fontWeight = FontWeight.Bold,
            modifier = Modifier
        )



        Button(onClick = { navController.navigate(Route.page2) }) {
            Text(text = "Next")
        }
    }
}
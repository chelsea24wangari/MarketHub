package com.chelsea.markethub.ui.screens.splash

import android.annotation.SuppressLint
import android.app.Service
import android.window.SplashScreen
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.chelsea.markethub.R
import com.chelsea.markethub.ui.navigation.ROUT_SPLASH
import com.chelsea.markethub.ui.theme.YellowWhite80
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch


@SuppressLint("CoroutineCreationDuringComposition")
@Composable
fun SplashScreen(navController: NavController){

    //Navigation
val coroutine = rememberCoroutineScope()
    coroutine.launch {
        delay(2000)
        navController.navigate(ROUT_SPLASH)
    }

    //End Navigation

    Column(
        modifier = Modifier.fillMaxSize().background(YellowWhite80),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center


    ) {

        Image(
            painter = painterResource(R.drawable.img_1),
            contentDescription = "product",
            modifier = Modifier.size(300.dp)
        )
        Text(
            text = "MarketHub",
            fontSize = 20.sp,
            fontWeight = FontWeight.ExtraBold,
            fontStyle = FontStyle.Italic,
            modifier = Modifier.padding(20.dp)


        )

    }


}

@Preview (showBackground =true)
@Composable
fun SplashScreenPreview(){
    SplashScreen(rememberNavController())
}

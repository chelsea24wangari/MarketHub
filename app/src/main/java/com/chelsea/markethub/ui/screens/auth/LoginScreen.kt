package com.chelsea.markethub.ui.screens.auth

import android.app.Service
import android.graphics.drawable.PaintDrawable
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.chelsea.markethub.R
import com.chelsea.markethub.data.AuthViewModel
import com.chelsea.markethub.ui.navigation.ROUT_HOME
import com.chelsea.markethub.ui.navigation.ROUT_LOGIN
import com.chelsea.markethub.ui.theme.YellowWhite40
import com.chelsea.markethub.ui.theme.YellowWhite80


@Composable
fun LoginScreen(navController: NavController){


    Column(
        modifier = Modifier
            .paint(painter = painterResource(R.drawable.background), contentScale = ContentScale.FillBounds)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(R.drawable.img_1),
            contentDescription = "Register",
            modifier = Modifier.size(200.dp)
        )
        Spacer(modifier = Modifier.height(20.dp))


        Text(
            text = "Welcome Back!",
            fontSize = 20.sp,
            fontWeight = FontWeight.ExtraBold,
        )


        Spacer(modifier = Modifier.height(20.dp))


      //Variables
        var email by remember { mutableStateOf("") }
        var password by remember { mutableStateOf("") }

        OutlinedTextField(
            value = email,
            onValueChange = {email=it},
            modifier = Modifier.width(350.dp),
            leadingIcon = { Icon(
                imageVector = Icons.Default.Email,
                contentDescription = "email",

            ) },
            label = {Text(text = "Email")},

            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
            colors = OutlinedTextFieldDefaults.colors(
                unfocusedBorderColor = YellowWhite40,
                focusedBorderColor = Color.Black,
                unfocusedLeadingIconColor = YellowWhite40
            )
        )
 Spacer(modifier = Modifier.height(20.dp))

        OutlinedTextField(
            value = password,
            onValueChange = {password=it},
            modifier = Modifier.width(350.dp),
            leadingIcon = { Icon(
                imageVector = Icons.Default.Email,
                contentDescription = "password",

                ) },
            label = {Text(text = "Password")},

            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
            colors = OutlinedTextFieldDefaults.colors(
                unfocusedBorderColor = YellowWhite40,
                focusedBorderColor = Color.Black,
                unfocusedLeadingIconColor = YellowWhite40
            )
        )

        Spacer(modifier = Modifier.height(20.dp))


        Button(
            onClick = {},
            colors = ButtonDefaults.buttonColors(YellowWhite80),
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier.width(350.dp)


        ) {
            Text(
                text = "Login Now"
            )
        }
        Spacer(modifier = Modifier.height(20.dp))

        val context = LocalContext.current
        val authViewModel = AuthViewModel(navController, context)


        TextButton(onClick = {}) {
            Text(text = "Don't have an account? Register with us now.")
        }
        Button(
            onClick = {
                navController.navigate(ROUT_HOME)
                authViewModel.login(email, password)
               },
            colors = ButtonDefaults.buttonColors(   YellowWhite80),
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier.width(350.dp)
        )
        {
            Text(
                text = "Register with Us Now"
            )

        }

    }


}

@Preview (showBackground =true)
@Composable
fun LoginScreenPreview(){
    LoginScreen(rememberNavController())
}















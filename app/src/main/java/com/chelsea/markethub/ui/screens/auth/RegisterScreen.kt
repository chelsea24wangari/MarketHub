package com.chelsea.markethub.ui.screens.auth

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
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.chelsea.markethub.R
import com.chelsea.markethub.ui.navigation.ROUT_INTENT
import com.chelsea.markethub.ui.navigation.ROUT_LOGIN
import com.chelsea.markethub.ui.theme.YellowWhite80

@Composable
fun RegisterScreen(navController: NavController){
    Column(
        modifier = Modifier
            .paint(painter = painterResource(   R.drawable.background), contentScale = ContentScale.FillBounds)
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
            text = "Join us and start your journey today",
            fontSize = 20.sp,
            fontWeight = FontWeight.ExtraBold,
        )

        Spacer(modifier = Modifier.height(20.dp))

        //Variables
        var username by remember { mutableStateOf("") }
        var email by remember { mutableStateOf("") }
        var password by remember { mutableStateOf("") }
        var confirmpassword by remember { mutableStateOf("") }


        OutlinedTextField(
            value = username,
            onValueChange = {username=it},
            modifier = Modifier.width(350.dp),
            leadingIcon = { Icon(
                imageVector = Icons.Default.Person,
                contentDescription = "username") },
            label = {Text(text = "Username")},

            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
            colors = OutlinedTextFieldDefaults.colors(
                unfocusedBorderColor = YellowWhite80,
                focusedBorderColor = Color.Black,
                unfocusedLeadingIconColor = YellowWhite80,
            )

        )
        Spacer(modifier = Modifier.height(10.dp))


        OutlinedTextField(
            value = email,
            onValueChange = {email=it},
            modifier = Modifier.width(350.dp),
            leadingIcon = { Icon(
                imageVector = Icons.Default.Email,
                contentDescription = "email") },
            label = {Text(text = "Email")},

            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
            colors = OutlinedTextFieldDefaults.colors(
                unfocusedBorderColor = YellowWhite80,
                focusedBorderColor = Color.Black,
                unfocusedLeadingIconColor = YellowWhite80,
            )

        )
        Spacer(modifier = Modifier.height(10.dp))

        OutlinedTextField(
            value = password,
            onValueChange = {password=it},
            modifier = Modifier.width(350.dp),
            leadingIcon = { Icon(
                imageVector = Icons.Default.Lock,
                contentDescription = "Password") },
            label = {Text(text = "Password")},

            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            colors = OutlinedTextFieldDefaults.colors(
                unfocusedBorderColor = YellowWhite80,
                focusedBorderColor = Color.Black,
                unfocusedLeadingIconColor = YellowWhite80,
            ),
            visualTransformation = PasswordVisualTransformation()

        )
        Spacer(modifier = Modifier.height(10.dp))

        OutlinedTextField(
            value = confirmpassword,
            onValueChange = {confirmpassword=it},
            modifier = Modifier.width(350.dp),
            leadingIcon = { Icon(
                imageVector = Icons.Default.Lock,
                contentDescription = "password") },
            label = {Text(text = "Confirm your Password")},

            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            colors = OutlinedTextFieldDefaults.colors(
                unfocusedBorderColor = YellowWhite80,
                focusedBorderColor = Color.Black,
                unfocusedLeadingIconColor = YellowWhite80,
            ),
            visualTransformation = PasswordVisualTransformation()

        )
        Spacer(modifier = Modifier.height(10.dp))

        Button(
            onClick = {navController.navigate(ROUT_LOGIN)},
            colors = ButtonDefaults.buttonColors(   YellowWhite80),
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier.width(350.dp)
        )
        {
            Text(
                text = "Register with Us Now"
            )

        }

        Spacer(modifier = Modifier.height(10.dp))

        TextButton(onClick = {}) {
            Text(text = " Already have an account? Login")
        }
























    }



}
@Preview(showBackground = true)
@Composable
fun RegisterScreenPreview(){
    RegisterScreen(rememberNavController())


}
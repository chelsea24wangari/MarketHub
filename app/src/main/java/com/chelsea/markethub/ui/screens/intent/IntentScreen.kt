package com.chelsea.markethub.ui.screens.intent

import  android.app.Service
import android.content.Intent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.core.net.toUri
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.chelsea.markethub.ui.theme.Pink80
import com.chelsea.markethub.ui.theme.YellowWhite80


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun IntentScreen(navController: NavController){

    val mContext = LocalContext.current

    Column(
        modifier = Modifier.fillMaxSize()
    ) {
//TopAppBar
        TopAppBar(
            title ={ Text(text = "Home")},
            navigationIcon = {
                IconButton(
                    onClick = {}) {
                    Icon(
                        imageVector = Icons.Default.Menu,
                        contentDescription = "Menu"
                    ) }
            },

            actions = {
                IconButton(
                    onClick = {}) {
                    Icon(
                        imageVector = Icons.Default.ShoppingCart,
                        contentDescription = ""
                    ) }

                IconButton(
                    onClick = {}) {
                    Icon(
                        imageVector = Icons.Default.Notifications,
                        contentDescription = ""
                    ) }

                IconButton(
                    onClick = {}) {
                    Icon(
                        imageVector = Icons.Default.Share,
                        contentDescription = ""
                    ) }
            },

            colors = TopAppBarDefaults.topAppBarColors(
                containerColor = Pink80,
                navigationIconContentColor = Color.White,
                titleContentColor = Color.White,
                actionIconContentColor = Color.White,
            )


        )

        Button(
            onClick = {
                val simToolKitLaunchIntent =
                    mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                simToolKitLaunchIntent?.let { mContext.startActivity(it) }

            },
            colors = ButtonDefaults.buttonColors(   YellowWhite80),
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier.width(350.dp)
        )
        {
            Text(
                text = "Pay Via Mpesa"
            )

        }

        Button(
            onClick = {
                val smsIntent=Intent(Intent.ACTION_SENDTO)
                smsIntent.data="smsto:0720245837".toUri()
                smsIntent.putExtra("sms_body","Hello Glory,how was your day?")
                mContext.startActivity(smsIntent)

            },
            colors = ButtonDefaults.buttonColors(   YellowWhite80),
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier.width(350.dp)
        )
        {
            Text(
                text = "Send Message"
            )

        }
        Button(
            onClick = {
                val callIntent= Intent(Intent.ACTION_DIAL)
                callIntent.data="tel:0720245837".toUri()
                mContext.startActivity(callIntent)

            },
            colors = ButtonDefaults.buttonColors(   YellowWhite80),
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier.width(350.dp)
        )
        {
            Text(
                text = "Call"
            )

        }

        Button(
            onClick = {
                val shareIntent = Intent(Intent.ACTION_SEND)
                shareIntent.type = "text/plain"
                shareIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf("akinyiglory2@gmail.com"))
                shareIntent.putExtra(Intent.EXTRA_SUBJECT, "subject")
                shareIntent.putExtra(Intent.EXTRA_TEXT, "Hello, this is the email body")
                mContext.startActivity(shareIntent)
            },
            colors = ButtonDefaults.buttonColors(   YellowWhite80),
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier.width(350.dp)
        )
        {
            Text(
                text = "Share"
            )

        }
        Button(
            onClick = {
                val shareIntent=Intent(Intent.ACTION_SEND)
                shareIntent.type="text/plain"
                shareIntent.putExtra(Intent.EXTRA_TEXT, "https://github.com/gloryakinyi")
                mContext.startActivity(Intent.createChooser(shareIntent, "Share"))
            },
            colors = ButtonDefaults.buttonColors(   YellowWhite80),
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier.width(350.dp)
        )
        {
            Text(
                text = "Share"
            )

        }
        }


    }




@Preview (showBackground =true)
@Composable
fun intentScreenPreview(){
    IntentScreen(rememberNavController())
}


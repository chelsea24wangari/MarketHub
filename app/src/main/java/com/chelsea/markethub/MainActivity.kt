package com.chelsea.markethub

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.chelsea.markethub.ui.navigation.AppNavHost
import com.chelsea.markethub.ui.theme.MarketHubTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MarketHubTheme {
                AppNavHost()
            }
        }
    }
}

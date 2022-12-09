package com.letspracticeskills.ahmedezzulddin.sootheappyt

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.ui.Modifier
import com.letspracticeskills.ahmedezzulddin.sootheappyt.ui.theme.SootheAppYTTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SootheAppYTTheme {
                // A surface container using the 'background' color from the theme
                Scaffold(
                  bottomBar = {navigationComponent()}
                ) { paddingValues ->
                    homeScreen(modifier = Modifier.padding(paddingValues))


                }
                //homeScreen()

            }
        }
    }
}


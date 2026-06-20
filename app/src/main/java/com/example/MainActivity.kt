package com.example

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        // This works perfectly with the built-in theme we set in the Manifest
        enableEdgeToEdge() 
        
        setContent {
            // Uses the standard built-in Material 3 theme
            MaterialTheme {
                Surface {
                    // TODO: Replace this with the actual name of your main screen
                    // For example: GalleryApp() or MainScreen()
                }
            }
        }
    }
}

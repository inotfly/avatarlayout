package com.example.composeproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Text
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                AvatarScreen()
            }
        }
    }
}

@Composable
fun AvatarScreen() {
    // state tiap komponen
    var showRambut by remember { mutableStateOf(true) }
    var showMata by remember { mutableStateOf(true) }
    var showHidung by remember { mutableStateOf(true) }
    var showMulut by remember { mutableStateOf(true) }
    var showAnting by remember { mutableStateOf(false) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Avatar (susunan layer)
        Box(modifier = Modifier.size(250.dp)) {
            Image(
                painter = painterResource(id = R.drawable.kepala),
                contentDescription = "Kepala",
                modifier = Modifier.fillMaxSize()
            )
            if (showRambut) {
                Image(
                    painter = painterResource(id = R.drawable.rambut),
                    contentDescription = "Rambut",
                    modifier = Modifier.fillMaxSize()
                )
            }
            if (showMata) {
                Image(
                    painter = painterResource(id = R.drawable.mata),
                    contentDescription = "Mata",
                    modifier = Modifier.fillMaxSize()
                )
            }
            if (showHidung) {
                Image(
                    painter = painterResource(id = R.drawable.hidung),
                    contentDescription = "Hidung",
                    modifier = Modifier.fillMaxSize()
                )
            }
            if (showMulut) {
                Image(
                    painter = painterResource(id = R.drawable.mulut),
                    contentDescription = "Mulut",
                    modifier = Modifier.fillMaxSize()
                )
            }
            if (showAnting) {
                Image(
                    painter = painterResource(id = R.drawable.anting),
                    contentDescription = "Anting",
                    modifier = Modifier.fillMaxSize()
                )
            }
        }

        Spacer(modifier = Modifier.height(24.dp))

        // Checkbox kontrol
        Column(horizontalAlignment = Alignment.Start) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Checkbox(checked = showRambut, onCheckedChange = { showRambut = it })
                Text("Tampilkan Rambut")
            }
            Row(verticalAlignment = Alignment.CenterVertically) {
                Checkbox(checked = showMata, onCheckedChange = { showMata = it })
                Text("Tampilkan Mata")
            }
            Row(verticalAlignment = Alignment.CenterVertically) {
                Checkbox(checked = showHidung, onCheckedChange = { showHidung = it })
                Text("Tampilkan Hidung")
            }
            Row(verticalAlignment = Alignment.CenterVertically) {
                Checkbox(checked = showMulut, onCheckedChange = { showMulut = it })
                Text("Tampilkan Mulut")
            }
            Row(verticalAlignment = Alignment.CenterVertically) {
                Checkbox(checked = showAnting, onCheckedChange = { showAnting = it })
                Text("Tampilkan Anting")
            }
        }
    }
}

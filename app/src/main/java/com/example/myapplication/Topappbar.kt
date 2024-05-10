package com.example.myapplication

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun TopAppBarWithBackButton(
    title: String,
    onBackPressed: () -> Unit
) {
    TopAppBar(
        title = { Text(text = title) },
        backgroundColor = Color.Blue,
        navigationIcon = {
            IconButton(onClick = { onBackPressed() }) {
                Icon(
                    imageVector =Icons.Default.ArrowBack,
                    contentDescription = "Back"
                )
            }
        }
    )
}

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun ScreenContent(
    title: String,
    onBackPressed: () -> Unit
) {
    Scaffold(
        topBar = {
            TopAppBarWithBackButton(
                title = title,
                onBackPressed = onBackPressed
            )
        },
        content = {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(text = "Content of $title Screen")
            }
        }
    )
}

@Preview
@Composable
fun PreviewScreenContent() {
    ScreenContent(title = "Sample Screen", onBackPressed = {})
}
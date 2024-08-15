package com.example.mayapp.ui.theme.screens.home


import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import com.example.mayapp.navigation.ADD_PRODUCTS_URL
import com.example.mayapp.navigation.VIEW_PRODUCTS_URL


@Composable
fun HomeScreen(navController: NavController){

    Column (modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center){


        Button(onClick = {
            navController.navigate(ADD_PRODUCTS_URL)
        }) {
            Text(text = "ADD")
        }

        Button(onClick = {
            navController.navigate(VIEW_PRODUCTS_URL)
        }) {
            Text(text = "VIEW")
        }

    }


}

@Composable
@Preview(showBackground = true)
fun HomeScreenPreview(){

}


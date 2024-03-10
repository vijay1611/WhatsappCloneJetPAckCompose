package com.vijay.whatsappclonejpc.ui.Screens

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import com.vijay.whatsappclonejpc.ui.Components.AppBarComponent
import com.vijay.whatsappclonejpc.ui.Components.TabComponent

@Composable
fun HomeScreen() {
    Column {
        AppBarComponent()
        TabComponent()
    }
}
package com.vijay.whatsappclonejpc.ui.Components

import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.vijay.whatsappclonejpc.R
import com.vijay.whatsappclonejpc.ui.theme.gray


@Composable
fun AppBarComponent(){
    Row (
        modifier = Modifier
            .fillMaxWidth()
            .height(60.dp)
            .background(MaterialTheme.colorScheme.primary)
            .padding(16.dp),
        verticalAlignment = Alignment.CenterVertically

    ){
        Text(text = stringResource(id = R.string.whatsappTitle),
            style = TextStyle(
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.tertiary))
        Spacer(modifier = Modifier.weight(1f))
        IconComponent(R.drawable.camera_icon)
        Spacer(modifier = Modifier.size(20.dp))
        IconComponent(R.drawable.search_icon)
        Spacer(modifier = Modifier.size(20.dp))
        IconComponent(R.drawable.more_icon)

    }
}

@Composable
fun IconComponent(cameraIcon: Int) {
    Icon(painter = painterResource(id = cameraIcon),
        contentDescription = "",
        tint = MaterialTheme.colorScheme.tertiary
        )
}

@Preview(showBackground = false)
@Composable
fun AppBar(){
    AppBarComponent()
}
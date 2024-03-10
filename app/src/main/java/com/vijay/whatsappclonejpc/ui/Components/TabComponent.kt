package com.vijay.whatsappclonejpc.ui.Components

import android.graphics.fonts.FontStyle
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.TabRowDefaults
import androidx.compose.material3.TabRowDefaults.tabIndicatorOffset
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.vijay.whatsappclonejpc.data.TabData
import com.vijay.whatsappclonejpc.data.tabs

@Composable
fun TabComponent(){

    var selectedIndex by remember {
        mutableStateOf(0)
    }

    TabRow(
        selectedTabIndex = selectedIndex,
        modifier = Modifier.fillMaxWidth(),
        containerColor = MaterialTheme.colorScheme.primary,
        contentColor = MaterialTheme.colorScheme.tertiary,
        indicator = { tabPosition ->
            TabRowDefaults.Indicator(
                modifier = Modifier.tabIndicatorOffset(tabPosition[selectedIndex]),
                color = MaterialTheme.colorScheme.tertiary,
                height = 4.dp
            )
        }
        ) {
        tabs.forEachIndexed{index, tabData ->
            Tab(selected = index==selectedIndex,
                onClick = {
                    selectedIndex =index
                },
                text = {
                    if(tabData.unreadCount==null) {
                        TabTitle(title = tabData.title)
                    }else{
                        TabWithUnreadCount(tabData = tabData)
                    }
                }

                )
        }
    }
}
@Composable
fun TabTitle(title:String){
    Text(
        text = title,
        style = TextStyle(fontSize = 16.sp)
        )
}

@Composable
fun TabWithUnreadCount(tabData: TabData){
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
        TabTitle(title = tabData.title)

        tabData.unreadCount.also {unreadCount->
          Text(text = unreadCount.toString(),
              modifier = Modifier
                  .padding(4.dp)
                  .size(18.dp)
                  .clip(CircleShape)
                  .background(MaterialTheme.colorScheme.background),
              style = TextStyle(
                  color=MaterialTheme.colorScheme.primary,
                  textAlign = TextAlign.Center,
                  fontSize = 12.sp
              )
              )
        }
    }
}
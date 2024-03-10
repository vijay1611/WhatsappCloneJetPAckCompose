package com.vijay.whatsappclonejpc.data

data class TabData(
    val title : String,
    val unreadCount : Int?
)

val tabs = listOf<TabData>(
    TabData(title = Tabs.CHATS.value,unreadCount = 12),
    TabData(title = Tabs.STATUS.value,unreadCount = 55),
    TabData(title = Tabs.CALLS.value,unreadCount = 4)
    )



enum class Tabs(val value : String){
    CHATS("Chats"),
    STATUS("Status"),
    CALLS("Calls")
}
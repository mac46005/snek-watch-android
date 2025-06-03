package com.example.snek_watch_android.ui.navigation


private fun argumentFormat(argument: String): String = "{$argument}"
object HomeRoute: IRoute {
    override val route: String = "home";
    override val title: String = "Snek Watch"
    override val arguments: Array<String> = arrayOf()
}
package com.example.snek_watch_android.ui.navigation
private interface IRoute {
    val baseRoute: String
    val arguments: Array<String>
    fun getRoute(): String
}

private abstract class Route : IRoute {
    override fun getRoute(): String {
        for(String arg: this.arguments) {

        }
    }
}


private fun argumentFormat(argument: String): String = "{$argument}"
object HomeRoute: IRoute {
    override val baseRoute: String = ""
    override val arguments: Array<String> = arrayOf()
    override fun getRoute(): String {
        TODO("Not yet implemented")
    }
}

object SnakeEditorRoute : IRoute {
    override val baseRoute: String = ""
    override val arguments: Array<String> = arrayOf()
    override fun getRoute(): String {
        TODO("Not yet implemented")
    }
}
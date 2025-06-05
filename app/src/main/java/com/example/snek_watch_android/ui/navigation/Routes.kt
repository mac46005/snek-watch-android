package com.example.snek_watch_android.ui.navigation

public sealed class Route(
    private val baseName: String,
    private val arguments: Array<String>
){

    public object Home: Route("home", arrayOf())
    public object SnakeEditor: Route("snake-editory", arrayOf("id"))
    fun getRoute(): String {
        val sb: StringBuilder = StringBuilder(baseName)

        if (arguments.isNotEmpty()) {
            arguments.forEach { argument ->
                sb.append("/${argumentFormatter(argument)}")
            }
        }

        return sb.toString()
    }

    fun getRouteWithArgs(
        arguments: Array<String>
    ): String {
        val sb: StringBuilder = StringBuilder(baseName)
        if (arguments.isNotEmpty()) {
            arguments.forEach { argument ->
                sb.append("/$argument")
            }
        }
        return sb.toString()
    }

    companion object {
        private fun argumentFormatter(argument: String): String {
            return "{$argument}";
        }
    }

}
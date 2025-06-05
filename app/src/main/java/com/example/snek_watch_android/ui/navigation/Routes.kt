package com.example.snek_watch_android.ui.navigation

import androidx.navigation.NamedNavArgument
import androidx.navigation.NavArgument
import androidx.navigation.NavType
import androidx.navigation.navArgument

public sealed class Route(
    private val baseName: String,
    private val arguments: Array<Argument>
){

    public object Home: Route(
        "home",
        arrayOf()
    )

    public object SnakeEditor: Route(
        "snake-editory",
        arrayOf(
            Argument(
                "id",
                navArgument(
                    "id"
                ) {
                    type = NavType.LongType
                    defaultValue = 0
                    nullable = true
                }
            )
        )
    )
    fun getRoute(): String {
        val sb: StringBuilder = StringBuilder(baseName)

        if (arguments.isNotEmpty()) {
            arguments.forEach { argument ->
                sb.append("/${argumentFormatter(argument.getName())}")
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

    fun getNamedNavArguments(): List<NamedNavArgument> {
        val listOfNamedNavArgument = mutableListOf<NamedNavArgument>()

        arguments.forEach { argument ->
            listOfNamedNavArgument.add(argument.getNavArgument());
        }

        return listOfNamedNavArgument.toList()
    }


    companion object {
        private fun argumentFormatter(argument: String): String {
            return "{$argument}";
        }
    }


    public class Argument(
        private val name: String,
        private val navArgument: NamedNavArgument
    ) {
        public fun getName(): String = name;
        public fun getNavArgument(): NamedNavArgument = navArgument;
    }
}
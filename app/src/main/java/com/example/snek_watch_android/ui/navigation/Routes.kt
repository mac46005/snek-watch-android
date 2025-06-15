package com.example.snek_watch_android.ui.navigation

import androidx.navigation.NamedNavArgument
import androidx.navigation.NavType
import androidx.navigation.navArgument

object Routes {

    val home = Route(
        "home",
        listOf()
    )

    val snakeEditor = Route(
        "snake-editor",
        listOf(
            Argument(
                "id",
                navArgument(
                    "id"
                ) {
                    type = NavType.LongType
                    defaultValue = 0
                }
            )
        )
    )

    private fun formatArgument(argument: String): String {
        return "{$argument}"
    }

    data class Route(
        val baseName: String,
        val arguments: List<Argument>
    ) {
        fun getRoute(): String {
            val sb = StringBuilder(baseName)

            if (arguments.isNotEmpty()) {
                arguments.forEach{ argument ->
                    sb.append("/${formatArgument(argument.name)}")
                }
            }

            return sb.toString()
        }
        fun getRouteWithArgs(arguments: List<String>): String {
            val sb = StringBuilder(baseName)
            if (arguments.isNotEmpty()) {
                arguments.forEach { argument ->
                    sb.append(("/${argument.toString()}"))
                }
            }
            return sb.toString()
        }
        fun getNamedNavArguments(): List<NamedNavArgument> {
            val list = mutableListOf<NamedNavArgument>()

            arguments.forEach { argument ->
                list.add(argument.namedNavArgument)
            }

            return list
        }
    }

    data class Argument(
        val name: String,
        val namedNavArgument: NamedNavArgument
    )
}
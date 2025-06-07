package com.example.snek_watch_android.ui.navigation

import androidx.navigation.NamedNavArgument
import androidx.navigation.NavType
import androidx.navigation.navArgument

//public sealed class Routes(
//    private val baseName: String,
//    private val arguments: Array<Argument>
//){
//
//    public object Home: Routes(
//        "home",
//        arrayOf()
//    )
//
//    public object SnakeEditor: Routes(
//        "snake-editor",
//        arrayOf(
//            Argument(
//                "id",
//                navArgument(
//                    "id"
//                ) {
//                    type = NavType.LongType
//                    defaultValue = 0
//                    nullable = true
//                }
//            )
//        )
//    )
//    fun getRoute(): String {
//        val sb: StringBuilder = StringBuilder(baseName)
//
//        if (arguments.isNotEmpty()) {
//            arguments.forEach { argument ->
//                sb.append("/${argumentFormatter(argument.getName())}")
//            }
//        }
//
//        return sb.toString()
//    }
//
//    fun getRouteWithArgs(
//        arguments: Array<String>
//    ): String {
//        val sb: StringBuilder = StringBuilder(baseName)
//        if (arguments.isNotEmpty()) {
//            arguments.forEach { argument ->
//                sb.append("/$argument")
//            }
//        }
//        return sb.toString()
//    }
//
//    fun getNamedNavArguments(): List<NamedNavArgument> {
//        val listOfNamedNavArgument = mutableListOf<NamedNavArgument>()
//
//        arguments.forEach { argument ->
//            listOfNamedNavArgument.add(argument.getNavArgument());
//        }
//
//        return listOfNamedNavArgument.toList()
//    }
//
//
//    companion object {
//        private fun argumentFormatter(argument: String): String {
//            return "{$argument}";
//        }
//    }
//
//
//    public class Argument(
//        private val name: String,
//        private val navArgument: NamedNavArgument
//    ) {
//        public fun getName(): String = name;
//        public fun getNavArgument(): NamedNavArgument = navArgument;
//    }
//}

public object Routes {
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


    public data class Route(
        val baseName: String,
        val arguments: List<Argument>
    ) {
        public fun getRoute(): String {
            val sb = StringBuilder(baseName)
            if (arguments.isNotEmpty()) {
                arguments.forEach{ argument ->
                    sb.append("/${formatArgument(argument.name)}")
                }
            }
            return sb.toString()
        }

        public fun getRouteWithArgs(arguments: List<String>): String {
            val sb = StringBuilder(baseName)
            if (arguments.isNotEmpty()) {
                arguments.forEach { argument ->
                    sb.append("/${argument.toString()}")
                }
            }
            return sb.toString()
        }

        public fun getNamedNavArguments(): List<NamedNavArgument> {
            val list = mutableListOf<NamedNavArgument>()
            arguments.forEach { argument ->
                list.add(argument.namedNavArgument)
            }
            return list
        }
    }

    public data class Argument(
        val name: String,
        val namedNavArgument: NamedNavArgument
    )
}
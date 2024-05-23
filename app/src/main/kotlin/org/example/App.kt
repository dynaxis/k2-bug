package org.example

import org.other.AClass
import org.other.BClass

fun main(vararg args: String) {
    val temp = if (args.isEmpty()) AClass() else BClass()
    println(temp)
}

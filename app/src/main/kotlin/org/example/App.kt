package org.example

import org.other.AClass
import org.other.BClass
import org.other.PublicSuper

var temp: PublicSuper? = null

fun main(vararg args: String) {
    temp = if (args.isEmpty()) AClass() else BClass()
    println(temp)
}

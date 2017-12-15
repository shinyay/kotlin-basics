package com.shinyay.sample.variable

fun main(args: Array<String>) {
    println(varVariable("hoge"))
    println(valVariable("hoge"))

    numVariable()

    multipleLine()

    stringTemplate("ことりん")
}

fun varVariable(arg: String): String {

    var mutableValue = "foo"
    mutableValue = arg
    return mutableValue

}

fun valVariable(arg: String): String {

    val immutableValue = "bar"
    //immutableValue = arg
    return immutableValue
}

fun numVariable() {

    val myLong = 10L
    val myFloat = 20F
    val myHex = 0x0F
    val myBinary = 0b01
    val myString1 = "10"
    val myString2 = "20"

    println(myLong)
    println(myFloat)
    println(myHex)
    println(myBinary)
    println(myString1.toInt() + myString2.toInt())
}

fun multipleLine() {
    val multipleLine = """
        １行目
        ２行目
        ３行目
        """
    println(multipleLine)
}

fun stringTemplate(arg: String) {
    println("入力したパラメータは「${arg}」です")
}
// IGNORE_BACKEND: JS_IR
fun box(): String {
    val l = ArrayList<Int>()
    l.add(1)
    var x = l[0]
    var y = l[0]
    l[0]++
    ++l[0]
    x++
    ++y
    if (l[0] != 3) return "Fail: ${l[0]}"
    if (x != 2) return "Fail x: $x"
    if (y != 2) return "Fail y: $y"
    return "OK"
}
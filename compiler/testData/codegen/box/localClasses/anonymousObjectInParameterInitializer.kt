// IGNORE_BACKEND: JS_IR
class A(
        val a: String = object {
            override fun toString(): String = "OK"
        }.toString()
)

fun box() : String {
    return A().a
}
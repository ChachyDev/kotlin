// IGNORE_BACKEND: WASM
class A {
    val x: Any get() {
        return object : Inner() {
            override fun toString() = foo()
        }
    }

    open inner class Inner
    fun foo() = "OK"
}

fun box(): String = A().x.toString()

// IGNORE_BACKEND: WASM
fun Any.foo() = 1

class A {
    companion object
}

fun box() = if (A.foo() == 1) "OK" else "fail"

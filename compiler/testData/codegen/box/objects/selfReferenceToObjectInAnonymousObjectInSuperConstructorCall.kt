// IGNORE_BACKEND: WASM
interface IFn {
    operator fun invoke(): String
}

abstract class Base(val fn: IFn)

object Test : Base(
        object : IFn {
            override fun invoke(): String = Test.ok()
        }
) {
    fun ok() = "OK"
}

fun box() = Test.fn()
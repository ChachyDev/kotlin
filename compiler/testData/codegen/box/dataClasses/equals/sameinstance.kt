// IGNORE_BACKEND: WASM
data class A(val arg: Any? = null)

fun box() : String {
  val a = A()
  val b = a
  return if(b == a) "OK" else "fail"
}
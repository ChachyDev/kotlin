fun useDeclaredVariables() {
    <!INITIALIZER_REQUIRED_FOR_DESTRUCTURING_DECLARATION!>val (a, b)<!>
    <!UNUSED_EXPRESSION, DEBUG_INFO_ELEMENT_WITH_ERROR_TYPE!>a<!>
    <!UNUSED_EXPRESSION, DEBUG_INFO_ELEMENT_WITH_ERROR_TYPE!>b<!>
}

fun checkersShouldRun() {
    <!INITIALIZER_REQUIRED_FOR_DESTRUCTURING_DECLARATION!>val (@A <!UNUSED_VARIABLE!>a<!>, <!UNDERSCORE_IS_RESERVED, UNUSED_VARIABLE!>_<!>)<!>
}

annotation class A
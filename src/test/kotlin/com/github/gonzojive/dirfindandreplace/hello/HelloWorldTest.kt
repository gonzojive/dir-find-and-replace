package com.github.gonzojive.dirfindandreplace.hello

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class HelloWorldTest {
    @Test
    fun testGreeting() {
        assertThat(getGreeting()).isEqualTo("Hello, world!")
    }
}

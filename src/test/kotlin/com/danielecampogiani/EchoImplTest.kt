package com.danielecampogiani

import kotlin.test.Test
import kotlin.test.assertEquals

class EchoImplTest {

    private val sut = EchoImpl()

    @Test
    fun echo() {
        val result = sut.echo("input")
        assertEquals("input", result)
    }
}
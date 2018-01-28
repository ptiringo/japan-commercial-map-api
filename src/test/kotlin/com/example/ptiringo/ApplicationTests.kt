package com.example.ptiringo

import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner

@RunWith(SpringRunner::class)
@SpringBootTest
class ApplicationTests {

    @Test
    fun contextLoads() {
        Thread.currentThread().contextClassLoader.getResourceAsStream("config.properties")
    }
}

package com.example.ptiringo

import org.junit.ClassRule
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner

import com.palantir.docker.compose.DockerComposeRule

@RunWith(SpringRunner::class)
@SpringBootTest
class ApplicationTests {

    companion object {
        @ClassRule @JvmField
        val docker: DockerComposeRule = DockerComposeRule.builder()
                .file("docker-compose.yml").build()
    }

    @Test
    fun contextLoads() {
        Thread.currentThread().contextClassLoader.getResourceAsStream("config.properties")
    }
}

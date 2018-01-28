package com.example.ptiringo.web

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.test.context.junit4.SpringRunner

@RunWith(SpringRunner::class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class GlobalControllerExceptionHandlerTest {

    @Autowired
    lateinit var template: TestRestTemplate

    @Test
    fun handleNotFound_notMappedUrl_return404() {
        val response = template.getForEntity("/notfound", GlobalControllerExceptionHandler.ApiError::class.java)
        assertThat(response.statusCodeValue).isEqualTo(404)
        assertThat(response.body.message).isEqualTo("Resource not found.")
        assertThat(response.body.code).isEqualTo("101")
    }

    @Test
    fun handleNotFound_underApiUrl_return404() {
        val response = template.getForEntity("/api/notfound", GlobalControllerExceptionHandler.ApiError::class.java)
        assertThat(response.statusCodeValue).isEqualTo(404)
        assertThat(response.body.message).isEqualTo("Resource not found.")
        assertThat(response.body.code).isEqualTo("101")
    }
}
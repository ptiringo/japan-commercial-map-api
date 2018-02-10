package com.example.ptiringo

import com.example.ptiringo.web.DowntownHandler
import com.example.ptiringo.web.router
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.support.beans

@SpringBootApplication
class Application

fun main(args: Array<String>) {
    runApplication<Application>(*args) {
        addInitializers(beans {
            bean<DowntownHandler>()
            bean {
                router(ref())
            }
        })
    }
}
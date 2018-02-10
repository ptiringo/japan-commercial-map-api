package com.example.ptiringo.web

import org.springframework.web.reactive.function.server.router

fun router(downtownHandler: DowntownHandler) = router {
    "/api".nest {
        GET("/downtowns", downtownHandler::all)
    }
}
package com.example.ptiringo.web

import com.example.ptiringo.domain.repository.DowntownRepository
import org.geojson.Feature
import org.geojson.FeatureCollection
import org.geojson.Point
import org.springframework.http.MediaType
import org.springframework.web.reactive.function.BodyInserters
import org.springframework.web.reactive.function.server.ServerRequest
import org.springframework.web.reactive.function.server.ServerResponse
import org.springframework.web.reactive.function.server.ServerResponse.ok
import reactor.core.publisher.Mono

class DowntownHandler(private val repository: DowntownRepository) {

    fun all(request: ServerRequest): Mono<ServerResponse> {
        val featureCollection = FeatureCollection()

        val all = repository.findAll().map { downtown ->
            val feature = Feature()
            feature.geometry = Point(downtown.longitude, downtown.latitude)
            feature.properties = mapOf(
                    "name" to downtown.name,
                    "commercialAccumulationCode" to downtown.commercialAccumulationCode,
                    "annualSalesTurnover" to downtown.annualSalesTurnover
            )
            feature
        }

        featureCollection.addAll(all)

        return ok().contentType(MediaType.APPLICATION_JSON_UTF8)
                .body(BodyInserters.fromObject(featureCollection))
    }
}
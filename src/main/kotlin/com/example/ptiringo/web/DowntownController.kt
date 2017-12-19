package com.example.ptiringo.web

import com.example.ptiringo.domain.repository.DowntownRepository
import org.geojson.Feature
import org.geojson.FeatureCollection
import org.geojson.Point
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/")
class DowntownController {

    @Autowired
    lateinit var repository: DowntownRepository

    @GetMapping("downtowns")
    fun all(model: Model): FeatureCollection {
        val featureCollection = FeatureCollection()

        val all = repository.findAll().forEach {downtown ->
            val feature = Feature()
            feature.geometry = Point(downtown.longitude, downtown.latitude)
            featureCollection.add(feature)
        }

        return featureCollection
    }
}
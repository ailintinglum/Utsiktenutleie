package com.utsiktenutleie.api.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class CabinController {

    @GetMapping("/cabins")
    fun cabins(): List<Map<String, Any>> = listOf(
        mapOf(
            "id" to 1,
            "name" to "Utsikten Cabin",
            "location" to "Bergen",
            "guests" to 6,
            "pricePerNight" to 2400
        ),
        mapOf(
            "id" to 2,
            "name" to "Fjord View Cabin",
            "location" to "Aurland",
            "guests" to 4,
            "pricePerNight" to 1900
        )
    )
}

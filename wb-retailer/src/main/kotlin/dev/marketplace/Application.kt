package dev.marketplace

import dev.marketplace.plugins.configureRouting
import dev.marketplace.plugins.configureSecurity
import dev.marketplace.plugins.configureSerialization
import dev.marketplace.plugins.configureTemplating
import io.ktor.server.engine.*
import io.ktor.server.jetty.*

fun main() {
    embeddedServer(Jetty, port = 8080, host = "0.0.0.0") {
        configureRouting()
        configureSecurity()
        configureTemplating()
        configureSerialization()
    }.start(wait = true)
}

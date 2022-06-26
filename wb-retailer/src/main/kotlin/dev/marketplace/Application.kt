package dev.marketplace

import com.typesafe.config.ConfigFactory
import dev.marketplace.plugins.configureRouting
import dev.marketplace.plugins.configureSecurity
import dev.marketplace.plugins.configureSerialization
import dev.marketplace.plugins.configureTemplating
import io.ktor.server.config.*
import io.ktor.server.engine.*
import io.ktor.server.jetty.*

fun main() {
    embeddedServer(Jetty, environment = applicationEngineEnvironment {
        config = HoconApplicationConfig(ConfigFactory.load())
        connector {
            port = 8081
            host = "0.0.0.0"
        }

    }).start(wait = true)
}

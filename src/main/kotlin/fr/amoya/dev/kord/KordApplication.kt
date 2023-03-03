package fr.amoya.dev.kord

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KordApplication

fun main(args: Array<String>) {
    runApplication<KordApplication>(*args)
}

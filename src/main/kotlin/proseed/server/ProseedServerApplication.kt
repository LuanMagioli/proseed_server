package proseed.server

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ProseedServerApplication

fun main(args: Array<String>) {
	runApplication<ProseedServerApplication>(*args)
}

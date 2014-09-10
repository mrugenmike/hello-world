package hello

import org.springframework.boot.SpringApplication

/**
 * Created by mrugen on 9/9/14.
 */


object HelloWorldApplication {
  def main(args: Array[String]) {
    SpringApplication.run(classOf[HelloWorldConfiguration])
  }
}

package hello
import org.springframework.web.bind.annotation._

/*
* Hello World Rest Constroller
* */
@RestController
class HelloWorldRestController {

  @RequestMapping(Array("/"))
  def home(): String = {
    "Hello World"
  }
}

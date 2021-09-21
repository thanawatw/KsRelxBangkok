package domon.shop.ksrelxbangkok;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class KsRelxBangkokController {

    @GetMapping("")
    public String index (){
        return "index";
    }
}

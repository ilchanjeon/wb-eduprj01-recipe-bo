package egovframework.example.sample.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("recipe")
public class RecipeController {

    @GetMapping("/{customerId}")
    public String getCustomerDetail(@PathVariable String customerId) {
        System.out.println("request customerId :" + customerId);
        return "[Customer id = " + customerId + " at " + System.currentTimeMillis() + "]";
    }

}

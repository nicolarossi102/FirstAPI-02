package co.develhope.First.API2.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/factorial")
public class FactorialController {

    @GetMapping("/{n}")
    public int getFactorial(@PathVariable int n){
        int factorial = n;
        for(int i = n-1; i > 0; i--){
            factorial = (factorial * i);
        }
        return factorial;
    }

}

package springBootProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import springBootProject.model.GlobalProperties;


@RestController
public class HomeController {
    @Autowired
    private GlobalProperties global;

    @RequestMapping("/")
    public String home(){
        return "Spring boot home";
    }

    @RequestMapping(value = "/test", method= RequestMethod.GET)
    public String test(){
        return "test function called \n" +
                "APP name: " + global.getName() +
                "APP company: " + global.getCompany();
    }


}
package com.example.firsttheme;

import com.example.firsttheme.service.GenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {


    @GetMapping("/index")
    public String index()
    {

        return "index";
    }




    @GetMapping("/elements")
        public String elements()
        {
            return "elements";

        }

        @Autowired private GenericService g22;

    @GetMapping("/generic")
    public String generic(Model model)
    {

        model.addAttribute("g1",g22.getGenerics());


        return "generic";

    }
}

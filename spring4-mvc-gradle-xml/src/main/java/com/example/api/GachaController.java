package com.example.api;

import com.example.service.GachaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api")
public class GachaController {

    @Autowired
    private GachaService gachaService;

    //@RequestMapping(value = "/gacha/{id}", method = RequestMethod.GET, produces = "application/json")
    @RequestMapping(value = "/gacha/{id}", method = RequestMethod.GET)
    public String gacha(@PathVariable int id) {
        return gachaService.version();
    }
}

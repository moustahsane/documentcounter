package com.veviosys.documentcounter;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
@CrossOrigin(origins = {"*"})
public class CounterController {

    private final CounterService counterService;

    public CounterController(CounterService counterService) {
        this.counterService = counterService;
    }

    @RequestMapping(value = "increase", method = RequestMethod.GET)
    public  void increase(@RequestParam(value = "count",required = false) Long count){
        counterService.increaseCount(count);
    }


}

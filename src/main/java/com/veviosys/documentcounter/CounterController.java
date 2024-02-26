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
    @RequestMapping(value = "currentValue", method = RequestMethod.GET)
    public  CurrentValue increase(){

        Long cont = counterService.currentValue();
        return new CurrentValue(cont);
    }


}


class CurrentValue{
    public CurrentValue(Long value){
        setValue(value);
    }
    private Long value;

    public Long getValue() {
        return value;
    }

    public void setValue(Long value) {
        this.value = value;
    }
}

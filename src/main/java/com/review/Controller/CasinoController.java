package com.review.Controller;

import com.review.Model.Casino;
import com.review.Service.CasinoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/")
public class CasinoController {
    private CasinoService casinoService;

    public CasinoController(CasinoService casinoService) {
        super();
        this.casinoService = casinoService;
    }

    @GetMapping("/test")
    public String Test(){
        return "Program is working fine.";
    }
    @GetMapping("/casinos")
    public List<Casino> Test2(){
        return casinoService.getAllCasinos();
    }
    @PostMapping("/casinos")
    public ResponseEntity saveCasino(@RequestBody Casino casino){
        return new ResponseEntity<Casino>(casinoService.saveCasino(casino), HttpStatus.CREATED);
    }

}

package com.review.Controller;

import com.review.Model.Casino;
import com.review.Service.CasinoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/casino")
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
    @GetMapping
    public List<Casino> Test2(){
        return casinoService.getAllCasinos();
    }
    @PostMapping
    public ResponseEntity saveCasino(@RequestBody Casino casino){
        return new ResponseEntity<Casino>(casinoService.saveCasino(casino), HttpStatus.CREATED);
    }
    @GetMapping("{id}")
    public ResponseEntity<Casino> getCasino(@PathVariable long id){
        return new ResponseEntity<Casino>(casinoService.getCasino(id),HttpStatus.OK);
    }
    @GetMapping("/name/{name}")
    public ResponseEntity<Casino> getCasinoByName(@PathVariable String name){
        System.out.println(name);
        return new ResponseEntity<Casino>(casinoService.getCasinoByName(name),HttpStatus.OK);
    }
    @PutMapping("{id}")
    public ResponseEntity<Casino> updateCasino(@PathVariable long id, @RequestBody Casino casino){
        return new ResponseEntity<Casino>(casinoService.updateCasino(casino,id),HttpStatus.OK);
    }
    @DeleteMapping("{id}")
    public ResponseEntity<Casino> deleteCasino(@PathVariable long id){
        return new ResponseEntity<Casino>(casinoService.deleteCasino(id),HttpStatus.OK);
    }

}

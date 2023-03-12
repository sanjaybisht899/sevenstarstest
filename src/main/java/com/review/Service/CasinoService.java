package com.review.Service;

import com.review.Model.Casino;

import java.util.List;
public interface CasinoService {
    List<Casino> getAllCasinos();
    Casino saveCasino(Casino casino);
    Casino getCasino(long id);
    Casino updateCasino(Casino casino,long id);
    Casino deleteCasino(long id);
    Casino getCasinoByName(String name);
}

package com.review.ServiceImpl;

import com.review.Model.Casino;
import com.review.Repository.CasinoRepository;
import com.review.Service.CasinoService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CasinoServiceImpl implements CasinoService {
    private CasinoRepository casinoRepository;

    public CasinoServiceImpl(CasinoRepository casinoRepository) {
        this.casinoRepository = casinoRepository;
    }

    @Override
    public List<Casino> getAllCasinos() {
        return casinoRepository.findAll();
    }

    @Override
    public Casino saveCasino(Casino casino) {
        return casinoRepository.save(casino);
    }
}

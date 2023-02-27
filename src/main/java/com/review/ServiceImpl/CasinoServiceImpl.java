package com.review.ServiceImpl;

import com.review.Exception.ResourceNotFoundException;
import com.review.Model.Casino;
import com.review.Repository.CasinoRepository;
import com.review.Service.CasinoService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    @Override
    public Casino getCasino(long id) {
//        Optional<Casino> temp = casinoRepository.findById(id);
//        if(temp.isPresent()){
//            return temp.get();
//        }
//        else{
//            throw new ResourceNotFoundException("Casino", "Id",id);
//        }
        return casinoRepository.findById(id).orElseThrow(
                ()-> new ResourceNotFoundException("Casino","Id",id)
        );
    }

    @Override
    public Casino updateCasino(Casino casino, long id) {
        Casino current = casinoRepository.findById(id).orElseThrow(
                ()-> new ResourceNotFoundException("Casino","Id",id)

        );
//        current.setName(casino.getName());
//        current.setHeading(casino.getHeading());
//        current.setDescription(casino.getDescription());
//        current.setStars(casino.getStars());
//        current.setUrl(casino.getUrl());
//        current.setRefURl(casino.getRefURl());
//        current.setGameTypes(casino.getGameTypes());
//
//        casinoRepository.save(current);
        casinoRepository.delete(current);
        casinoRepository.save(casino);
        return casino;
    }

    @Override
    public Casino deleteCasino(long id) {
        Casino current = casinoRepository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("Casino", "Id", id)
        );
        casinoRepository.delete(current);
        return current;
    }
}

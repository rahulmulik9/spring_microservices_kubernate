package com.rahul.cards_service.service;

import com.rahul.cards_service.repository.CardsRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CardsServiceImpl implements ICardsService{
    private CardsRepository cardsRepository;
}

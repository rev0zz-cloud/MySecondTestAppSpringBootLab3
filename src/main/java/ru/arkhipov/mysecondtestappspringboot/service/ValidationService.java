package ru.arkhipov.mysecondtestappspringboot.service;

import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import ru.arkhipov.mysecondtestappspringboot.exception.UnsupportedCodeException;
import ru.arkhipov.mysecondtestappspringboot.exception.ValidationFailedException;


@Service
public interface ValidationService {
    void isValid(BindingResult bindingResult) throws ValidationFailedException, UnsupportedCodeException;
}

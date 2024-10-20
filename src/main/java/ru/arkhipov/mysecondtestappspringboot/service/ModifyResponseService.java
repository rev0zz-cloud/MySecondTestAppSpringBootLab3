package ru.arkhipov.mysecondtestappspringboot.service;

import org.springframework.stereotype.Service;
import ru.arkhipov.mysecondtestappspringboot.model.Response;

@Service
public interface ModifyResponseService {
    Response modify(Response response);
}

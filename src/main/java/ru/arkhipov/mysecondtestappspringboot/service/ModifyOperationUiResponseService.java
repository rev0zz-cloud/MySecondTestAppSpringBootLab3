package ru.arkhipov.mysecondtestappspringboot.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import ru.arkhipov.mysecondtestappspringboot.model.Response;

import java.util.UUID;

@Service
@Qualifier("ModifyOperationUiResponseService")
public class ModifyOperationUiResponseService implements ModifyResponseService{
    @Override
    public Response modify(Response response)
    {
        UUID uuid = UUID.randomUUID();
        response.setOperationUid(uuid.toString());
        return response;
    }
}

package com.animeson.annet.services;

import com.animeson.annet.dto.ResponseDto;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class ResponseService {

    @Value("${SECRET}")
    private String SECRET;

    public Boolean response (ResponseDto responseDto){
        return responseDto.getResponse().equals(SECRET);
    }
}

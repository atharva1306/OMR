package com.GTasterix.OMR.Interface;

import com.GTasterix.OMR.dto.ResponseDto;

public interface ResponseService {
    ResponseDto addResponse(ResponseDto responseDto);

    ResponseDto getByRollno(Integer rollNumber);
}

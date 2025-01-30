package com.GTasterix.OMR.Interface;

import com.GTasterix.OMR.dto.ResponseDto;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface ResponseService {
    ResponseDto addResponse(ResponseDto responseDto, MultipartFile signature, MultipartFile invigilatorSignature) throws IOException;

//    ResponseDto getByRollno(Integer rollNumber);
}

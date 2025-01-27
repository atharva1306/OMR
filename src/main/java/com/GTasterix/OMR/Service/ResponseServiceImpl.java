package com.GTasterix.OMR.Service;

import com.GTasterix.OMR.Interface.ResponseService;
import com.GTasterix.OMR.Repository.ResponseRepository;
import com.GTasterix.OMR.dto.ResponseDto;
import com.GTasterix.OMR.model.Response;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class ResponseServiceImpl implements ResponseService {

    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    ResponseRepository responseRepository;
    @Override
    public ResponseDto addResponse(ResponseDto responseDto) {
        Response response = modelMapper.map(responseDto,Response.class);

        Response SavedResponse = responseRepository.save(response);
        return modelMapper.map(SavedResponse,ResponseDto.class);

    }

    @Override
    public ResponseDto getByRollno(Integer rollNumber) {
        Response response = responseRepository.findByRollNumber(rollNumber);
        return modelMapper.map(response,ResponseDto.class);

    }
}

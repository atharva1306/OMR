package com.GTasterix.OMR.Service;

import com.GTasterix.OMR.Interface.ResponseService;
import com.GTasterix.OMR.Repository.ResponseRepository;
import com.GTasterix.OMR.dto.ResponseDto;
import com.GTasterix.OMR.model.Response;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Service
public class ResponseServiceImpl implements ResponseService {

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private ResponseRepository responseRepository;

    @Override
    public ResponseDto addResponse(ResponseDto responseDto, MultipartFile signature, MultipartFile invigilatorSign) {
        try {
            // Convert MultipartFiles to byte arrays
            byte[] sign = signature.getBytes();
            byte[] iSign = invigilatorSign.getBytes();

            // Ensure signatures are not empty
            if (sign.length == 0 || iSign.length == 0) {
                throw new RuntimeException("Signature files cannot be empty.");
            }

            responseDto.setSignature(sign);
            responseDto.setInvigilatorSignature(iSign);

            // Convert DTO to entity
            Response response = modelMapper.map(responseDto, Response.class);

            // Save to database
            Response savedResponse = responseRepository.save(response);

            // Return mapped DTO
            return modelMapper.map(savedResponse, ResponseDto.class);

        } catch (IOException e) {
            throw new RuntimeException("Error processing response files: " + e.getMessage(), e);
        } catch (Exception e) {
            throw new RuntimeException("An error occurred while saving the response: " + e.getMessage(), e);
        }
    }



//    @Override
//    public ResponseDto getByRollno(Integer rollNumber) {
//        Response response = responseRepository.findByRollNumber(rollNumber);
//        return modelMapper.map(response,ResponseDto.class);
//
//    }
}

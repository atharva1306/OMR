package com.GTasterix.OMR.controller;

import com.GTasterix.OMR.Interface.ResponseService;
import com.GTasterix.OMR.dto.BaseResponseDto;
import com.GTasterix.OMR.dto.ResponseDto;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/student")
public class ResponseController {
    @Autowired
   private  ResponseService responseService;

    @PostMapping("/add")
    public ResponseEntity<BaseResponseDto> addStudent(@RequestPart String responseString, @RequestPart MultipartFile signature, @RequestPart MultipartFile invigilatorSign) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            ResponseDto responseDto = objectMapper.readValue(responseString,ResponseDto.class);
            ResponseDto responseDto1 = responseService.addResponse(responseDto,signature,invigilatorSign);
            BaseResponseDto baseResponseDto = new BaseResponseDto("OMR Saves Successfully", responseDto1, false);
            return new ResponseEntity<>(baseResponseDto, HttpStatus.CREATED);
        } catch (Exception e) {
            BaseResponseDto baseResponseDto = new BaseResponseDto("Error saving OMR", e.getMessage(), true);
            return new ResponseEntity<>(baseResponseDto, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

//    @GetMapping("/{id}")
//    public ResponseEntity<BaseResponseDto> getByRollno(@PathVariable Integer rollNumber) {
//        try {
//            ResponseDto responseDto = responseService.getByRollno(rollNumber);
//            BaseResponseDto baseResponseDto = new BaseResponseDto("OMR found", responseDto, false);
//            return new ResponseEntity<>(baseResponseDto, HttpStatus.OK);
//        } catch (Exception e) {
//            BaseResponseDto baseResponseDto = new BaseResponseDto("OMR not found", e.getMessage(), true);
//            return new ResponseEntity<>(baseResponseDto, HttpStatus.INTERNAL_SERVER_ERROR);
//        }
//    }
}
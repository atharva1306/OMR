package com.GTasterix.OMR.controller;

import com.GTasterix.OMR.Interface.ResponseService;
import com.GTasterix.OMR.dto.BaseResponseDto;
import com.GTasterix.OMR.dto.ResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class ResponseController {
    @Autowired
   private  ResponseService responseService;

    @PostMapping("/add")
    public ResponseEntity<BaseResponseDto> addStudent(@RequestBody ResponseDto responseDto) {
        try {
            ResponseDto responseDto1 = responseService.addResponse(responseDto);
            BaseResponseDto baseResponseDto = new BaseResponseDto("OMR Saves Successfully", responseDto1, false);
            return new ResponseEntity<>(baseResponseDto, HttpStatus.CREATED);
        } catch (Exception e) {
            BaseResponseDto baseResponseDto = new BaseResponseDto("Error saving OMR", e.getMessage(), true);
            return new ResponseEntity<>(baseResponseDto, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<BaseResponseDto> getByRollno(@PathVariable Integer rollNumber) {
        try {
            ResponseDto responseDto = responseService.getByRollno(rollNumber);
            BaseResponseDto baseResponseDto = new BaseResponseDto("OMR found", responseDto, false);
            return new ResponseEntity<>(baseResponseDto, HttpStatus.OK);
        } catch (Exception e) {
            BaseResponseDto baseResponseDto = new BaseResponseDto("OMR not found", e.getMessage(), true);
            return new ResponseEntity<>(baseResponseDto, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
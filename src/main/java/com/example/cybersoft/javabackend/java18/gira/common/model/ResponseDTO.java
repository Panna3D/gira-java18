package com.example.cybersoft.javabackend.java18.gira.common.model;

import lombok.Builder;
import lombok.Getter;

import java.util.List;
@Getter
@Builder
public class ResponseDTO {
    private Object content; // DataType Object để nhận vào tất cả dữ liệu
    private boolean hasErrors;
    private List<String> errors;
    private String timestamp;
    private int status;
}


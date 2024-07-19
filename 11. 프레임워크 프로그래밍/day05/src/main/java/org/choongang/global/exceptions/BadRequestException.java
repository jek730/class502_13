package org.choongang.global.exceptions;

import org.springframework.http.HttpStatus;

import java.util.List;
import java.util.Map;

public class BadRequestException extends CommonException {
    public BadRequestException(String message) {  // 일반 메시지
        super(message, HttpStatus.BAD_REQUEST); // 400
    }

    public BadRequestException(Map<String, List<String>> errorMessages) {  // 커맨드 객체 검증 시 메시지
        super(null, HttpStatus.BAD_REQUEST);
        setErrorMessages(errorMessages);
    }
}
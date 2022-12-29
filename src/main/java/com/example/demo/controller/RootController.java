package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class RootController {

    @PostMapping("/")
    public ResponseEntity<?> rootControl(
    ) {
        return ResponseEntity.ok(
                "{\"msgType\":11006,\"errCode\":0,\"message\":\"\",\"sessToken\":\"\",\"data\":{\"environment\":40,\"key\":\"68c4e9c64453f81c5578badc3e47bcc8\",\"apiUrl\":\"https://chathowfitkr.azurewebsites.net\",\"webSocketUrl\":\"wss://chathowfitkr.azurewebsites.net\",\"versions\":[\"kt01.00.03\",\"kt01.00.02\",\"kt01.00.01\",\"kt01.00.00\",\"kt01.00.04\",\"a1.0.0\",\"i1.1.16\",\"a1.0.0\",\"i1.1.17\"],\"review\":[]}}"
        );
    }
}

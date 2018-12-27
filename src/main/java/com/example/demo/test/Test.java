package com.example.demo.test;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class Test {
    @Value("${hand.graphical.guzheng.img4}")
    private String img;

}

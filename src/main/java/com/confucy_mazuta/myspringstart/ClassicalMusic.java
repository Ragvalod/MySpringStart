package com.confucy_mazuta.myspringstart;

import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music {

    @Override
    public String getSong() {
        return "Тихо играет Моцарт!";
    }
}

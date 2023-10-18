package com.confucy_mazuta.myspringstart;

import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music{
    @Override
    public String getSong() {
        return "НевЪебенно ебашит РОК";
    }
}

package com.demo.service;

public class SadFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return "Nem tudo ocorre como queremos";
    }
}

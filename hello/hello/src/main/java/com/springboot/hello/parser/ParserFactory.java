package com.springboot.hello.parser;

import com.springboot.hello.domain.Hospital;
import com.springboot.hello.domain.dao.HospitalDao;
import org.springframework.context.annotation.Bean;

public class ParserFactory {

    @Bean
    public ReadLineContext<Hospital> hospitalReadLineContext() {
        return new ReadLineContext<Hospital>(new HospitalParser());
    }
}

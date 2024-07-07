package com.quid.mariavt.simple;

import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Repository;

public interface SimpleRepository {

    String find500ms();

    @Repository
    @RequiredArgsConstructor
    class SimpleRepositoryImpl implements SimpleRepository {

        private final JdbcClient jdbcClient;

        @Override
        public String find500ms() {
            String query = "SELECT SLEEP(1)";
            return jdbcClient.sql(query).query().singleValue().toString();
        }

    }
}

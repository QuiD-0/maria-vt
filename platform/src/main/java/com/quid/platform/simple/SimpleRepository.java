package com.quid.platform.simple;

import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Repository;

public interface SimpleRepository {

    String find500ms();

    @Repository
    class SimpleRepositoryImpl implements SimpleRepository {

        private final JdbcClient jdbcClient;

        public SimpleRepositoryImpl(JdbcClient jdbcClient) {
            this.jdbcClient = jdbcClient;
        }

        @Override
        public String find500ms() {
            String query = "SELECT SLEEP(1)";
            return jdbcClient.sql(query).query().singleValue().toString();
        }

    }
}

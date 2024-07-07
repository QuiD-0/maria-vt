package com.quid.virtual.simple;

import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Repository;

public interface SimpleRepository {

    String select();

    @Repository
    class SimpleRepositoryImpl implements SimpleRepository {

        private final JdbcClient jdbcClient;

        public SimpleRepositoryImpl(JdbcClient jdbcClient) {
            this.jdbcClient = jdbcClient;
        }

        @Override
        public String select() {
            String query = "SELECT SLEEP(1)";
            return jdbcClient.sql(query).query().singleValue().toString();
        }

    }
}

package com.dds.templatepattern;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class UserDao {

    private JdbcTemplate jdbcTemplate;

    public UserDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<?> list(){
       return this.jdbcTemplate.executeQuery("select * from user", null, new RowMapper() {
            @Override
            public User map(ResultSet rs) {
                try {
                    return new User(rs.getString("name"),rs.getInt("age"));
                } catch (SQLException e) {
                    e.printStackTrace();
                    return  null;
                }
            }
        });
    }


}

package com.dds.templatepattern;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public abstract class JdbcTemplate {

    private DataSource dataSource;

    public JdbcTemplate(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    private Connection getConnection() throws Exception {
        return this.dataSource.getConnection();
    }

    private PreparedStatement createPrepareStatement(Connection connection, String sql, Object[] values) throws Exception {
        PreparedStatement psmt = connection.prepareStatement(sql);
        if (values != null) {
            for (int i = 0; i < values.length; i++) {
                psmt.setObject(i, values[i]);
            }
        }
        return psmt;
    }

    private ResultSet createResultSet(PreparedStatement preparedStatement) throws Exception {
        return preparedStatement.executeQuery();
    }

    private List<?> processResult(ResultSet rs, RowMapper mapper) {
        List<Object> list = new ArrayList<>();
        try {
            while (rs.next()) {
                list.add(mapper.map(rs));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    private void closeResultSet(ResultSet rs) throws Exception {
        rs.close();
    }

    private void closeStatement(Statement stmt) throws Exception {
        stmt.close();
    }

    private void closeConnection(Connection connection) throws Exception {
        connection.close();
    }

    public List<?> executeQuery(String sql, Object[] values, RowMapper mapper) {
        Connection connection = null;
        List<Object> list = new ArrayList<Object>();
        try {
            connection = this.getConnection();
            PreparedStatement pstmt = this.createPrepareStatement(connection, sql, values);
            ResultSet rs = this.createResultSet(pstmt);
            return this.processResult(rs,mapper);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}

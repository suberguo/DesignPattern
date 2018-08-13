package com.dds.templatepattern;

import java.sql.ResultSet;

public interface RowMapper {
     <T> T map(ResultSet rs);
}

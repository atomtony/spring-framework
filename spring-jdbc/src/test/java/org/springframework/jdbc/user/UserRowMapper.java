package org.springframework.jdbc.user;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserRowMapper implements RowMapper {
	@Override
	public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
		User person = new User();
		person.setId(rs.getInt("id"));
		person.setName(rs.getString("name"));
		person.setAge(rs.getInt("age"));
		person.setSex(rs.getString("sex"));
		return person;
	}
}

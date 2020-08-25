package org.springframework.jdbc.user;

import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.sql.Types;
import java.util.List;

public class UserServiceImpl implements UserService {

	private JdbcTemplate jdbcTemplate;

	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
		this.jdbcTemplate.setFetchSize(12);
	}

	@Override
	public void save(User user) {
		jdbcTemplate.update("insert into jdbcuser (name,age,sex)values (?,?,?)",
				new Object[]{user.getName(), user.getAge(), user.getSex()},
				new int[]{Types.VARCHAR, Types.INTEGER, Types.VARCHAR});

		jdbcTemplate.update("insert into jdbcuser (name,age,sex)values (?,?,?)",
				new Object[]{user.getName(), user.getAge(), user.getSex()},
				new int[]{Types.VARCHAR, Types.INTEGER, Types.VARCHAR});

		//事务测试, 加上这句代码y!IJ 数据不会保存到数据库中
		throw new RuntimeException("aa");
	}

	@Override
	public List<User> getUsers() {
		List<User> list = jdbcTemplate.query("select * from jdbcuser", new UserRowMapper());
		return list;
	}

	@Override
	public User queryForObject() {
		return (User) jdbcTemplate.queryForObject("select * from jdbcuser where id = 1", new UserRowMapper());
	}

}

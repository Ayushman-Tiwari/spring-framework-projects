package com.ayushman.spring.springjdbc.employee.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.ayushman.spring.springjdbc.employee.dao.EmployeeDao;
import com.ayushman.spring.springjdbc.employee.dto.Employee;

@Component("employeeDao")
public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public int create(Employee employee) {

		String sql = "insert into Employee values(?,?,?)";

		int result = jdbcTemplate.update(sql, employee.getId(), employee.getFirstName(), employee.getLastName());

		return result;
	}

	@Override
	public int update(Employee employee) {
		String sql = "update Employee set firstname=?, lastname=? where id=?";

		int result = jdbcTemplate.update(sql, employee.getFirstName(), employee.getLastName(), employee.getId());

		return result;
	}

	@Override
	public int delete(int id) {

		String sql = "delete from Employee where id=?";

		int result = jdbcTemplate.update(sql, id);

		return result;
	}

	@Override
	public Employee read(int id) {

		String sql = "select * from Employee where id=?";

		Employee employee = jdbcTemplate.queryForObject(sql,

				new RowMapper<Employee>() {

					@Override
					public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {

						Employee emp = new Employee();
						emp.setId(rs.getInt(1));
						emp.setFirstName(rs.getString(2));
						emp.setLastName(rs.getString(3));

						return emp;
					}

				}, id);

		return employee;
	}

	@Override
	public List<Employee> read() {
		
		String sql = "select * from Employee";
		
		List<Employee> employees = jdbcTemplate.query(sql, 
				
				new RowMapper<Employee>() {

					@Override
					public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
						Employee emp = new Employee();
						emp.setId(rs.getInt(1));
						emp.setFirstName(rs.getString(2));
						emp.setLastName(rs.getString(3));

						return emp;
					}
			
		}
				
				);
		
		return employees;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

}

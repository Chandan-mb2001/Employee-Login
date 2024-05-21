package com.example.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.example.model.Employee;


@Repository
public class EmployeeDAOImpl implements EmployeeDAO {



    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Employee> getAllEmployeeCodes() {
        String sql = "SELECT code FROM employee";
        return jdbcTemplate.query(sql, new RowMapper<Employee>() {
            @Override
            public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
                Employee emp = new Employee();
                emp.setCode(rs.getString("code"));
                return emp;
            }
        });
    }

    @SuppressWarnings("deprecation")
	@Override
    public Employee getEmployeeByCode(String code) {
        String sql = "SELECT * FROM employee WHERE code = ?";
        return jdbcTemplate.queryForObject(sql, new Object[]{code}, new RowMapper<Employee>() {
            @Override
            public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
                Employee emp = new Employee();
                emp.setId(rs.getInt("id"));
                emp.setCode(rs.getString("code"));
                emp.setName(rs.getString("name"));
                emp.setPosition(rs.getString("position"));
                return emp;
            }
        });
    }
	

}

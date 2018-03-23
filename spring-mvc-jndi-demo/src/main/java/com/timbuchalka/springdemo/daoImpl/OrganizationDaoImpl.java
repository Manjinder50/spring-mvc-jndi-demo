package com.timbuchalka.springdemo.daoImpl;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.timbuchalka.springdemo.dao.OrganizationDao;
import com.timbuchalka.springdemo.domain.Organization;

public class OrganizationDaoImpl implements OrganizationDao {

	private JdbcTemplate jdbcTemplate;
	
	@Override
	public void setDataSource(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public boolean create(Organization org) {
		
		
		return false;
	}

	@Override
	public Organization getOrganization(Integer id) {
		
		
		return null;
	}

	@Override
	public List<Organization> getAllOrganizations() {
		String sqlQuery = "SELECT * FROM organization";
		List<Organization> orgList = jdbcTemplate.query(sqlQuery, new OrganizationRowMapper());
		
		return orgList;
	}

	@Override
	public boolean delete(Organization org) {
		
		
		return false;
	}

	@Override
	public boolean update(Organization org) {


		return false;
	}

	@Override
	public void cleanup() {
		

	}

}

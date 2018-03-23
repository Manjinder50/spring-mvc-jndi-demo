package com.timbuchalka.springdemo.dao;

import java.util.List;

import javax.sql.DataSource;

import com.timbuchalka.springdemo.domain.Organization;

public interface OrganizationDao {

	//Set the datasource that will be required  to create a connection to the database
	public void setDataSource(DataSource ds);
	
	//Create a record in the Organization table
	public boolean create(Organization org);
	
	//Return a aspecific Organization
	public Organization getOrganization(Integer id);
	
	//Retrieve all Organizations from the table
	List<Organization> getAllOrganizations();
	
	//Delete a specific Organization from the table
	public boolean delete(Organization org);
	
	//Update an existing Organization
	public boolean update(Organization org);
	
	//Delete all the Organizations
	public void cleanup();

}

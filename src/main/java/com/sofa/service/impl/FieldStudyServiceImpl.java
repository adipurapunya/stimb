package com.sofa.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.sofa.model.fieldstudy.FieldOfStudy;
import com.sofa.service.FieldStudyService;
import com.sofa.dao.FieldStudyDao;

@Service
public class FieldStudyServiceImpl implements FieldStudyService 
{
	@Autowired
	private FieldStudyDao fieldStudyDao;
	
	
	@Transactional
	public void add(FieldOfStudy fieldOfStudy) 
	{
		fieldStudyDao.add(fieldOfStudy);
	}

	@Transactional
	public void edit(FieldOfStudy fieldOfStudy) {
		fieldStudyDao.edit(fieldOfStudy);	
	}

	@Transactional
	public void delete(int fieldOfStudyId) {
		fieldStudyDao.delete(fieldOfStudyId);
	}

	@Transactional
	public FieldOfStudy getfieldOfStudy(int fieldOfStudyId) 
	{
		return fieldStudyDao.getfieldOfStudy(fieldOfStudyId);
	}

	@Transactional
	public List getAllfieldOfStudy() 
	{
		return fieldStudyDao.getAllfieldOfStudy();
	}

}

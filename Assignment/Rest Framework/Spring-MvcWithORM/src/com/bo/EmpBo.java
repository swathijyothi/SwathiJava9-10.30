package com.bo;

import com.bean.Employee;
import com.dao.EmpDao;

public class EmpBo {
	EmpDao empDao;
	
	public EmpDao getEmpDao() {
		return empDao;
	}

	public void setEmpDao(EmpDao empDao) {
		this.empDao = empDao;
	}

	public void insert(Employee e) {
		this.empDao.insert(e);
	}

}

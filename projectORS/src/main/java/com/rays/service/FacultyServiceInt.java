package com.rays.service;

import com.rays.common.BaseServiceInt;
import com.rays.common.UserContext;
import com.rays.dto.FacultyDTO;


/**
 * @author Mahak Sahu
 * 
 *
 */
public interface FacultyServiceInt extends BaseServiceInt<FacultyDTO> {

	public FacultyDTO findByEmail(String email, UserContext context);
}

package com.rays.service;

import com.rays.common.BaseServiceInt;
import com.rays.common.UserContext;
import com.rays.dto.SubjectDTO;


/**
 * @author Mahak Sahu
 *
 */
public interface SubjectServiceInt extends BaseServiceInt<SubjectDTO> {

	public SubjectDTO findByName(String name, UserContext context);
}

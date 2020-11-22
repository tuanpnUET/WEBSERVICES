package com.itplus.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.itplus.entity.Category;
import com.itplus.model.CategoryDTO;
import com.itplus.service.CategoryService;
import com.itplus.dao.CategoryDao;
public class CategoryServiceImpl implements CategoryService {

	@Override
	public List<CategoryDTO> getAll() {
		// TODO Auto-generated method stub
				List<CategoryDTO> listCategoryDTO = new ArrayList<CategoryDTO>();
				List<Category> listCategory = CategoryDao.getAll();
				for (Category category : listCategory) {
					CategoryDTO categoryDTO = new CategoryDTO();
					categoryDTO.setCategoryName(category.getCategoryName());
					categoryDTO.setDescription(category.getDescription());;
					listCategoryDTO.add(categoryDTO);
				}		
				return listCategoryDTO;
	}

}

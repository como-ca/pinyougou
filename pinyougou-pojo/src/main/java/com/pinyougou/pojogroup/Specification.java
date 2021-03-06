package com.pinyougou.pojogroup;

import java.io.Serializable;
import java.util.List;

import com.pinyougou.pojo.TbSpecification;
import com.pinyougou.pojo.TbSpecificationOption;
/**
 * 规格组合实体类
 * @author Administrator
 *
 */
public class Specification implements Serializable{

	//一对多的关系，一个规格对应多个对个选项
	private TbSpecification specification;    //规格选项
	
	private List<TbSpecificationOption> specificationOptionList;    //规格选项的集合

	public TbSpecification getSpecification() {
		return specification;
	}

	public void setSpecification(TbSpecification specification) {
		this.specification = specification;
	}

	public List<TbSpecificationOption> getSpecificationOptionList() {
		return specificationOptionList;
	}

	public void setSpecificationOptionList(List<TbSpecificationOption> specificationOptionList) {
		this.specificationOptionList = specificationOptionList;
	}
	
	
	
	
}

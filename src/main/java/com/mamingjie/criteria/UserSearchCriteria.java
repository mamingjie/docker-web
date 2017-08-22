package com.mamingjie.criteria;

import java.io.Serializable;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.data.jpa.domain.Specification;

import com.mamingjie.domain.User;

public class UserSearchCriteria extends BaseCriteria implements Serializable {

	private static final long serialVersionUID = -5203850486563985195L;

	private String name;

	private Integer sex;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getSex() {
		return sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	public Specification<User> getPredicate() {
		return new Specification<User>() {

			@Override
			public Predicate toPredicate(Root<User> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
				Predicate p1 = null;

				if (name != null) {
					Predicate p2 = cb.like(root.<String>get("name"), "%" + name + "%");
					p1 = p2;
				}

				if (sex != null) {
					Predicate p2 = cb.equal(root.<Integer>get("sex"), sex);
					if (p1 == null) {
						p1 = p2;
					} else {
						p1 = cb.and(p1, p2);
					}
				}
				return p1;
			}

		};

	}

}

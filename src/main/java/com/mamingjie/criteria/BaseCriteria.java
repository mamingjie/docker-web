package com.mamingjie.criteria;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Direction;

public class BaseCriteria {

	private int page = 0;

	private int size = 10;

	private String direction;

	private String properties;

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public Pageable getPageable() {
		if (direction != null && properties != null) {
			return new PageRequest(page, size, Direction.fromString(direction), properties.split(","));
		}
		return new PageRequest(page, size);
	}

	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

	public String getProperties() {
		return properties;
	}

	public void setProperties(String properties) {
		this.properties = properties;
	}
}

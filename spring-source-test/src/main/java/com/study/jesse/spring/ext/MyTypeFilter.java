package com.study.jesse.spring.ext;

import java.io.IOException;

import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

import com.study.jesse.spring.service.Abean;

public class MyTypeFilter implements TypeFilter{

	@Override
	public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory)
			throws IOException {
		System.out.println("typeFilter...");
		return metadataReader.getClassMetadata().getClassName().equals(Abean.class.getName());
	}

}

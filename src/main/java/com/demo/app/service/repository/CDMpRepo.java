package com.demo.app.service.repository;

import com.demo.app.service.business.ICD;

import javax.enterprise.inject.Alternative;

@Alternative
public class CDMpRepo implements ICD {
    @Override
    public String getAllCDS() {
        return "";
    }
}

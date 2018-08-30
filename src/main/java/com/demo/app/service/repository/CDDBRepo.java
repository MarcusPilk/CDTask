package com.demo.app.service.repository;

import com.demo.app.service.business.ICD;
import com.google.gson.Gson;
import com.demo.app.domain.CD;
import javax.enterprise.inject.Default;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import static javax.transaction.Transactional.TxType.SUPPORTS;

@Transactional(SUPPORTS)
@Default
public class CDDBRepo implements ICD{

    @PersistenceContext(unitName = "primary")
    private EntityManager manager;

    private Gson gson;

    public CDDBRepo() {
        gson = new Gson();
    }

    @Override
    public String getAllCDS() {
        Query query = manager.createQuery("SELECT cd FROM CD cd",CD.class);
        return gson.toJson(query.getResultList());
    }
}

package com.k_int.mn.okapi;

import javax.inject.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.grails.orm.hibernate.HibernateDatastore;

@Singleton
class OkapiTenantService {

  private static final Logger LOG = LoggerFactory.getLogger(OkapiTenantService.class);

  HibernateDatastore hibernateDatastore;

  public OkapiTenantService(HibernateDatastore hibernateDatastore) {
    this.hibernateDatastore = hibernateDatastore;
  }

  public void createTenant(String tenantId) {
    LOG.debug("OkapiTenantService::createTenant");

    String new_schema_name = tenantId; // OkapiTenantResolver.getTenantSchemaName(tenantId)

    try {
      LOG.debug("See if we already have a datastore for "+new_schema_name);
      if ( hibernateDatastore != null ) {
        hibernateDatastore.getDatastoreForConnection(new_schema_name);
      }
      else {
        LOG.error("Unable to obtain hibernateDatastore");
      }
      // log.debug("Module already registered for tenant");
    }
    catch ( org.grails.datastore.mapping.core.exceptions.ConfigurationException ce ) {
      LOG.debug("register module for tenant/schema: "+tenantId+"/"+new_schema_name);
      // createAccountSchema(new_schema_name)
      // updateAccountSchema(new_schema_name, tenantId)
      // allTenantIds << tenantId

      // This is called in updateAccountSchema too - don't think we should call it twice
      // hibernateDatastore.addTenantForSchema(new_schema_name)
      // notify("okapi:tenant_schema_created", new_schema_name)
    }

  }

  public void destroyTenant(String tenantId) {
    LOG.debug("OkapiTenantService::destroyTenant");
  }
}


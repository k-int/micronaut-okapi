package com.k_int.mn.okapi;

import javax.inject.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@Singleton
class OkapiTenantService {

  private static final Logger LOG = LoggerFactory.getLogger(OkapiTenantService.class);

  public void createTenant(String tenantId) {
    LOG.debug("OkapiTenantService::createTenant");
  }

  public void destroyTenant(String tenantId) {
    LOG.debug("OkapiTenantService::destroyTenant");
  }
}


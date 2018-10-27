package com.k_int.mn.okapi;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.*;
import io.micronaut.http.HttpHeaders;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.MediaType;
import java.util.Map;
import java.util.HashMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Controller("/_/tenant")
public class OkapiTenantController {

  private static final Logger LOG = LoggerFactory.getLogger(OkapiTenantController.class); 

  @Get
  public HttpResponse<?> getTenant() {
    Map result = new HashMap();
    LOG.debug("OkapiTenantController::getTenant");
    return HttpResponse.ok(result);
  }

  @Post 
  public HttpResponse<?> createTenant() {
    Map result = new HashMap();
    LOG.debug("OkapiTenantController::createTenant");
    return HttpResponse.ok(result);
  }

  @Delete 
  public HttpResponse<?> destroyTenant() {
    Map result = new HashMap();
    LOG.debug("OkapiTenantController::destroyTenant");
    return HttpResponse.ok(result);
  }

}


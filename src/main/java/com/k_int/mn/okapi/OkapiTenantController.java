package com.k_int.mn.okapi;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.*;
import io.micronaut.http.HttpHeaders;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.MediaType;
import java.util.Map;
import java.util.HashMap;
import lombok.extern.slf4j.Slf4j

@Slf4j
@CompileStatic
@Controller("/_/tenant")
public class OkapiTenantController {

  @Get
  public HttpResponse<?> getTenant() {
    Map result = new HashMap()
    
    return HttpResponse.ok(result);
  }

  @Post 
  public HttpResponse<?> createTenant() {
    Map result = new HashMap()

    return HttpResponse.ok(result);
  }

  @Delete 
  public HttpResponse<?> destroyTenant() {
    Map result = new HashMap()

    return HttpResponse.ok(result);
  }

}


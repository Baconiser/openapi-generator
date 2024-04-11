/*
 * OpenAPI Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.server.api;

import org.openapitools.server.model.Client;

import jakarta.ws.rs.*;

import java.io.InputStream;
import java.util.Map;
import java.util.List;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

@Path("/another-fake/dummy")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaHelidonServerCodegen", comments = "Generator version: 8.0.0-SNAPSHOT")
public interface AnotherFakeService {

    @PATCH
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    Client call123testSpecialTags(@Valid @NotNull Client client);
}

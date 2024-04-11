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

package org.openapitools.api;

import io.micronaut.http.annotation.*;
import io.micronaut.core.annotation.*;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.core.convert.format.Format;
import reactor.core.publisher.Mono;
import org.openapitools.model.ModelClient;
import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.validation.Valid;
import javax.validation.constraints.*;

@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen", comments = "Generator version: 8.0.0-SNAPSHOT")
@Client("${petstore-micronaut-base-path}")
public interface FakeClassnameTags123Api {
    /**
     * To test class name in snake case
     * To test class name in snake case
     *
     * @param _body client model (required)
     * @return ModelClient
     */
    @Patch(uri="/fake_classname_test")
    @Consumes({"application/json"})
    @Produces({"application/json"})
    Mono<ModelClient> testClassname(
        @Body @NotNull @Valid ModelClient _body
    );

}

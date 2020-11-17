/**
 * null
 */
package com.gc.petstore;

import javax.annotation.Generated;
import com.gc.petstore.*;

import com.amazonaws.opensdk.config.ConnectionConfiguration;
import com.amazonaws.opensdk.config.TimeoutConfiguration;

/**
 * Abstract implementation of {@code petstore}.
 */
public class SimpleClient {

  public static void main (String[] args){
    petstoreClientBuilder builder = petstore.builder();
    petstore client = builder
        .connectionConfiguration(new ConnectionConfiguration()
    	    .maxConnections(100)
    	    .connectionMaxIdleMillis(1000))
        .timeoutConfiguration(new TimeoutConfiguration()
    	    .httpRequestTimeout(3000)
    	    .totalExecutionTimeout(10000)
    	    .socketTimeout(2000))
        .build();
  }

    // @Override
    // public CreatePetResult createPet(CreatePetRequest request) {
    //     throw new java.lang.UnsupportedOperationException();
    // }

    // @Override
    // public GetApiRootResult getApiRoot(GetApiRootRequest request) {
    //     throw new java.lang.UnsupportedOperationException();
    // }
    //
    // @Override
    // public GetPetResult getPet(GetPetRequest request) {
    //     throw new java.lang.UnsupportedOperationException();
    // }
    //
    // @Override
    // public GetPetsResult getPets(GetPetsRequest request) {
    //     throw new java.lang.UnsupportedOperationException();
    // }
    //
    // @Override
    // public void shutdown() {
    //     throw new java.lang.UnsupportedOperationException();
    // }

}

// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.extensions.PolicyRoot;
import com.microsoft.graph.requests.extensions.ActivityBasedTimeoutPolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ActivityBasedTimeoutPolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.ClaimsMappingPolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ClaimsMappingPolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.HomeRealmDiscoveryPolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.HomeRealmDiscoveryPolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.PermissionGrantPolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.PermissionGrantPolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.TokenIssuancePolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.TokenIssuancePolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.TokenLifetimePolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.TokenLifetimePolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.ConditionalAccessPolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ConditionalAccessPolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.AuthorizationPolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.IdentitySecurityDefaultsEnforcementPolicyRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Policy Root Request.
 */
public class PolicyRootRequest extends BaseRequest<PolicyRoot> {
	
    /**
     * The request for the PolicyRoot
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PolicyRootRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, PolicyRoot.class);
    }

    /**
     * Gets the PolicyRoot from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<PolicyRoot> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the PolicyRoot from the service
     *
     * @return the PolicyRoot from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public PolicyRoot get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<PolicyRoot> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public PolicyRoot delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this PolicyRoot with a source
     *
     * @param sourcePolicyRoot the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<PolicyRoot> patchAsync(@Nonnull final PolicyRoot sourcePolicyRoot) {
        return sendAsync(HttpMethod.PATCH, sourcePolicyRoot);
    }

    /**
     * Patches this PolicyRoot with a source
     *
     * @param sourcePolicyRoot the source object with updates
     * @return the updated PolicyRoot
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public PolicyRoot patch(@Nonnull final PolicyRoot sourcePolicyRoot) throws ClientException {
        return send(HttpMethod.PATCH, sourcePolicyRoot);
    }

    /**
     * Creates a PolicyRoot with a new object
     *
     * @param newPolicyRoot the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<PolicyRoot> postAsync(@Nonnull final PolicyRoot newPolicyRoot) {
        return sendAsync(HttpMethod.POST, newPolicyRoot);
    }

    /**
     * Creates a PolicyRoot with a new object
     *
     * @param newPolicyRoot the new object to create
     * @return the created PolicyRoot
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public PolicyRoot post(@Nonnull final PolicyRoot newPolicyRoot) throws ClientException {
        return send(HttpMethod.POST, newPolicyRoot);
    }

    /**
     * Creates a PolicyRoot with a new object
     *
     * @param newPolicyRoot the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<PolicyRoot> putAsync(@Nonnull final PolicyRoot newPolicyRoot) {
        return sendAsync(HttpMethod.PUT, newPolicyRoot);
    }

    /**
     * Creates a PolicyRoot with a new object
     *
     * @param newPolicyRoot the object to create/update
     * @return the created PolicyRoot
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public PolicyRoot put(@Nonnull final PolicyRoot newPolicyRoot) throws ClientException {
        return send(HttpMethod.PUT, newPolicyRoot);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public PolicyRootRequest select(@Nonnull final String value) {
         addSelectOption(value);
         return this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     @Nonnull
     public PolicyRootRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}


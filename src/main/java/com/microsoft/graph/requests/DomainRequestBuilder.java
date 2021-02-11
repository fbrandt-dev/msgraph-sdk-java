// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.Domain;
import com.microsoft.graph.requests.DirectoryObjectCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.DirectoryObjectWithReferenceRequestBuilder;
import com.microsoft.graph.requests.DomainDnsRecordCollectionRequestBuilder;
import com.microsoft.graph.requests.DomainDnsRecordRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.models.DomainForceDeleteParameterSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Domain Request Builder.
 */
public class DomainRequestBuilder extends BaseRequestBuilder<Domain> {

    /**
     * The request builder for the Domain
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DomainRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the DomainRequest instance
     */
    @Nonnull
    public DomainRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the DomainRequest instance
     */
    @Nonnull
    public DomainRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.DomainRequest(getRequestUrl(), getClient(), requestOptions);
    }


    /**
     *  Gets a request builder for the DirectoryObject collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public DirectoryObjectCollectionWithReferencesRequestBuilder domainNameReferences() {
        return new DirectoryObjectCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("domainNameReferences"), getClient(), null);
    }

    /**
     * Gets a request builder for the DirectoryObject item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public DirectoryObjectWithReferenceRequestBuilder domainNameReferences(@Nonnull final String id) {
        return new DirectoryObjectWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("domainNameReferences") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the DomainDnsRecord collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public DomainDnsRecordCollectionRequestBuilder serviceConfigurationRecords() {
        return new DomainDnsRecordCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("serviceConfigurationRecords"), getClient(), null);
    }

    /**
     * Gets a request builder for the DomainDnsRecord item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public DomainDnsRecordRequestBuilder serviceConfigurationRecords(@Nonnull final String id) {
        return new DomainDnsRecordRequestBuilder(getRequestUrlWithAdditionalSegment("serviceConfigurationRecords") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the DomainDnsRecord collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public DomainDnsRecordCollectionRequestBuilder verificationDnsRecords() {
        return new DomainDnsRecordCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("verificationDnsRecords"), getClient(), null);
    }

    /**
     * Gets a request builder for the DomainDnsRecord item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public DomainDnsRecordRequestBuilder verificationDnsRecords(@Nonnull final String id) {
        return new DomainDnsRecordRequestBuilder(getRequestUrlWithAdditionalSegment("verificationDnsRecords") + "/" + id, getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public DomainForceDeleteRequestBuilder forceDelete(@Nonnull final DomainForceDeleteParameterSet parameters) {
        return new DomainForceDeleteRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.forceDelete"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     */
    @Nonnull
    public DomainVerifyRequestBuilder verify() {
        return new DomainVerifyRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.verify"), getClient(), null);
    }
}

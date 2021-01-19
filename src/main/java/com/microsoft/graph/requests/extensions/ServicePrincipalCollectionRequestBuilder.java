// Template Source: BaseEntityCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.extensions.ServicePrincipal;
import com.microsoft.graph.models.extensions.KeyCredential;
import com.microsoft.graph.models.extensions.PasswordCredential;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.extensions.ServicePrincipalCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ServicePrincipalRequestBuilder;
import com.microsoft.graph.requests.extensions.ServicePrincipalCollectionRequest;
import com.microsoft.graph.requests.extensions.ServicePrincipalDeltaCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.PrimitiveRequestBuilder;
import com.microsoft.graph.models.extensions.ServicePrincipalAddKeyParameterSet;
import com.microsoft.graph.models.extensions.ServicePrincipalAddPasswordParameterSet;
import com.microsoft.graph.models.extensions.ServicePrincipalRemoveKeyParameterSet;
import com.microsoft.graph.models.extensions.ServicePrincipalRemovePasswordParameterSet;
// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Service Principal Collection Request Builder.
 */
public class ServicePrincipalCollectionRequestBuilder extends BaseCollectionRequestBuilder<ServicePrincipal, ServicePrincipalRequestBuilder, ServicePrincipalCollectionResponse, ServicePrincipalCollectionPage, ServicePrincipalCollectionRequest> {

    /**
     * The request builder for this collection of ServicePrincipal
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ServicePrincipalCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ServicePrincipalRequestBuilder.class, ServicePrincipalCollectionRequest.class);
    }



    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     */
    @Nonnull
    public ServicePrincipalDeltaCollectionRequestBuilder delta() {
        return new ServicePrincipalDeltaCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.delta"), getClient(), null);
    }

    /**
     * Gets the raw count request for the collection
     * @return The raw count request for the collection
     */
    @Nonnull
    public PrimitiveRequestBuilder<Long> count() {
        return new PrimitiveRequestBuilder<Long>(getRequestUrlWithAdditionalSegment("$count"), getClient(), null, Long.class);
    }
}

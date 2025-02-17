// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.MobileAppContent;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Mobile App Content Request Builder.
 */
public class MobileAppContentRequestBuilder extends BaseRequestBuilder<MobileAppContent> {

    /**
     * The request builder for the MobileAppContent
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public MobileAppContentRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the MobileAppContentRequest instance
     */
    @Nonnull
    public MobileAppContentRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the MobileAppContentRequest instance
     */
    @Nonnull
    public MobileAppContentRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.MobileAppContentRequest(getRequestUrl(), getClient(), requestOptions);
    }


    /**
     *  Gets a request builder for the MobileContainedApp collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public com.microsoft.graph.requests.MobileContainedAppCollectionRequestBuilder containedApps() {
        return new com.microsoft.graph.requests.MobileContainedAppCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("containedApps"), getClient(), null);
    }

    /**
     * Gets a request builder for the MobileContainedApp item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public com.microsoft.graph.requests.MobileContainedAppRequestBuilder containedApps(@Nonnull final String id) {
        return new com.microsoft.graph.requests.MobileContainedAppRequestBuilder(getRequestUrlWithAdditionalSegment("containedApps") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the MobileAppContentFile collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public com.microsoft.graph.requests.MobileAppContentFileCollectionRequestBuilder files() {
        return new com.microsoft.graph.requests.MobileAppContentFileCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("files"), getClient(), null);
    }

    /**
     * Gets a request builder for the MobileAppContentFile item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public com.microsoft.graph.requests.MobileAppContentFileRequestBuilder files(@Nonnull final String id) {
        return new com.microsoft.graph.requests.MobileAppContentFileRequestBuilder(getRequestUrlWithAdditionalSegment("files") + "/" + id, getClient(), null);
    }
}

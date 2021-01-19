// Template Source: BaseEntityCollectionRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.extensions.MobileAppContent;
import com.microsoft.graph.models.extensions.MobileAppContentFile;
import com.microsoft.graph.models.extensions.FileEncryptionInfo;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseEntityCollectionRequest;
import com.microsoft.graph.requests.extensions.MobileAppContentFileCollectionResponse;
import com.microsoft.graph.requests.extensions.MobileAppContentFileCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.MobileAppContentFileCollectionRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Mobile App Content File Collection Request.
 */
public class MobileAppContentFileCollectionRequest extends BaseEntityCollectionRequest<MobileAppContentFile, MobileAppContentFileCollectionResponse, MobileAppContentFileCollectionPage> {

    /**
     * The request builder for this collection of MobileAppContentFile
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public MobileAppContentFileCollectionRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, MobileAppContentFileCollectionResponse.class, MobileAppContentFileCollectionPage.class, MobileAppContentFileCollectionRequestBuilder.class);
    }

    /**
     * Creates a new MobileAppContentFile
     * @param newMobileAppContentFile the MobileAppContentFile to create
     * @return a future with the created object
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<MobileAppContentFile> postAsync(@Nonnull final MobileAppContentFile newMobileAppContentFile) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new MobileAppContentFileRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .postAsync(newMobileAppContentFile);
    }

    /**
     * Creates a new MobileAppContentFile
     * @param newMobileAppContentFile the MobileAppContentFile to create
     * @return the newly created object
     */
    @Nonnull
    public MobileAppContentFile post(@Nonnull final MobileAppContentFile newMobileAppContentFile) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new MobileAppContentFileRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newMobileAppContentFile);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    @Nonnull
    public MobileAppContentFileCollectionRequest expand(@Nonnull final String value) {
        addExpandOption(value);
        return this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    @Nonnull
    public MobileAppContentFileCollectionRequest filter(@Nonnull final String value) {
        addFilterOption(value);
        return this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    @Nonnull
    public MobileAppContentFileCollectionRequest orderBy(@Nonnull final String value) {
        addOrderByOption(value);
        return this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    @Nonnull
    public MobileAppContentFileCollectionRequest select(@Nonnull final String value) {
        addSelectOption(value);
        return this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    @Nonnull
    public MobileAppContentFileCollectionRequest top(final int value) {
        addTopOption(value);
        return this;
    }

    /**
     * Sets the count value for the request
     *
     * @param value whether or not to return the count of objects with the request
     * @return the updated request
     */
    @Nonnull
    public MobileAppContentFileCollectionRequest count(final boolean value) {
        addCountOption(value);
        return this;
    }
    /**
     * Sets the count value to true for the request
     *
     * @return the updated request
     */
    @Nonnull
    public MobileAppContentFileCollectionRequest count() {
        addCountOption(true);
        return this;
    }
    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    @Nonnull
    public MobileAppContentFileCollectionRequest skip(final int value) {
        addSkipOption(value);
        return this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    @Nonnull
    public MobileAppContentFileCollectionRequest skipToken(@Nonnull final String skipToken) {
    	addSkipTokenOption(skipToken);
        return this;
    }
}


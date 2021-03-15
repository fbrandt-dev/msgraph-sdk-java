// Template Source: BaseEntityCollectionRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.TeamsApp;
import com.microsoft.graph.models.TeamsAppDefinition;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseEntityCollectionRequest;
import com.microsoft.graph.requests.TeamsAppDefinitionCollectionResponse;
import com.microsoft.graph.requests.TeamsAppDefinitionCollectionRequestBuilder;
import com.microsoft.graph.requests.TeamsAppDefinitionCollectionRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Teams App Definition Collection Request.
 */
public class TeamsAppDefinitionCollectionRequest extends BaseEntityCollectionRequest<TeamsAppDefinition, TeamsAppDefinitionCollectionResponse, TeamsAppDefinitionCollectionPage> {

    /**
     * The request builder for this collection of TeamsAppDefinition
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public TeamsAppDefinitionCollectionRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, TeamsAppDefinitionCollectionResponse.class, TeamsAppDefinitionCollectionPage.class, TeamsAppDefinitionCollectionRequestBuilder.class);
    }

    /**
     * Creates a new TeamsAppDefinition
     * @param newTeamsAppDefinition the TeamsAppDefinition to create
     * @return a future with the created object
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<TeamsAppDefinition> postAsync(@Nonnull final TeamsAppDefinition newTeamsAppDefinition) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new TeamsAppDefinitionRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .postAsync(newTeamsAppDefinition);
    }

    /**
     * Creates a new TeamsAppDefinition
     * @param newTeamsAppDefinition the TeamsAppDefinition to create
     * @return the newly created object
     */
    @Nonnull
    public TeamsAppDefinition post(@Nonnull final TeamsAppDefinition newTeamsAppDefinition) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new TeamsAppDefinitionRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newTeamsAppDefinition);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    @Nonnull
    public TeamsAppDefinitionCollectionRequest expand(@Nonnull final String value) {
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
    public TeamsAppDefinitionCollectionRequest filter(@Nonnull final String value) {
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
    public TeamsAppDefinitionCollectionRequest orderBy(@Nonnull final String value) {
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
    public TeamsAppDefinitionCollectionRequest select(@Nonnull final String value) {
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
    public TeamsAppDefinitionCollectionRequest top(final int value) {
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
    public TeamsAppDefinitionCollectionRequest count(final boolean value) {
        addCountOption(value);
        return this;
    }
    /**
     * Sets the count value to true for the request
     *
     * @return the updated request
     */
    @Nonnull
    public TeamsAppDefinitionCollectionRequest count() {
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
    public TeamsAppDefinitionCollectionRequest skip(final int value) {
        addSkipOption(value);
        return this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    @Nonnull
    public TeamsAppDefinitionCollectionRequest skipToken(@Nonnull final String skipToken) {
    	addSkipTokenOption(skipToken);
        return this;
    }
}


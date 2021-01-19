// Template Source: BaseEntityReferenceRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.extensions.EducationSchool;
import com.microsoft.graph.requests.extensions.EducationClassCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.EducationClassRequestBuilder;
import com.microsoft.graph.requests.extensions.EducationUserCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.EducationUserRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.http.BaseReferenceRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonObject;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Education School Reference Request.
 */
public class EducationSchoolReferenceRequest extends BaseReferenceRequest<EducationSchool> {

    /**
     * The request for the EducationSchool
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public EducationSchoolReferenceRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, EducationSchool.class);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    @Nonnull
    public EducationSchoolReferenceRequest select(@Nonnull final String value) {
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
    public EducationSchoolReferenceRequest expand(@Nonnull final String value) {
        addExpandOption(value);
        return this;
    }
    /**
     * Puts the EducationSchool
     *
     * @param srcEducationSchool the EducationSchool reference to PUT
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<EducationSchool> putAsync(@Nonnull final EducationSchool srcEducationSchool) {
        final JsonObject payload = new JsonObject();
        payload.add("@odata.id", new JsonPrimitive(this.getClient().getServiceRoot() + "/education/schools/" + srcEducationSchool.id));
        return sendAsync(HttpMethod.PUT, payload);
    }

    /**
     * Puts the EducationSchool
     *
     * @param srcEducationSchool the EducationSchool reference to PUT
     * @return the EducationSchool
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    @Nullable
    public EducationSchool put(@Nonnull final EducationSchool srcEducationSchool) throws ClientException {
        final JsonObject payload = new JsonObject();
        payload.add("@odata.id", new JsonPrimitive(this.getClient().getServiceRoot() + "/education/schools/" + srcEducationSchool.id));
        return send(HttpMethod.PUT, payload);
    }
}

// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.requests.CallUnmuteRequest;
import com.microsoft.graph.models.Call;
import com.microsoft.graph.models.UnmuteParticipantOperation;
import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.models.CallUnmuteParameterSet;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Call Unmute Request Builder.
 */
public class CallUnmuteRequestBuilder extends BaseActionRequestBuilder<UnmuteParticipantOperation> {

    /**
     * The request builder for this CallUnmute
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public CallUnmuteRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }
    private CallUnmuteParameterSet body;
    /**
     * The request builder for this CallUnmute
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public CallUnmuteRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final CallUnmuteParameterSet parameters) {
        super(requestUrl, client, requestOptions);
        this.body = parameters;
    }

    /**
     * Creates the CallUnmuteRequest
     *
     * @param requestOptions the options for the request
     * @return the CallUnmuteRequest instance
     */
    @Nonnull
    public CallUnmuteRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the CallUnmuteRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the CallUnmuteRequest instance
     */
    @Nonnull
    public CallUnmuteRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final CallUnmuteRequest request = new CallUnmuteRequest(
                getRequestUrl(),
                getClient(),
                requestOptions);
        request.body = this.body;
        return request;
    }
}

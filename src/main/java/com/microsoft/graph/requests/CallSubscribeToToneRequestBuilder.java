// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.requests.CallSubscribeToToneRequest;
import com.microsoft.graph.models.Call;
import com.microsoft.graph.models.SubscribeToToneOperation;
import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.models.CallSubscribeToToneParameterSet;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Call Subscribe To Tone Request Builder.
 */
public class CallSubscribeToToneRequestBuilder extends BaseActionRequestBuilder<SubscribeToToneOperation> {

    private CallSubscribeToToneParameterSet body;
    /**
     * The request builder for this CallSubscribeToTone
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public CallSubscribeToToneRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final CallSubscribeToToneParameterSet parameters) {
        super(requestUrl, client, requestOptions);
        this.body = parameters;
    }

    /**
     * Creates the CallSubscribeToToneRequest
     *
     * @param requestOptions the options for the request
     * @return the CallSubscribeToToneRequest instance
     */
    @Nonnull
    public CallSubscribeToToneRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the CallSubscribeToToneRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the CallSubscribeToToneRequest instance
     */
    @Nonnull
    public CallSubscribeToToneRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final CallSubscribeToToneRequest request = new CallSubscribeToToneRequest(
                getRequestUrl(),
                getClient(),
                requestOptions);
        request.body = this.body;
        return request;
    }
}

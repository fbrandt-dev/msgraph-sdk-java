// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.requests.OnenoteSectionCopyToSectionGroupRequest;
import com.microsoft.graph.models.OnenoteSection;
import com.microsoft.graph.models.OnenoteOperation;
import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.models.OnenoteSectionCopyToSectionGroupParameterSet;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Onenote Section Copy To Section Group Request Builder.
 */
public class OnenoteSectionCopyToSectionGroupRequestBuilder extends BaseActionRequestBuilder<OnenoteOperation> {

    /**
     * The request builder for this OnenoteSectionCopyToSectionGroup
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public OnenoteSectionCopyToSectionGroupRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }
    private OnenoteSectionCopyToSectionGroupParameterSet body;
    /**
     * The request builder for this OnenoteSectionCopyToSectionGroup
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public OnenoteSectionCopyToSectionGroupRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final OnenoteSectionCopyToSectionGroupParameterSet parameters) {
        super(requestUrl, client, requestOptions);
        this.body = parameters;
    }

    /**
     * Creates the OnenoteSectionCopyToSectionGroupRequest
     *
     * @param requestOptions the options for the request
     * @return the OnenoteSectionCopyToSectionGroupRequest instance
     */
    @Nonnull
    public OnenoteSectionCopyToSectionGroupRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the OnenoteSectionCopyToSectionGroupRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the OnenoteSectionCopyToSectionGroupRequest instance
     */
    @Nonnull
    public OnenoteSectionCopyToSectionGroupRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final OnenoteSectionCopyToSectionGroupRequest request = new OnenoteSectionCopyToSectionGroupRequest(
                getRequestUrl(),
                getClient(),
                requestOptions);
        request.body = this.body;
        return request;
    }
}

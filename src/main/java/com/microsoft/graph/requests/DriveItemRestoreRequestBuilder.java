// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.requests.DriveItemRestoreRequest;
import com.microsoft.graph.models.ItemReference;
import com.microsoft.graph.models.DriveItem;
import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.models.DriveItemRestoreParameterSet;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Drive Item Restore Request Builder.
 */
public class DriveItemRestoreRequestBuilder extends BaseActionRequestBuilder<DriveItem> {

    private DriveItemRestoreParameterSet body;
    /**
     * The request builder for this DriveItemRestore
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public DriveItemRestoreRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final DriveItemRestoreParameterSet parameters) {
        super(requestUrl, client, requestOptions);
        this.body = parameters;
    }

    /**
     * Creates the DriveItemRestoreRequest
     *
     * @param requestOptions the options for the request
     * @return the DriveItemRestoreRequest instance
     */
    @Nonnull
    public DriveItemRestoreRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the DriveItemRestoreRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the DriveItemRestoreRequest instance
     */
    @Nonnull
    public DriveItemRestoreRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final DriveItemRestoreRequest request = new DriveItemRestoreRequest(
                getRequestUrl(),
                getClient(),
                requestOptions);
        request.body = this.body;
        return request;
    }
}

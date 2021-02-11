// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.requests.CalendarSharingMessageAcceptRequest;
import com.microsoft.graph.models.CalendarSharingMessage;
import com.microsoft.graph.models.Calendar;
import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Calendar Sharing Message Accept Request Builder.
 */
public class CalendarSharingMessageAcceptRequestBuilder extends BaseActionRequestBuilder<Calendar> {

    /**
     * The request builder for this CalendarSharingMessageAccept
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public CalendarSharingMessageAcceptRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the CalendarSharingMessageAcceptRequest
     *
     * @param requestOptions the options for the request
     * @return the CalendarSharingMessageAcceptRequest instance
     */
    @Nonnull
    public CalendarSharingMessageAcceptRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the CalendarSharingMessageAcceptRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the CalendarSharingMessageAcceptRequest instance
     */
    @Nonnull
    public CalendarSharingMessageAcceptRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final CalendarSharingMessageAcceptRequest request = new CalendarSharingMessageAcceptRequest(
                getRequestUrl(),
                getClient(),
                requestOptions);
        return request;
    }
}

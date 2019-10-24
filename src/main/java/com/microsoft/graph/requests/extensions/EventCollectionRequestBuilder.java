// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.models.extensions.*;
import com.microsoft.graph.models.generated.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.requests.extensions.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Event Collection Request Builder.
 */
public class EventCollectionRequestBuilder extends BaseRequestBuilder implements IEventCollectionRequestBuilder {

    /**
     * The request builder for this collection of Group
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public EventCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    public IEventCollectionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    public IEventCollectionRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        return new EventCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IEventRequestBuilder byId(final String id) {
        return new EventRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }



    public IEventDeltaCollectionRequestBuilder delta() {
        return new EventDeltaCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.delta"), getClient(), null);
    }

	public IEventDeltaCollectionRequestBuilder delta(final String deltaLink) {
        return new EventDeltaCollectionRequestBuilder(deltaLink, getClient(), null);
    }
}

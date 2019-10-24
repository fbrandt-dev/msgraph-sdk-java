// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.Message;
import com.microsoft.graph.requests.extensions.IMessageCreateForwardRequest;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Message Create Forward Request.
 */
public interface IMessageCreateForwardRequest {

    void post(final ICallback<Message> callback);

    Message post() throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IMessageCreateForwardRequest select(final String value) ;

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    IMessageCreateForwardRequest top(final int value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IMessageCreateForwardRequest expand(final String value);

}

// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.INotificationMessageTemplateSendTestMessageRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Notification Message Template Send Test Message Request Builder.
 */
public interface INotificationMessageTemplateSendTestMessageRequestBuilder extends IRequestBuilder {

    /**
     * Creates the INotificationMessageTemplateSendTestMessageRequest
     *
     * @return the INotificationMessageTemplateSendTestMessageRequest instance
     */
    INotificationMessageTemplateSendTestMessageRequest buildRequest();

    /**
     * Creates the INotificationMessageTemplateSendTestMessageRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the INotificationMessageTemplateSendTestMessageRequest instance
     */
    INotificationMessageTemplateSendTestMessageRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);

}

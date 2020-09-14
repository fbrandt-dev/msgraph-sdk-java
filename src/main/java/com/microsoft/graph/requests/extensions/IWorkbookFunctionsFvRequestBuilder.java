// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsFvRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Workbook Functions Fv Request Builder.
 */
public interface IWorkbookFunctionsFvRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IWorkbookFunctionsFvRequest
     *
     * @return the IWorkbookFunctionsFvRequest instance
     */
    IWorkbookFunctionsFvRequest buildRequest();

    /**
     * Creates the IWorkbookFunctionsFvRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsFvRequest instance
     */
    IWorkbookFunctionsFvRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);

}

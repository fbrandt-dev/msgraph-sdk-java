// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsDateRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Workbook Functions Date Request Builder.
 */
public interface IWorkbookFunctionsDateRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IWorkbookFunctionsDateRequest
     *
     * @return the IWorkbookFunctionsDateRequest instance
     */
    IWorkbookFunctionsDateRequest buildRequest();

    /**
     * Creates the IWorkbookFunctionsDateRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsDateRequest instance
     */
    IWorkbookFunctionsDateRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);

}

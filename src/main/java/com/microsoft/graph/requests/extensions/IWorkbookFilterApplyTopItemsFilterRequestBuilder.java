// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookFilterApplyTopItemsFilterRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Workbook Filter Apply Top Items Filter Request Builder.
 */
public interface IWorkbookFilterApplyTopItemsFilterRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IWorkbookFilterApplyTopItemsFilterRequest
     *
     * @return the IWorkbookFilterApplyTopItemsFilterRequest instance
     */
    IWorkbookFilterApplyTopItemsFilterRequest buildRequest();

    /**
     * Creates the IWorkbookFilterApplyTopItemsFilterRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFilterApplyTopItemsFilterRequest instance
     */
    IWorkbookFilterApplyTopItemsFilterRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);

}

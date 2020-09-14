// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.ISiteGetByPathRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Site Get By Path Request Builder.
 */
public interface ISiteGetByPathRequestBuilder extends IRequestBuilder {

    /**
     * Creates the ISiteGetByPathRequest
     *
     * @return the ISiteGetByPathRequest instance
     */
    ISiteGetByPathRequest buildRequest();

    /**
     * Creates the ISiteGetByPathRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the ISiteGetByPathRequest instance
     */
    ISiteGetByPathRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);


    /**
     * Gets the request builder for User
     *
     * @return the IUserWithReferenceRequestBuilder instance
     */
    IUserWithReferenceRequestBuilder createdByUser();

    /**
     * Gets the request builder for User
     *
     * @return the IUserWithReferenceRequestBuilder instance
     */
    IUserWithReferenceRequestBuilder lastModifiedByUser();

    /**
     * Gets the request builder for ItemAnalytics
     *
     * @return the IItemAnalyticsWithReferenceRequestBuilder instance
     */
    IItemAnalyticsWithReferenceRequestBuilder analytics();

    IColumnDefinitionCollectionRequestBuilder columns();

    IColumnDefinitionRequestBuilder columns(final String id);

    IContentTypeCollectionRequestBuilder contentTypes();

    IContentTypeRequestBuilder contentTypes(final String id);

    /**
     * Gets the request builder for Drive
     *
     * @return the IDriveRequestBuilder instance
     */
    IDriveRequestBuilder drive();

    IDriveCollectionRequestBuilder drives();

    IDriveRequestBuilder drives(final String id);

    IBaseItemCollectionRequestBuilder items();

    IBaseItemRequestBuilder items(final String id);

    IListCollectionRequestBuilder lists();

    IListRequestBuilder lists(final String id);

    ISiteCollectionRequestBuilder sites();

    ISiteRequestBuilder sites(final String id);

    /**
     * Gets the request builder for Onenote
     *
     * @return the IOnenoteRequestBuilder instance
     */
    IOnenoteRequestBuilder onenote();
}

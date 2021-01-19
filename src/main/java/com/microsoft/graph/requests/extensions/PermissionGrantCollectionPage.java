// Template Source: BaseMethodCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.extensions.DriveRecipient;
import com.microsoft.graph.models.extensions.Permission;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.PermissionGrantCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.PermissionGrantCollectionPage;
import com.microsoft.graph.requests.extensions.PermissionGrantCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Permission Grant Collection Page.
 */
public class PermissionGrantCollectionPage extends BaseCollectionPage<Permission, PermissionGrantCollectionRequestBuilder> {

    /**
     * A collection page for Permission.
     *
     * @param response The serialized PermissionGrantCollectionResponse from the service
     * @param builder The request builder for the next collection page
     */
    public PermissionGrantCollectionPage(@Nonnull final PermissionGrantCollectionResponse response, @Nonnull final PermissionGrantCollectionRequestBuilder builder) {
       super(response, builder);
    }

	/**
     * Creates the collection page for PermissionGrant
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public PermissionGrantCollectionPage(@Nonnull final java.util.List<Permission> pageContents, @Nullable final PermissionGrantCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}

// Template Source: BaseMethodCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;

import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.ManagedAppRegistrationGetUserIdsWithFlaggedAppRegistrationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedAppRegistrationGetUserIdsWithFlaggedAppRegistrationCollectionPage;
import com.microsoft.graph.requests.extensions.ManagedAppRegistrationGetUserIdsWithFlaggedAppRegistrationCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Managed App Registration Get User Ids With Flagged App Registration Collection Page.
 */
public class ManagedAppRegistrationGetUserIdsWithFlaggedAppRegistrationCollectionPage extends BaseCollectionPage<String, ManagedAppRegistrationGetUserIdsWithFlaggedAppRegistrationCollectionRequestBuilder> {

    /**
     * A collection page for String.
     *
     * @param response The serialized ManagedAppRegistrationGetUserIdsWithFlaggedAppRegistrationCollectionResponse from the service
     * @param builder The request builder for the next collection page
     */
    public ManagedAppRegistrationGetUserIdsWithFlaggedAppRegistrationCollectionPage(@Nonnull final ManagedAppRegistrationGetUserIdsWithFlaggedAppRegistrationCollectionResponse response, @Nonnull final ManagedAppRegistrationGetUserIdsWithFlaggedAppRegistrationCollectionRequestBuilder builder) {
       super(response, builder);
    }

	/**
     * Creates the collection page for ManagedAppRegistrationGetUserIdsWithFlaggedAppRegistration
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public ManagedAppRegistrationGetUserIdsWithFlaggedAppRegistrationCollectionPage(@Nonnull final java.util.List<String> pageContents, @Nullable final ManagedAppRegistrationGetUserIdsWithFlaggedAppRegistrationCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}

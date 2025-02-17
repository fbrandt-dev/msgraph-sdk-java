// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.models.UnifiedRbacResourceAction;
import com.microsoft.graph.requests.UnifiedRbacResourceActionCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.UnifiedRbacResourceActionCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Unified Rbac Resource Action Collection Page.
 */
public class UnifiedRbacResourceActionCollectionPage extends BaseCollectionPage<UnifiedRbacResourceAction, UnifiedRbacResourceActionCollectionRequestBuilder> {

    /**
     * A collection page for UnifiedRbacResourceAction
     *
     * @param response the serialized UnifiedRbacResourceActionCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public UnifiedRbacResourceActionCollectionPage(@Nonnull final UnifiedRbacResourceActionCollectionResponse response, @Nonnull final UnifiedRbacResourceActionCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for UnifiedRbacResourceAction
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public UnifiedRbacResourceActionCollectionPage(@Nonnull final java.util.List<UnifiedRbacResourceAction> pageContents, @Nullable final UnifiedRbacResourceActionCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}

// Template Source: BaseEntityCollectionWithReferencesRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.PrinterShare;
import com.microsoft.graph.models.Group;
import com.microsoft.graph.models.AssignedLicense;
import com.microsoft.graph.models.ResourceSpecificPermissionGrant;
import com.microsoft.graph.models.DirectoryObject;
import com.microsoft.graph.models.ExtensionProperty;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.http.BaseCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Group Collection With References Request Builder.
 */
public class GroupCollectionWithReferencesRequestBuilder extends BaseCollectionWithReferencesRequestBuilder<Group, GroupWithReferenceRequest, GroupReferenceRequestBuilder, GroupWithReferenceRequestBuilder, GroupCollectionResponse, GroupCollectionWithReferencesPage, GroupCollectionReferenceRequest, GroupCollectionReferenceRequestBuilder> {

    /**
     * The request builder for this collection of PrinterShare
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public GroupCollectionWithReferencesRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, GroupReferenceRequestBuilder.class, GroupCollectionReferenceRequest.class, GroupCollectionReferenceRequestBuilder.class);
    }
}

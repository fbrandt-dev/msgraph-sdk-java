// Template Source: BaseEntityCollectionWithReferencesPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.extensions.EducationSchool;
import com.microsoft.graph.models.extensions.EducationUser;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.extensions.EducationUserCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.extensions.EducationUserCollectionWithReferencesPage;
import com.microsoft.graph.requests.extensions.EducationUserCollectionResponse;
import com.microsoft.graph.models.extensions.EducationUser;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Education User Collection With References Page.
 */
public class EducationUserCollectionWithReferencesPage extends BaseCollectionPage<EducationUser, EducationUserCollectionWithReferencesRequestBuilder> {

    /**
     * A collection page for EducationUser
     *
     * @param response the serialized EducationUserCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public EducationUserCollectionWithReferencesPage(@Nonnull final EducationUserCollectionResponse response, @Nullable final EducationUserCollectionWithReferencesRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }

    /**
     * Creates the collection page for EducationUser
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public EducationUserCollectionWithReferencesPage(@Nonnull final java.util.List<EducationUser> pageContents, @Nullable final EducationUserCollectionWithReferencesRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}

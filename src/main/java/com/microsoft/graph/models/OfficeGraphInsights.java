// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.models.Entity;
import com.microsoft.graph.requests.SharedInsightCollectionPage;
import com.microsoft.graph.requests.TrendingCollectionPage;
import com.microsoft.graph.requests.UsedInsightCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Office Graph Insights.
 */
public class OfficeGraphInsights extends Entity implements IJsonBackedObject {


    /**
     * The Shared.
     * Calculated relationship identifying documents shared with or by the user. This includes URLs, file attachments, and reference attachments to OneDrive for Business and SharePoint files found in Outlook messages and meetings. This also includes URLs and reference attachments to Teams conversations. Ordered by recency of share.
     */
    @SerializedName(value = "shared", alternate = {"Shared"})
    @Expose
	@Nullable
    public com.microsoft.graph.requests.SharedInsightCollectionPage shared;

    /**
     * The Trending.
     * Calculated relationship identifying documents trending around a user. Trending documents are calculated based on activity of the user's closest network of people and include files stored in OneDrive for Business and SharePoint. Trending insights help the user to discover potentially useful content that the user has access to, but has never viewed before.
     */
    @SerializedName(value = "trending", alternate = {"Trending"})
    @Expose
	@Nullable
    public com.microsoft.graph.requests.TrendingCollectionPage trending;

    /**
     * The Used.
     * Calculated relationship identifying the latest documents viewed or modified by a user, including OneDrive for Business and SharePoint documents, ranked by recency of use.
     */
    @SerializedName(value = "used", alternate = {"Used"})
    @Expose
	@Nullable
    public com.microsoft.graph.requests.UsedInsightCollectionPage used;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {


        if (json.has("shared")) {
            shared = serializer.deserializeObject(json.get("shared"), com.microsoft.graph.requests.SharedInsightCollectionPage.class);
        }

        if (json.has("trending")) {
            trending = serializer.deserializeObject(json.get("trending"), com.microsoft.graph.requests.TrendingCollectionPage.class);
        }

        if (json.has("used")) {
            used = serializer.deserializeObject(json.get("used"), com.microsoft.graph.requests.UsedInsightCollectionPage.class);
        }
    }
}

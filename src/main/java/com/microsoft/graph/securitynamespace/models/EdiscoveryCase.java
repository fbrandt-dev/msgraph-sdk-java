// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.security.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.models.IdentitySet;
import com.microsoft.graph.security.models.EdiscoveryCaseSettings;
import com.microsoft.graph.security.models.Case;
import com.microsoft.graph.security.requests.EdiscoveryCustodianCollectionPage;
import com.microsoft.graph.security.requests.EdiscoveryNoncustodialDataSourceCollectionPage;
import com.microsoft.graph.security.requests.CaseOperationCollectionPage;
import com.microsoft.graph.security.requests.EdiscoveryReviewSetCollectionPage;
import com.microsoft.graph.security.requests.EdiscoverySearchCollectionPage;
import com.microsoft.graph.security.requests.EdiscoveryReviewTagCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Ediscovery Case.
 */
public class EdiscoveryCase extends Case implements IJsonBackedObject {


    /**
     * The Closed By.
     * The user who closed the case.
     */
    @SerializedName(value = "closedBy", alternate = {"ClosedBy"})
    @Expose
	@Nullable
    public IdentitySet closedBy;

    /**
     * The Closed Date Time.
     * The date and time when the case was closed. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     */
    @SerializedName(value = "closedDateTime", alternate = {"ClosedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime closedDateTime;

    /**
     * The External Id.
     * The external case number for customer reference.
     */
    @SerializedName(value = "externalId", alternate = {"ExternalId"})
    @Expose
	@Nullable
    public String externalId;

    /**
     * The Custodians.
     * Returns a list of case ediscoveryCustodian objects for this case.
     */
    @SerializedName(value = "custodians", alternate = {"Custodians"})
    @Expose
	@Nullable
    public com.microsoft.graph.security.requests.EdiscoveryCustodianCollectionPage custodians;

    /**
     * The Noncustodial Data Sources.
     * Returns a list of case ediscoveryNoncustodialDataSource objects for this case.
     */
    @SerializedName(value = "noncustodialDataSources", alternate = {"NoncustodialDataSources"})
    @Expose
	@Nullable
    public com.microsoft.graph.security.requests.EdiscoveryNoncustodialDataSourceCollectionPage noncustodialDataSources;

    /**
     * The Operations.
     * Returns a list of case caseOperation objects for this case.
     */
    @SerializedName(value = "operations", alternate = {"Operations"})
    @Expose
	@Nullable
    public com.microsoft.graph.security.requests.CaseOperationCollectionPage operations;

    /**
     * The Review Sets.
     * Returns a list of eDiscoveryReviewSet objects in the case.
     */
    @SerializedName(value = "reviewSets", alternate = {"ReviewSets"})
    @Expose
	@Nullable
    public com.microsoft.graph.security.requests.EdiscoveryReviewSetCollectionPage reviewSets;

    /**
     * The Searches.
     * Returns a list of eDiscoverySearch objects associated with this case.
     */
    @SerializedName(value = "searches", alternate = {"Searches"})
    @Expose
	@Nullable
    public com.microsoft.graph.security.requests.EdiscoverySearchCollectionPage searches;

    /**
     * The Settings.
     * Returns a list of eDIscoverySettings objects in the case.
     */
    @SerializedName(value = "settings", alternate = {"Settings"})
    @Expose
	@Nullable
    public EdiscoveryCaseSettings settings;

    /**
     * The Tags.
     * Returns a list of ediscoveryReviewTag objects associated to this case.
     */
    @SerializedName(value = "tags", alternate = {"Tags"})
    @Expose
	@Nullable
    public com.microsoft.graph.security.requests.EdiscoveryReviewTagCollectionPage tags;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {


        if (json.has("custodians")) {
            custodians = serializer.deserializeObject(json.get("custodians"), com.microsoft.graph.security.requests.EdiscoveryCustodianCollectionPage.class);
        }

        if (json.has("noncustodialDataSources")) {
            noncustodialDataSources = serializer.deserializeObject(json.get("noncustodialDataSources"), com.microsoft.graph.security.requests.EdiscoveryNoncustodialDataSourceCollectionPage.class);
        }

        if (json.has("operations")) {
            operations = serializer.deserializeObject(json.get("operations"), com.microsoft.graph.security.requests.CaseOperationCollectionPage.class);
        }

        if (json.has("reviewSets")) {
            reviewSets = serializer.deserializeObject(json.get("reviewSets"), com.microsoft.graph.security.requests.EdiscoveryReviewSetCollectionPage.class);
        }

        if (json.has("searches")) {
            searches = serializer.deserializeObject(json.get("searches"), com.microsoft.graph.security.requests.EdiscoverySearchCollectionPage.class);
        }

        if (json.has("tags")) {
            tags = serializer.deserializeObject(json.get("tags"), com.microsoft.graph.security.requests.EdiscoveryReviewTagCollectionPage.class);
        }
    }
}

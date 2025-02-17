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
import com.microsoft.graph.requests.DirectoryAuditCollectionPage;
import com.microsoft.graph.requests.ProvisioningObjectSummaryCollectionPage;
import com.microsoft.graph.requests.SignInCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Audit Log Root.
 */
public class AuditLogRoot extends Entity implements IJsonBackedObject {


    /**
     * The Directory Audits.
     * 
     */
    @SerializedName(value = "directoryAudits", alternate = {"DirectoryAudits"})
    @Expose
	@Nullable
    public com.microsoft.graph.requests.DirectoryAuditCollectionPage directoryAudits;

    /**
     * The Provisioning.
     * 
     */
    @SerializedName(value = "provisioning", alternate = {"Provisioning"})
    @Expose
	@Nullable
    public com.microsoft.graph.requests.ProvisioningObjectSummaryCollectionPage provisioning;

    /**
     * The Sign Ins.
     * 
     */
    @SerializedName(value = "signIns", alternate = {"SignIns"})
    @Expose
	@Nullable
    public com.microsoft.graph.requests.SignInCollectionPage signIns;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {


        if (json.has("directoryAudits")) {
            directoryAudits = serializer.deserializeObject(json.get("directoryAudits"), com.microsoft.graph.requests.DirectoryAuditCollectionPage.class);
        }

        if (json.has("provisioning")) {
            provisioning = serializer.deserializeObject(json.get("provisioning"), com.microsoft.graph.requests.ProvisioningObjectSummaryCollectionPage.class);
        }

        if (json.has("signIns")) {
            signIns = serializer.deserializeObject(json.get("signIns"), com.microsoft.graph.requests.SignInCollectionPage.class);
        }
    }
}

// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.MailDestinationRoutingReason;
import com.microsoft.graph.models.ThreatAssessmentRequest;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Email File Assessment Request.
 */
public class EmailFileAssessmentRequest extends ThreatAssessmentRequest implements IJsonBackedObject {


    /**
     * The Content Data.
     * Base64 encoded .eml email file content. The file content cannot fetch back because it isn't stored.
     */
    @SerializedName(value = "contentData", alternate = {"ContentData"})
    @Expose
	@Nullable
    public String contentData;

    /**
     * The Destination Routing Reason.
     * The reason for mail routed to its destination. Possible values are: none, mailFlowRule, safeSender, blockedSender, advancedSpamFiltering, domainAllowList, domainBlockList, notInAddressBook, firstTimeSender, autoPurgeToInbox, autoPurgeToJunk, autoPurgeToDeleted, outbound, notJunk, junk.
     */
    @SerializedName(value = "destinationRoutingReason", alternate = {"DestinationRoutingReason"})
    @Expose
	@Nullable
    public MailDestinationRoutingReason destinationRoutingReason;

    /**
     * The Recipient Email.
     * The mail recipient whose policies are used to assess the mail.
     */
    @SerializedName(value = "recipientEmail", alternate = {"RecipientEmail"})
    @Expose
	@Nullable
    public String recipientEmail;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}

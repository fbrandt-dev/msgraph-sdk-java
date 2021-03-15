// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.MeetingRequestType;
import com.microsoft.graph.models.DateTimeTimeZone;
import com.microsoft.graph.models.Location;
import com.microsoft.graph.models.EventMessage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Event Message Request.
 */
public class EventMessageRequest extends EventMessage implements IJsonBackedObject {


    /**
     * The Allow New Time Proposals.
     * True if the meeting organizer allows invitees to propose a new time when responding, false otherwise. Optional. Default is true.
     */
    @SerializedName(value = "allowNewTimeProposals", alternate = {"AllowNewTimeProposals"})
    @Expose
	@Nullable
    public Boolean allowNewTimeProposals;

    /**
     * The Meeting Request Type.
     * 
     */
    @SerializedName(value = "meetingRequestType", alternate = {"MeetingRequestType"})
    @Expose
	@Nullable
    public MeetingRequestType meetingRequestType;

    /**
     * The Previous End Date Time.
     * If the meeting update changes the meeting end time, this property specifies the previous meeting end time.
     */
    @SerializedName(value = "previousEndDateTime", alternate = {"PreviousEndDateTime"})
    @Expose
	@Nullable
    public DateTimeTimeZone previousEndDateTime;

    /**
     * The Previous Location.
     * If the meeting update changes the meeting location, this property specifies the previous meeting location.
     */
    @SerializedName(value = "previousLocation", alternate = {"PreviousLocation"})
    @Expose
	@Nullable
    public Location previousLocation;

    /**
     * The Previous Start Date Time.
     * If the meeting update changes the meeting start time, this property specifies the previous meeting start time.
     */
    @SerializedName(value = "previousStartDateTime", alternate = {"PreviousStartDateTime"})
    @Expose
	@Nullable
    public DateTimeTimeZone previousStartDateTime;

    /**
     * The Response Requested.
     * Set to true if the sender would like the invitee to send a response to the requested meeting.
     */
    @SerializedName(value = "responseRequested", alternate = {"ResponseRequested"})
    @Expose
	@Nullable
    public Boolean responseRequested;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}

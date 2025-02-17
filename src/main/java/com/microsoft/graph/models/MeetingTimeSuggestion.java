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
import com.microsoft.graph.models.AttendeeAvailability;
import com.microsoft.graph.models.Location;
import com.microsoft.graph.models.TimeSlot;
import com.microsoft.graph.models.FreeBusyStatus;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Meeting Time Suggestion.
 */
public class MeetingTimeSuggestion implements IJsonBackedObject {

    /** the OData type of the object as returned by the service */
    @SerializedName("@odata.type")
    @Expose
    @Nullable
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    @Nonnull
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Attendee Availability.
     * An array that shows the availability status of each attendee for this meeting suggestion.
     */
    @SerializedName(value = "attendeeAvailability", alternate = {"AttendeeAvailability"})
    @Expose
	@Nullable
    public java.util.List<AttendeeAvailability> attendeeAvailability;

    /**
     * The Confidence.
     * A percentage that represents the likelhood of all the attendees attending.
     */
    @SerializedName(value = "confidence", alternate = {"Confidence"})
    @Expose
	@Nullable
    public Double confidence;

    /**
     * The Locations.
     * An array that specifies the name and geographic location of each meeting location for this meeting suggestion.
     */
    @SerializedName(value = "locations", alternate = {"Locations"})
    @Expose
	@Nullable
    public java.util.List<Location> locations;

    /**
     * The Meeting Time Slot.
     * A time period suggested for the meeting.
     */
    @SerializedName(value = "meetingTimeSlot", alternate = {"MeetingTimeSlot"})
    @Expose
	@Nullable
    public TimeSlot meetingTimeSlot;

    /**
     * The Order.
     * Order of meeting time suggestions sorted by their computed confidence value from high to low, then by chronology if there are suggestions with the same confidence.
     */
    @SerializedName(value = "order", alternate = {"Order"})
    @Expose
	@Nullable
    public Integer order;

    /**
     * The Organizer Availability.
     * Availability of the meeting organizer for this meeting suggestion. The possible values are: free, tentative, busy, oof, workingElsewhere, unknown.
     */
    @SerializedName(value = "organizerAvailability", alternate = {"OrganizerAvailability"})
    @Expose
	@Nullable
    public FreeBusyStatus organizerAvailability;

    /**
     * The Suggestion Reason.
     * Reason for suggesting the meeting time.
     */
    @SerializedName(value = "suggestionReason", alternate = {"SuggestionReason"})
    @Expose
	@Nullable
    public String suggestionReason;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}

// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.DateTimeTimeZone;
import com.microsoft.graph.models.BookingsAvailabilityStatus;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Availability Item.
 */
public class AvailabilityItem implements IJsonBackedObject {

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
     * The End Date Time.
     * The end time of the time slot.
     */
    @SerializedName(value = "endDateTime", alternate = {"EndDateTime"})
    @Expose
	@Nullable
    public DateTimeTimeZone endDateTime;

    /**
     * The Service Id.
     * Indicates the service ID in case of 1:n appointments. If the appointment is of type 1:n, this field will be present, otherwise, null.
     */
    @SerializedName(value = "serviceId", alternate = {"ServiceId"})
    @Expose
	@Nullable
    public String serviceId;

    /**
     * The Start Date Time.
     * The start time of the time slot.
     */
    @SerializedName(value = "startDateTime", alternate = {"StartDateTime"})
    @Expose
	@Nullable
    public DateTimeTimeZone startDateTime;

    /**
     * The Status.
     * The status of the staff member. Possible values are: available, busy, slotsAvailable, outOfOffice, unknownFutureValue.
     */
    @SerializedName(value = "status", alternate = {"Status"})
    @Expose
	@Nullable
    public BookingsAvailabilityStatus status;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}

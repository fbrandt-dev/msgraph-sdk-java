// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.RecurrenceRangeType;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Recurrence Range.
 */
public class RecurrenceRange implements IJsonBackedObject {

    @SerializedName("@odata.type")
    @Expose
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The End Date.
     * The date to stop applying the recurrence pattern. Depending on the recurrence pattern of the event, the last occurrence of the meeting may not be this date. Required if type is endDate.
     */
    @SerializedName("endDate")
    @Expose
    public com.microsoft.graph.core.DateOnly endDate;

    /**
     * The Number Of Occurrences.
     * The number of times to repeat the event. Required and must be positive if type is numbered.
     */
    @SerializedName("numberOfOccurrences")
    @Expose
    public Integer numberOfOccurrences;

    /**
     * The Recurrence Time Zone.
     * Time zone for the startDate and endDate properties. Optional. If not specified, the time zone of the event is used.
     */
    @SerializedName("recurrenceTimeZone")
    @Expose
    public String recurrenceTimeZone;

    /**
     * The Start Date.
     * The date to start applying the recurrence pattern. The first occurrence of the meeting may be this date or later, depending on the recurrence pattern of the event. Must be the same value as the start property of the recurring event. Required.
     */
    @SerializedName("startDate")
    @Expose
    public com.microsoft.graph.core.DateOnly startDate;

    /**
     * The Type.
     * The recurrence range. The possible values are: endDate, noEnd, numbered. Required.
     */
    @SerializedName("type")
    @Expose
    public RecurrenceRangeType type;


    /**
     * The raw representation of this class
     */
    private JsonObject rawObject;

    /**
     * The serializer
     */
    private ISerializer serializer;

    /**
     * Gets the raw representation of this class
     *
     * @return the raw representation of this class
     */
    public JsonObject getRawObject() {
        return rawObject;
    }

    /**
     * Gets serializer
     *
     * @return the serializer
     */
    protected ISerializer getSerializer() {
        return serializer;
    }

    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(final ISerializer serializer, final JsonObject json) {
        this.serializer = serializer;
        rawObject = json;

    }
}

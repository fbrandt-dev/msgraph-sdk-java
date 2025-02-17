// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.google.gson.JsonObject;
import java.util.EnumSet;
import java.util.ArrayList;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Presence Set User Preferred Presence Parameter Set.
 */
public class PresenceSetUserPreferredPresenceParameterSet {
    /**
     * The availability.
     * 
     */
    @SerializedName(value = "availability", alternate = {"Availability"})
    @Expose
	@Nullable
    public String availability;

    /**
     * The activity.
     * 
     */
    @SerializedName(value = "activity", alternate = {"Activity"})
    @Expose
	@Nullable
    public String activity;

    /**
     * The expiration Duration.
     * 
     */
    @SerializedName(value = "expirationDuration", alternate = {"ExpirationDuration"})
    @Expose
	@Nullable
    public javax.xml.datatype.Duration expirationDuration;


    /**
     * Instiaciates a new PresenceSetUserPreferredPresenceParameterSet
     */
    public PresenceSetUserPreferredPresenceParameterSet() {}
    /**
     * Instiaciates a new PresenceSetUserPreferredPresenceParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected PresenceSetUserPreferredPresenceParameterSet(@Nonnull final PresenceSetUserPreferredPresenceParameterSetBuilder builder) {
        this.availability = builder.availability;
        this.activity = builder.activity;
        this.expirationDuration = builder.expirationDuration;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static PresenceSetUserPreferredPresenceParameterSetBuilder newBuilder() {
        return new PresenceSetUserPreferredPresenceParameterSetBuilder();
    }
    /**
     * Fluent builder for the PresenceSetUserPreferredPresenceParameterSet
     */
    public static final class PresenceSetUserPreferredPresenceParameterSetBuilder {
        /**
         * The availability parameter value
         */
        @Nullable
        protected String availability;
        /**
         * Sets the Availability
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public PresenceSetUserPreferredPresenceParameterSetBuilder withAvailability(@Nullable final String val) {
            this.availability = val;
            return this;
        }
        /**
         * The activity parameter value
         */
        @Nullable
        protected String activity;
        /**
         * Sets the Activity
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public PresenceSetUserPreferredPresenceParameterSetBuilder withActivity(@Nullable final String val) {
            this.activity = val;
            return this;
        }
        /**
         * The expirationDuration parameter value
         */
        @Nullable
        protected javax.xml.datatype.Duration expirationDuration;
        /**
         * Sets the ExpirationDuration
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public PresenceSetUserPreferredPresenceParameterSetBuilder withExpirationDuration(@Nullable final javax.xml.datatype.Duration val) {
            this.expirationDuration = val;
            return this;
        }
        /**
         * Instanciates a new PresenceSetUserPreferredPresenceParameterSetBuilder
         */
        @Nullable
        protected PresenceSetUserPreferredPresenceParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public PresenceSetUserPreferredPresenceParameterSet build() {
            return new PresenceSetUserPreferredPresenceParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.availability != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("availability", availability));
        }
        if(this.activity != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("activity", activity));
        }
        if(this.expirationDuration != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("expirationDuration", expirationDuration));
        }
        return result;
    }
}

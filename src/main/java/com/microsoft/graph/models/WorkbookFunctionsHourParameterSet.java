// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;

import com.microsoft.graph.models.WorkbookFunctionResult;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.google.gson.JsonObject;
import java.util.EnumSet;
import java.util.ArrayList;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Functions Hour Parameter Set.
 */
public class WorkbookFunctionsHourParameterSet {
    /**
     * The serial Number.
     * 
     */
    @SerializedName(value = "serialNumber", alternate = {"SerialNumber"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement serialNumber;


    /**
     * Instiaciates a new WorkbookFunctionsHourParameterSet
     */
    public WorkbookFunctionsHourParameterSet() {}
    /**
     * Instiaciates a new WorkbookFunctionsHourParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected WorkbookFunctionsHourParameterSet(@Nonnull final WorkbookFunctionsHourParameterSetBuilder builder) {
        this.serialNumber = builder.serialNumber;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static WorkbookFunctionsHourParameterSetBuilder newBuilder() {
        return new WorkbookFunctionsHourParameterSetBuilder();
    }
    /**
     * Fluent builder for the WorkbookFunctionsHourParameterSet
     */
    public static final class WorkbookFunctionsHourParameterSetBuilder {
        /**
         * The serialNumber parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement serialNumber;
        /**
         * Sets the SerialNumber
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsHourParameterSetBuilder withSerialNumber(@Nullable final com.google.gson.JsonElement val) {
            this.serialNumber = val;
            return this;
        }
        /**
         * Instanciates a new WorkbookFunctionsHourParameterSetBuilder
         */
        @Nullable
        protected WorkbookFunctionsHourParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public WorkbookFunctionsHourParameterSet build() {
            return new WorkbookFunctionsHourParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.serialNumber != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("serialNumber", serialNumber));
        }
        return result;
    }
}
